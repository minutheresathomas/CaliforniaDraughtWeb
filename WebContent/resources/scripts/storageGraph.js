$(document).ready(

function() {
	
	init();
}

);
var init = function() {
	var json_response_yearly = "";
	var json_response_monthly = "";
	var json_response_monthly_forecast = "";


$.ajax({
		url : "api/home/monthlyReport", context : document.body}).done(function(resp) {
			json_response_monthly = resp;
			drawMonthly();
	});

var drawMonthly = function() {
	var monthlyStorage10 = [];
	var monthlyStorage11 = [];
	var monthlyStorage12 = [];
	var monthlyStorage13 = [];
	var monthlyStorage14 = [];
	
	for ( var i in json_response_monthly)
		{
			if(json_response_monthly[i]._id.indexOf("2010") > -1)
				monthlyStorage10.push([json_response_monthly[i].averagecapacity ]);
			else if(json_response_monthly[i]._id.indexOf("2011") > -1)
				monthlyStorage11.push([json_response_monthly[i].averagecapacity ]);
			else if(json_response_monthly[i]._id.indexOf("2012") > -1)
				monthlyStorage12.push([json_response_monthly[i].averagecapacity ]);
			else if(json_response_monthly[i]._id.indexOf("2013") > -1)
				monthlyStorage13.push([json_response_monthly[i].averagecapacity ]);
			else if(json_response_monthly[i]._id.indexOf("2014") > -1)
				monthlyStorage14.push([json_response_monthly[i].averagecapacity ]);
		}
	
	$('#container').highcharts({
        chart: {
            type: 'areaspline'
        },
        title: {
            text: 'Analysis in Average Water Storage in each year'
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 400,
            y: 200,
            floating: true,
            borderWidth: 1,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
        },
        xAxis: {
            categories: [
                'Jan',
                'Feb',
                'Mar',
                'Apr',
                'May',
                'Jun',
                'Jul',
                'Aug',
                'Sep',
                'Oct',
                'Nov',
                'Dec'
            ],
            plotBands: [{ // visualize the weekend
                from: 4.5,
                to: 6.5,
                color: 'rgba(68, 170, 213, .2)'
            }]
        },
        yAxis: {
            title: {
                text: 'Capacity units'
            }
        },
        tooltip: {
            shared: true,
            valueSuffix: ' units'
        },
        credits: {
            enabled: false
        },
        plotOptions: {
            areaspline: {
                fillOpacity: 0.5
            }
        },
        series: [{
            name: 'Monthly Storage Data - 2010',
            data: monthlyStorage10
        }, {
        	name: 'Monthly Storage Data - 2011',
            data: monthlyStorage11
        }, {
        	name: 'Monthly Storage Data - 2012',
            data: monthlyStorage12
        }, {
        	name: 'Monthly Storage Data - 2013',
            data: monthlyStorage13
        }, {
        	name: 'Monthly Storage Data - 2014',
            data: monthlyStorage14
        }]
    });
};



$.ajax({
	url : "api/home/monthlyForecastReport", context : document.body}).done(function(resp) {
		json_response_monthly_forecast = resp;
		drawMonthlyForecast();
});

var drawMonthlyForecast = function() {
	
	var monthlyStorageForecast = [];
	var months = [];
	
	for(var i in json_response_monthly_forecast)
	{
		monthlyStorageForecast.push(json_response_monthly_forecast[i].averagecapacity);
		months.push(json_response_monthly_forecast[i]._id);
	}
	
    $('#container-forecast').highcharts({
    title: {
        text: 'Monthly Forecast',
        x: -20 //center
    },
    subtitle: {
        text: 'California Drought Forecast 2014-2015',
        x: -20
    },
    xAxis: {
        categories: months
    },
    yAxis: {
        title: {
            text: 'Capacity (af)'
        },
        plotLines: [{
            value: 0,
            width: 1,
            color: '#808080'
        }]
    },
    tooltip: {
        valueSuffix: 'in af'
    },
    legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
    },
    series: [{
        name: 'Forecast',
        data: monthlyStorageForecast
    }
    ]
    });
};

$.ajax({
	url : "api/home/yearlyStorageReport", context : document.body}).done(function(resp) {
		json_response_yearly = resp;
		drawYearly();
});

var drawYearly = function() {
	
	var yearlyStorage10 = "";
	var yearlyStorage11 = "";
	var yearlyStorage12 = "";
	var yearlyStorage13 = "";
	for (var i in json_response_yearly)
		{
		if(json_response_yearly[i]._id.indexOf("2010") > -1)
			yearlyStorage10 = json_response_yearly[i].averagecapacity;
		else if(json_response_yearly[i]._id.indexOf("2011") > -1)
			yearlyStorage11 = json_response_yearly[i].averagecapacity;
		else if(json_response_yearly[i]._id.indexOf("2012") > -1)
			yearlyStorage12 = json_response_yearly[i].averagecapacity ;
		else if(json_response_yearly[i]._id.indexOf("2013") > -1)
			yearlyStorage13 = json_response_yearly[i].averagecapacity ;
		}
	

$('#container_yearly').highcharts({
	
    chart: {
        plotBackgroundColor: null,
        plotBorderWidth: null,
        plotShadow: false
    },
    title: {
        text: 'Yearly Storage Data Analysis - 2010-2013'
    },
    tooltip: {
	    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
    },
    plotOptions: {
        pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
                enabled: true,
                format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                style: {
                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                }
            }
        }
    },
    series: [{
        type: 'pie',
        name: 'Inflow Content',
        data: [
            ['2010',  yearlyStorage10 ],
            ['2011',     yearlyStorage11 ],
            {
                name: '2012',
                y: yearlyStorage12,
                sliced: true,
                selected: true
            },
            ['2013',    yearlyStorage13]
        ]
    }]
});

};

};