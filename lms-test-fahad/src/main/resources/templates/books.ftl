<!DOCTYPE html>
<html lang="en">
<head>
  <title>Books List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Books Detail</h2>
  <p>Following are the books registered with the library</p>            
  <table class="table table table-bordered">
    <thead>
      <tr>
        <th>Book Title</th>
        <th>Author</th>
        <th>ISBN</th>
        <th>Available</th>
      </tr>
    </thead>
    <tbody>
    <#list books as book>
      <tr>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
        <td>${book.isAvailable}</td>
      </tr>
      </#list>
    </tbody>
  </table>
</div>

</body>
</html>