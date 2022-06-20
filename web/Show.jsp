

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <%@ taglib prefix="c"
                   uri="http://java.sun.com/jsp/jstl/core" %>
            <table border="1px solid black">
                <tr>
                    <th>Code</th>
                    <th>Description</th>
                    <th>Price</th>
                    
                </tr>  
                <c:forEach items="${listS}" var="o">
                <tr>
                    <td>${o.code}</td>
                    <td>${o.description}</td>
                    <td>${o.price}</td>
                    <td>
                        <a href="UpdateController?scode=${o.code}" >edit</a>
                         <a href="DeleteController?pcode=${o.code}">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
            <form action="Add.jsp">
                    <button type="submit"></i> Add Product</button>
                </form>
    </body>
</html>
