<html>
<head>

<title>California Draught</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script type="text/javascript" src="resources/scripts/home.js"></script>

	<script src="http://code.highcharts.com/maps/highmaps.js"></script>
	<script src="http://code.highcharts.com/maps/modules/map.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
	<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class="row show-grid">
			<div class="col-md-8">
			
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="form-group">
							<h3 class="sub-header">Reservoir Information</h3>
							<div class="panel panel-default">
							
							<div id="map-canvas" style="width: 690px; height: 690px"></div> 
							<br><br>
							<br><br>
							<div id="container" style="width: 690px; height: 340px; margin: 0 auto"></div>
							<br><br>
							<br><br>
							<div id="container-forecast" style="width: 690px; height: 340px; margin: 0 auto"></div>
							</div>
						</div>

					</div>
				</div>
			</div>
			<br><br>
			<br><br>
			<div class="col-md-3">
				<div class="panel panel-default">
						<form method="get" action="basicform.php">
						<table>
								<tr> 
									<td> Reservoir Id: <input type="text" id="reservoir" name="Reservoir Id" size="10" /> <br/> </td>
									<td> <button id="search" type="button" class="btn btn-primary">Go</button> </td>
								</tr>
								</table>
						</form>
					</div>
			</div>
	</div>
</div>	
	
</body>

</html>