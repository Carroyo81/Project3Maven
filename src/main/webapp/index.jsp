<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Example of Bootstrap 3 Vertical Form Layout</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <style type="text/css">
        .bs-example{
            margin: 20px;
        }
    </style>
</head>
<body>
<div class="bs-example">
    <form action="http://localhost:8080/Project3Maven/webapi/myresource/customers" method="post">
        
         <div class="form-group">
            <label for="userName">User Name</label>
            <input type="text" class="form-control" id="inputUserName" name="inputUserName" placeholder="User Name">
        </div>
        <div class="form-group">
            <label for="emailAddresss">Email</label>
            <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="firstName">First Name</label>
            <input type="text" class="form-control" id="inputFirstName" name="inputFirstName" placeholder="First Name">
        </div>
         <div class="form-group">
            <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="inputLastName" name="inputLastName" placeholder="Last Name">
        </div>
        
        <button type="submit" class="btn btn-primary">Create</button>
    </form>
</div>
    <a href="webapi/myresource/allcust" class="btn btn-primary">All Customers</a>
</body>
</html>                   