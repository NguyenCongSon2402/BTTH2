

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AddController" method="post">
            <p class="text-danger">${mess}</p>
            <table>
                <tr>
                    <td>Product Code</td>
                    <td>
                        <input type="number" name="code" required="" autofocus="">
                    </td>
                </tr>
                <tr>
                    <td>Product Description</td>
                    <td>
                        <input type="text" name="description" required="" autofocus="">
                    </td>
                </tr>
                <tr>
                    <td>Product Price</td>
                    <td><input type="number" name="price" required="" autofocus=""</td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Add Product</button></td>
                </tr>
            </table>
        </form>
            <a href="http://localhost:8080/DemoTH2/LoadController" target="_blank">View Product</a>
    </body>
</html>
