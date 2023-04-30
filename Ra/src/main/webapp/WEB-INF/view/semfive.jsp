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
			text-align: center;
	   	  }
  .footer {
			background-color:#a28089;
			padding: 10px;
			color: white;
		   position: auto;
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
            text-align: center;
           }
</style>
</head>
<body>
<div class="header">
		<h1>RESULT ANALYSIS</h1>
</div>
<div class="box">
<div class="form-box">
<form action="semfiveinput" method="post">
<pre style="font-weight:500;font-size: 20px;white-space: pre-wrap; margin: 10;">
<label for="rollno"> ROLL NO :</label>
<input type="text" id="rollno" name="rollno" class="center"><br>
<label for="sub1" style="Trirong;" >SUB-1</label>
 <input type="text" required pattern="[0-9]+" id="sub1" name="sub1" class="center"><br>  
 <label for="sub2" style="Trirong;" >SUB-2</label>
 <input type="text" required pattern="[0-9]+" id="sub2" name="sub2" class="center"><br>
 <label for="sub3" style="Trirong;" >SUB-3</label>
 <input type="text" required pattern="[0-9]+" id="sub3" name="sub3" class="center"><br>
 <label for="sub4" style="Trirong;" >SUB-4</label>
 <input type="text" required pattern="[0-9]+" id="sub4" name="sub4" class="center"><br>
 <label for="sub5" style="Trirong;" >SUB-5</label>
 <input type="text" required pattern="[0-9]+" id="sub5" name="sub5" class="center"><br>
 <input type="submit" value="Submit">
   </pre>
   </form>
</div>
</div>
<div class="footer">
		<p>Submitted by - name</p>
		</div>
</body>
</html>