$(document).ready(

function() {
	init();
}

);

var init = function() {
	$.ajax({
		url : "api/reservoir/" + id, context : document.body}).done(function(resp) {
			
		$("#res_stationId").html(resp.stationId);
		$("#res_nam").html(resp.stationName);
		$("#res_county").html(resp.county);
		$("#res_elevation").html(resp.elevation);
		$("#res_hydroArea").html(resp.hydrologicArea);
		$("#res_latitude").html(resp.latitude);
		$("#res_longitude").html(resp.longitude);
		$("#res_nearCity").html(resp.nearbyCity);
		$("#res_opera").html(resp.operator);
		$("#res_riverBasin").html(resp.riverBasin);
		drawGraph(resp);
		
	});

	var drawGraph = function(resp) {
		var json_data = resp.storageData;
		var result = [];

		for ( var i in json_data)
			result.push([ i, json_data[i] ]);

		$('#container_graph')
				.highcharts(
						{
							chart : {
								zoomType : 'x'
							},
							title : {
								text : 'Water Storage from 2010 till date'
							},
							subtitle : {
								text : document.ontouchstart === undefined ? 'Click and drag in the plot area to zoom in'
										: 'Pinch the chart to zoom in'
							},
							xAxis : {
								type : 'datetime',
								minRange : 1 * 24 * 3600000
							// one days
							},
							yAxis : {
								title : {
									text : 'Water storage in af'
								}
							},
							legend : {
								enabled : false
							},
							plotOptions : {
								area : {
									fillColor : {
										linearGradient : {
											x1 : 0,
											y1 : 0,
											x2 : 0,
											y2 : 1
										},
										stops : [
												[
														0,
														Highcharts.getOptions().colors[0] ],
												[
														1,
														Highcharts
																.Color(
																		Highcharts
																				.getOptions().colors[0])
																.setOpacity(0)
																.get('rgba') ] ]
									},
									marker : {
										radius : 2
									},
									lineWidth : 1,
									states : {
										hover : {
											lineWidth : 1
										}
									},
									threshold : null
								}
							},

							series : [ {
								type : 'area',
								name : 'water storae in af',
								data : result
							} ]
						});

	};

	$.ajax({
		url : "api/forecast/" + id, context : document.body}).done(function(resp) {
		forecastGraph(resp);
	});
	
	var forecastGraph = function(resp) {
		
		var json_data = resp.forcastData;
		var seriesData = [];
		for ( var i in json_data){
			var yearData = {};
			yearData["name"] = i;
			yearData["data"] = json_data[i];
			seriesData.push(yearData);
		}
			
		
		$('#container')
				.highcharts(
						{
							title : {
								text : 'Water storage Forecast from 2012 to 2016',
								x : 0
							// center
							},
							
							xAxis : {
								categories : [ 'Jan', 'Feb', 'Mar', 'Apr',
										'May', 'Jun', 'Jul', 'Aug', 'Sep',
										'Oct', 'Nov', 'Dec' ]
							},
							yAxis : {
								title : {
									text : 'Water Storage in af'
								},
								plotLines : [ {
									value : 0,
									width : 1,
									color : '#808080'
								} ]
							},
							tooltip : {
								valueSuffix : 'C'
							},
							legend : {
								layout : 'vertical',
								align : 'right',
								verticalAlign : 'middle',
								borderWidth : 0
							},
							series :seriesData
						});
	};

};