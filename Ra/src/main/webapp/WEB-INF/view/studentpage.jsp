<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
  body 
        {
			background-color: white;
			font-family: Arial, sans-serif;
			text-align: center;
		}
 .header
		 {
			background-color:#a28089;
			padding: 10px;
			color: white;
		}
		
.footer    {
			background-color:#a28089;
			padding: 10px;
			color: white;
			position: absolute;
			bottom: 0;
			width: 100%;
			text-align: center;
		   }
.box:hover {
			transform: scale(1.05);
			}	
.btn
          {
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
 .form-box {
			background-color: #51e2f5;
			width: 500px;
			margin: 0 auto;
			margin-top: 50px;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
		    }
.center    {
            margin: 30px 30px;
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
   <form action="seemark" method ="post">
    <h1 style="text-align:center;border-bottom: solid black;border-style: double;"> STUDENT</h1>
    <div class="center">
    <label for="rollno">ROLL NO :</label>
    <input type="text" required pattern="[0-9]+" id="rollno" name="rollno" class="center"><br>
    <label for="sem" style="Trirong;" >VIEW MARK :</label>
    <select id="sem" name="sem">
    <option value="semester1">semester-1</option>
    <option value="semester2">semester-2</option>
    <option value="semester3">semester-3</option>
    <option value="semester4">semester-4</option>
    <option value="semester5">semester-5</option>
    </select><br><br>
    <button type="submit" value="Submit">Submit</button>
    </div>
    </form>
    </div>
    </div>
<div class="footer">
		<p>Submitted by - name</p>
	</div>
</body>
</html>