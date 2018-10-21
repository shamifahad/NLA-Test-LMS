<!DOCTYPE html>
<html lang="en">
<head>
  <title>Members List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <script>
	$(document).ready(function() {
		$("button").click(function() {
			var formData = {id : $(this).val()}
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "/getRecord",
				data : JSON.stringify(formData),
				dataType : 'json',
				success: function(result){
					if(result.status == "Done"){
						$('#getResultDiv ul').empty();
						$.each(result.bookList, function(i, book){
							var book = "- Book with Title = " + book.title + "and Author = " + book.author + "<br>";
							$('#getResultDiv .list-group').append(book)
				        }); 
						console.log("Success: ", result);
					}else{
						$('#getResultDiv .list-group').html("<strong>"+result.status+"</strong>");
					}
				},
				error : function(e) {
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("ERROR: ", e);
				}
			});	
		});
	});
	
  </script>
</head>
<body>

<div class="container">
  <h2>Member Details</h2>
  <p>Following are the members already registered</p>            
  <table class="table table table-bordered">
    <thead>
      <tr>
        <th>Name</th>
        <th>Phone Number</th>
        <th>Email</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <#list members as member>
      <tr>
        <td>${member.name}</td>
        <td>${member.phoneNumber}</td>
        <td>${member.emailAddress}</td>
        <td><button type="button" name="borrowedBooks" value="${member.id}" onclick="showBorrowedBooks(this)" class="btn btn-outline-info">Show Borrowed Books</button></td>
      </tr>
      </#list>
    </tbody>
  </table>
</div>
	<div class="col-sm-7" style="margin:20px 0px 20px 0px">
		<div id="getResultDiv" style="padding:20px 10px 20px 50px">
	        <ul class="list-group">
	    	</ul>
    	</div>
	</div>
</body>
</html>