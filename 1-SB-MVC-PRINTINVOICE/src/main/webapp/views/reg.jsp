<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1> Print invoice</h1>
<html>
<body>
<form:form modelAttribute="product" action="/printinvoice">
Product id:<form:input path="pid"/><br>
Product name:<form:input path="pname"/><br>
Product Quantity<form:input path="quantity"/><br>
Product price<form:input path="price"/><br>
<input type="submit" value="printinvoice"/>

</form:form>
</body>

</html>
