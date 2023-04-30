<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
body {       background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReR7Q0Pg1RZpBH0H4UO9oy6WwkgwwtQwk16Q&usqp=CAU");
		    background-color: white;
		      background-repeat: no-repeat;
            background-size: cover;
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
			position :absolute;
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
<div class="box">
<div class="form-box">

<label for="rollno"> ROLL NO :</label>${rollno}
<br><br>
${sem}
<br><br>
<label for="lname">SUBJECT 1 :   </label>${sub1}
<br><br>
<label for="lname">SUBJECT 2 :   </label>${sub2}
<br><br>
<label for="lname">SUBJECT 3 :   </label>${sub3}
<br><br>
<label for="lname">SUBJECT 4 :   </label>${sub4}
<br><br>
<label for="lname">SUBJECT 5 :   </label>${sub5}
<br><br>

</div>    
</div>
<div class="footer">
		<p>Submitted by - name</p>
		</div>
</body>
</html>