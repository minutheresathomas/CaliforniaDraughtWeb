$(document).ready(

function() {
	
	init();
}

);
var init = function() {
	var json_response_yearly = "";
	var json_response_monthly = "";
	
$.ajax({
		url : "api/home/monthlyReportOutflow", context : document.body}).done(function(resp) {
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
				monthlyStorage10.push([json_response_monthly[i].averageOutflow ]);
			else if(json_response_monthly[i]._id.indexOf("2011") > -1)
				monthlyStorage11.push([json_response_monthly[i].averageOutflow ]);
			else if(json_response_monthly[i]._id.indexOf("2012") > -1)
				monthlyStorage12.push([json_response_monthly[i].averageOutflow ]);
			else if(json_response_monthly[i]._id.indexOf("2013") > -1)
				monthlyStorage13.push([json_response_monthly[i].averageOutflow ]);
			else if(json_response_monthly[i]._id.indexOf("2014") > -1)
				monthlyStorage14.push([json_response_monthly[i].averageOutflow ]);
		}
	
	$('#container').highcharts({
        chart: {
            type: 'areaspline'
        },
        title: {
            text: 'Average Outflow in each year (CA)'
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 400,
            y: 50,
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
            name: 'Monthly Outflow - 2010',
            data: monthlyStorage10
        }, {
        	name: 'Monthly Outflow - 2011',
            data: monthlyStorage11
        }, {
        	name: 'Monthly Outflow - 2012',
            data: monthlyStorage12
        }, {
        	name: 'Monthly Outflow - 2013',
            data: monthlyStorage13
        }, {
        	name: 'Monthly Outflow - 2014',
            data: monthlyStorage14
        }]
    });
};
 
$.ajax({
	url : "api/home/yearlyOutflowReport", context : document.body}).done(function(resp) {
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
			yearlyStorage10 = json_response_yearly[i].averageOutflow;
		else if(json_response_yearly[i]._id.indexOf("2011") > -1)
			yearlyStorage11 = json_response_yearly[i].averageOutflow;
		else if(json_response_yearly[i]._id.indexOf("2012") > -1)
			yearlyStorage12 = json_response_yearly[i].averageOutflow ;
		else if(json_response_yearly[i]._id.indexOf("2013") > -1)
			yearlyStorage13 = json_response_yearly[i].averageOutflow ;
		}
	

$('#container_yearly').highcharts({
	
    chart: {
        plotBackgroundColor: null,
        plotBorderWidth: null,
        plotShadow: false
    },
    title: {
        text: 'Yearly Outflow - 2010-2013'
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
        name: 'Outflow Content',
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