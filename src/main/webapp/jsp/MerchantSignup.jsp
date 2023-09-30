<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/merchantSignup.css">
</head>
<body>
    <h1>Merchant SignUp</h1>
       <h2 style="color: red;">${fail}</h2>
    <form action="/merchant/signup" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" required></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" required></td>
            </tr>
            <tr>
                <td>Mobile No:</td>
                <td><input type="number" name="mobileno" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="pwd" required></td>
            </tr>
        </table>
        <button>signup</button>
    </form>
</body>
</html>