
//This is JSP class that holds JAVA and HTML together for the UI of the web page
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Register</title>
</head>
<body>
<div align="center">
    <h1> Product Registration </h1>
    <form action=" <%= request.getContextPath() %>/product" method="post">
        <table style="width: 80%">
            <tr>
                <td>
                    First Name
                </td>
                <td>
                    <input type="text" name="ProductName">
                </td>
            </tr>
            <tr>
                <td>
                    Price
                </td>
                <td>
                    <input type="text" name="ProductPrice">
                </td>
            </tr>
        </table>
        <input type="submit" value="submit" />

    </form>



</div>



</body>

</html>