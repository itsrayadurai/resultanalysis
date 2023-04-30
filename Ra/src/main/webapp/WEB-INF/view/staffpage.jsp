<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
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
		}

		.footer {
			background-color:#a28089;
			padding: 10px;
			color: white;
			position: absolute;
			bottom: 0;
			width: 100%;
		}
		.box:hover {
			transform: scale(1.05);
			box-shadow: 0px 0px 15px #cccccc;
			}
.btn{
         margin: auto;
         background-color:lightgrey;
         width: 150px;
         height: 50px;
         border-radius: 2px;
         border: 2px solid black;
         style= "Trirong", serif;
         style="font-size:130%;

}

		.form-box {
			background-color: #51e2f5;
			width: 500px;
			margin: 0 auto;
			margin-top: 50px;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
		}
}
.center {
  margin: 30px 30px;
  text-align: center;
}
</style>
</head>
<body>
<div class="header">
		<h1>RESULT ANALYSIS</h1>
	</div>
<div class="form-box">
<div class="box">
<h1 style="text-align:center;border-bottom: solid black;border-style: double ;">STAFF PORTAL</h1>
<p class="double"></p>
<form id="1" action="" method="post">
<div class="center">

<button class="btn" onclick="createstudent()">UPDATE MARK</button>

</div><br>
<div class="center">

<button class="btn" onclick="createstaff()">VIEW RESULT</button>

</div><br>
</form>
</div>
</div>
<div class="footer">
		<p>Submitted by - name</p>
	</div>
<script type="text/javascript">
function createstudent() {
	document.getElementById('1').action='updatemark';
	document.getElementById('1').submit();
}
function createstaff() {
	document.getElementById('1').action='viewresult';
	document.getElementById('1').submit();		}
</script>
</body>
</html>