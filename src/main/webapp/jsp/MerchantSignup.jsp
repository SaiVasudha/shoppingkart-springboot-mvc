<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>merchant signup</title>
    <link rel="stylesheet" href="../css/merchantSignup.css">
</head>
<body>
    <h1>Merchant SignUp</h1>
    <form action="/merchant/signup" method="post">
        <h2 style="color: red;">${fail}</h2>
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
                <td>DOB:</td>
                <td><input type="date" name="dob" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="pwd" required></td>
            </tr>
        </table>
        <button>signup</button>
    </form>

    <a href="/"><button>Back</button></a>


    <script>
        setTimeout(function () {
            var h2Element = document.querySelector("h2");
            var h3Element = document.querySelector("h3");
            if (h2Element) {
                h2Element.style.display = "none";
            }
            if (h3Element) {
                h3Element.style.display = "none";
            }
        }, 1000);
    </script>
</body>
</html>