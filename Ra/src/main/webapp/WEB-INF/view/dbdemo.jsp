<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN</title>
<style>
  body {
		    background-color: white;
			font-family: Arial, sans-serif;
			text-align: center;
		  }
  .header {
			background-color:#a28089;
			padding: 10px;
			color: white;
			text-align: center;
	   	  }
  .footer {
			background-color:#a28089;
			padding: 10px;
			color: white;
			position: absolute;
			margin-top:30px;
			bottom: 0;
			width: 100%;
			text-align: center;
	    	}
  .btn      {
           margin: auto;
           background-color:lightgrey;
           border-radius:10px;
           width: 150px;
           height: 50px;
           border-radius: 10px;
           border: 2px solid black;
           style= "Trirong",seri";
           style="font-size:130;
           }
  .form-box 
           {
			background-color: #51e2f5;
			width: 500px;
			margin: 0 auto;
			margin-top: 50px;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
		}
.center
          {
            margin: 30px 30px;
            text-align: center;
           }
</style>
</head>
<body>
<div class="header">
		<h1>RESULT ANALYSIS</h1>
</div>
<form id="1" action="" method="post">
<div class="box">
<div class="form-box">
         <h1 style="text-align:center;border-bottom:solid black;border-style:double;">ERROR PLZ! ENTER VALED DATA</h1>
</div>
</div>
</form>
<div class="footer">
		<p>Submitted by - name</p>
		</div>
<script type="text/javascript">
function createstudent() {
	document.getElementById('1').action='createstudent';
	document.getElementById('1').submit();
}
function createstaff() {
	document.getElementById('1').action='createstaff';
	document.getElementById('1').submit();		}
</script>
</body>
</html>