<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
	<h2>Enter Budget Breakdown Amounts</h2>
	<form:form method="POST" action="/BudgetBreakdown/updateBuckets">
		<!-- the get page -->
		<table>
			<tr>
				<td><form:label path="name">Car Insurance</form:label></td>
				
			</tr>
			<tr>
				<td><form:label path="paymentAmount">Payment Amount</form:label></td>
				<td><form:input path="paymentAmount" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>


	</form:form>
</body>

</html>