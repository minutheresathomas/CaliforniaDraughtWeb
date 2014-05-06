<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">



<title>Cali Draught</title>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-2.1.0.js"></script>
<script type="text/javascript" src="resources/scripts/mustache.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<link rel="stylesheet" type="text/css"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</head>

<body>
<div class="page-header">
  <h1>California Water Project <small><%= request.getParameter("id") %></small></h1>
</div>
	<div class="container">

		<div class="row show-grid">
			<br> <br> <br>
		</div>
		<div class="row show-grid">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="form-group">
							<h3 class="sub-header">Reservoir Information</h3>
							<div class="panel panel-default">
								<table class="table table-striped">

									<thead>
										<tr>
											<th>Reservoir#</th>
											<th>Reservoir Name</th>
											<th>County</th>
											<th>Elevation</th>
											<th>Hydrological Area</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td id="res_stationId"></td>
											<td id="res_nam"></td>
											<td id="res_county"></td>
											<td id="res_elevation"></td>
											<td id="res_hydroArea"></td>
										</tr>
									</tbody>

									<thead>
										<tr>
											<th>Latitude</th>
											<th>Longitude</th>
											<th>Near by City</th>
											<th>Operator</th>
											<th>River Basin</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td id="res_latitude"></td>
											<td id="res_longitude"></td>
											<td id="res_nearCity"></td>
											<td id="res_opera"></td>
											<td id="res_riverBasin"></td>
										</tr>
									</tbody>

								</table>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">

					<h3 class="sub-header">&nbsp;Reservoir Graph</h3>

					<div id="container_graph"
						style="min-width: 310px; height: 400px; margin: 0 auto"></div>
					
					<div class="dropdown">
						<button class="btn dropdown-toggle sr-only" type="button"
							id="dropdownMenu1" data-toggle="dropdown">
							Dropdown <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu"
							aria-labelledby="dropdownMenu1">
							<li role="presentation"><a role="menuitem" tabindex="-1"
								href="#">Action</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-body">Forecast Graph
				<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
				
				
				</div>
			</div>
		</div>
	</div>
	</div>

	<script>
		var id ="<%= request.getParameter("id") %>"; //this is the jsp expression
	</script>

	<script type="text/javascript" src="resources/scripts/app.js"></script>
	<!--this is a java script  -->
</body>
</html>