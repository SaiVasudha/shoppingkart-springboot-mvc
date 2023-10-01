<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

   /* Reset some default styles */
body, h1, form {
    margin: 0;
    padding: 0;
}

/* Style the body */
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    text-align: center;
    padding: 20px;
}

/* Style the form header */
h1 {
    font-size: 24px;
    color: #333;
    margin-bottom: 20px;
}

/* Style the error message */
h2 {
    color: red;
    margin-bottom: 10px;
}

/* Style the success message */
h3 {
    color: green;
    margin-bottom: 10px;
}

/* Style the form elements */
form {
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
    padding: 20px;
    margin: 20px auto;
    max-width: 400px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

/* Style the OTP input field and submit button */
input[type="number"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
}

input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 3px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}


    </style>
</head>
<body>
    <h2 style="color: red;">${fail}</h2>
    <h3 style="color: green;">${pass}</h3>
    <h1>Merchant Verify Otp</h1>
    <form action="/merchant/verify" method="post">
        <input type="hidden" name="id" value="${id}">
        Enter your otp : <input type="number" name="otp" required>
        <input type="submit" value="submit">
    </form>

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