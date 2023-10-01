<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/MerchantLogin.css">
</head>
<body>
    
    <h1>Merchant Login</h1>
    <form action="/merchant/login" method="post">
        <h3 style="color: green;">${pass}</h3>
        <h2 style="color: red">${fail}</h2>
    <table>
        <tr>
            <td>UserName:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
            <td><a href="/merchant/home"><button>Login</button></a></td>
            <td><button>Cancel</button></td>
        </tr>
    </table>
    Don't Have Account? please <a href="/merchant/signup">SignUp</a>
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