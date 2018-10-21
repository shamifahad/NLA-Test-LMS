<!DOCTYPE html>
<html lang="en">
<head>
  <title>Simple Library Management System</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <script>
$(document).ready(function(){
 	$("button").click(function(){
 		var navigateTo = $(this).val();
        if(navigateTo=="showMembers"){
        	document.forms[0].action= "/showMembers";
        	document.forms[0].submit;
        }else if(navigateTo=="showBooks"){
        	document.forms[0].action= "/showBooks";
        	document.forms[0].submit;
        }
    });
});
</script>
</head>
<body>
<form action="" method="post">
<div class="container-fluid">
  <h1>Welcome To Simple Library Management System</h1>
  <div class="p-3">
  	<p>Click one of the following to see relevant operation</p>
  </div> 
</div>
<div class="container-fluid">
	<div class="ml-3">
		<button type="submit" name="memberButton" value="showMembers" onclick="navigateTo(this)" class="btn btn-outline-light text-dark">
			<p class="font-weight-bold">
				Click here to see List of Members
			</p>
		</button>
	</div>
</div>
<div class="container-fluid">
	<div class="p-3">
		<button type="submit" name="bookButton" value="showBooks" onclick="navigateTo(this)" class="btn btn-outline-light text-dark">
			<p class="font-weight-bold">
				Click here to see List of Books
			</p>
		</button>
	</div>
</div>
</form>
</body>
</html>