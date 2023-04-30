<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL</title>
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
			postion:auto;
			margin-top:20px;
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
<link>
<body>
<div class="header">
		<h1>RESULT ANALYSIS</h1>
</div>
<form id="1" action="" method="post">
<div class="box">
<div class="form-box">
      <h1 style="text-align:center;border-bottom:solid black;border-style:double;">STUDENT</h1>
<div class="center">
   
       <button class="btn" onclick="sem1()">SEMESTER-1</button><br>
       
       </div>
<div class="center">
       
    
       <button class="btn" onclick="sem2()">SEMESTER-2</button><br>
       
       </div>
<div class="center">

       <button class="btn" onclick="sem3()">SEMESTER-3</button><br>
       
       </div>
<div class="center">

       <button class="btn" onclick="sem4()">SEMESTER-4</button><br>
       
       </div>
<div class="center">

       <button class="btn" onclick="sem5()">SEMESTER-5</button><br>
       
       </div>
</div>
</div>
</form>
<div class="footer">
		<p>Submitted by - name</p>
		</div>
<script type="text/javascript">
function sem1() {
	document.getElementById('1').action='semester1';
	document.getElementById('1').submit();
}
function sem2() {
	document.getElementById('1').action='semester2';
	document.getElementById('1').submit();
	}
function sem3() {
	document.getElementById('1').action='semester3';
	document.getElementById('1').submit();
}
function sem4() {
	document.getElementById('1').action='semester4';
	document.getElementById('1').submit();
}
function sem5() {
	document.getElementById('1').action='semester5';
	document.getElementById('1').submit();
}
</script>
</body>
</html>
