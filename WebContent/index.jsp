<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>California Water Monitoring</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://code.highcharts.com/maps/highmaps.js"></script>
<script src="http://code.highcharts.com/maps/modules/map.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
<script type="text/javascript" src="resources/scripts/index.js"></script>

<link href="style/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="style/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<script type="text/javascript" src="resources/scripts/cufon-yui.js"></script>
<script type="text/javascript" src="resources/scripts/cufon-aller.js"></script>
<script type="text/javascript" src="resources/scripts/script.js"></script>
<script type="text/javascript" src="resources/scripts/coin-slider.min.js"></script>

</head>
<body background="resources/images/bg1.jpg">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp"><span>Home</span></a></li>
          <li><a href="about1.jsp"><span>About</span></a></li>
          <li><a href="Effects1.jsp"><span>Effects</span></a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="index.jsp"><small style="color:#0033ff;">Save Water.... </small> <span>California Water Monitoring</span></a></h1>
      </div>
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="resources/images/d6.jpg" width="970" height="305" alt="" /> </a> <a href="#"><img src="resources/images/d5.jpg" width="970" height="305" alt="" /> </a> <a href="#"><img src="resources/images/drought1.jpg" width="970" height="305" alt="" /> </a> </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <h2 style="margin-top:30px"><span style="color:white;">California Lakes and Reservoirs</span></h2>
         
          <div class="clr"></div>
	          <div id="map-canvas" style="width: 620px; height: 620px"></div>
		          <div class="post_content">
		            <p>. <a href="#"></a> </p>
		            <p><strong></strong> </p>
		          </div>
		          
						<div class="col-md-3">
							<form method="get" action="basicform.php">
								<table>
										<tr> 
											
											<td style="margin-right:10px"><font color="#663300"> Reservoir Id: </font><input type="text" id="reservoir" name="Reservoir Id" size="10"/></td>
											<td style="padding:20px"> &nbsp&nbsp&nbsp&nbsp <button id="search" type="button" class="btn btn-primary" onclick="doNav()">Go</button> </td>
										</tr>
								</table>
							</form>
						</div>
				
	          <div class="clr"></div>
        </div>
        <div class="article">
          
          <div class="clr"></div>
        </div>
      
      </div>
      <div class="sidebar">
        
        <div class="gadget">
          <h2 class="star" style="margin-top:32px; margin-bottom:20px;"><span style="color:white;">Graphs</span> </h2>
		   <li class="gg4"><a href="storageGraph.jsp" style="color:#660000">Storage</a></li></font>
            <li class="gg4"><a href="inflowGraph.jsp" style="color:#660000">Inflow</a></li></font>
            <li class="gg4"><a href="outflowGraph.jsp" style="color:#660000">Outflow</a></li></font>
		  
          <div class="clr"></div>
        </div>
       
        <div class="gadget">
          
        </div>
        <div class="gadget">
          <h2 class="star"><span style="color:white;">Discussions</span></h2>
          <div class="clr"></div>
          <ul class="ex_menu">
            <a href="http://www.facebook.com/caldrought"><img src="resources/images/facebook.jpg" height="35px" width="35px" style="margin-right:25px;"></a>
			<a href="http://www.twitter.com/CAwaterMonitor"><img src="resources/images/twitter.jpg" height="35px" width="35px"></a>
			
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2><span style="color:#660000;">Image Gallery</span></h2>
        <a href="#"><img src="resources/images/gal1.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="resources/images/gal2.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="resources/images/gal3.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="resources/images/gal4.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="resources/images/gal5.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="resources/images/gal6.jpg" width="75" height="75" alt="" class="gal" /></a> </div>
      <div class="col c2">
       <p style="margin-right:200px"></p>
      </div>
      <div class="col c3">
        <h2><span style="color:#660000;">Contact Us</span></h2>
        
        <p class="contact_info"> <span>Address:</span> San Jose State University<br />
          <span>E-mail:</span>cmpe272@gmail.com <a href="#"></a> </p></font>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p align="center">Copyright &copy; :Team 19.  All Rights Reserved</p>
    
    </div>
  </div>
</div>
<script type="text/javascript">
function doNav()
{
	var station_id=document.getElementById("reservoir").value;
	document.location.href="reservoir3.jsp?id="+station_id;
	}
</script>
</body>
</html>
