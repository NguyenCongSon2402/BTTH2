

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DeleteController" method="post">
            <p class="text-danger">${mess}</p>
            <label>Code:</label>
        <span>${st.code}  </span><br>
        <label>Description:</label>
        <span>${st.description}</span><br>
        <label>Price:</label>
        <span>${st.price}</span><br>
        <a href="#" onclick="showMess(${st.code})">delete</a>
        <script>
                function showMess(code){
                    var option = confirm("Are you sure wanto to delete this product ?")
                    if(option===true){
                        window.location.href='DeleteController?sid='+code;  
                        window.open('http://localhost:8080/DemoTH2/LoadController','_blank');
                    }
                    if(option===false){
                        window.open('http://localhost:8080/DemoTH2/LoadController','_blank');
                    }
                    
                        
                }
                </script>
        
        </form>
        
    </body>
</html>
