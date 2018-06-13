<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Updated Totals in each bucket</h2>
      <table>
         <tr>
            <td>Name:</td>
            <td>${name}</td>
         </tr>
          <tr>
            <td>CurrentAmount</td>
            <td>${currentAmount}</td>
         </tr>
         <tr>
            <td>Payment Amount:</td>
            <td>${paymentAmount}</td>
         </tr>
         <tr>
            <td>Goal Amount:</td>
            <td>${goalAmount}</td>
         </tr>
         <tr>
         	 <td>New Amount</td>
            <td>${newAmount}</td>
         </tr>
        
      </table>  
   </body>
   
</html>