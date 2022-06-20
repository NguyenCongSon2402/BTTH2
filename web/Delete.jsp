

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <div>Are you sure want to delete this product ?</div>
            <label>Code:</label>
        <span>${st.code}  </span><br>
        <label>Description:</label>
        <span>${st.description}</span><br>
        <label>Price:</label>
        <span>${st.price}</span><br>
        <a href="DeleteProduct?sid=${st.code}">Yes</a>
        <a href="http://localhost:8080/DemoTH2/LoadController" target="_blank">No</a>
    </body>
</html>
