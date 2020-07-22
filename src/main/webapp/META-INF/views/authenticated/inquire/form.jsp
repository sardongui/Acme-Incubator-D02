<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-url code="authenticated.inquire.form.label.title" path="title"/>
	<acme:form-url code="authenticated.inquire.form.label.creationDate" path="creationDate"/>
	<acme:form-url code="authenticated.inquire.form.label.endDate" path="endDate"/>
	<acme:form-url code="authenticated.inquire.form.label.description" path="description"/>
	<acme:form-url code="authenticated.inquire.form.label.minMoney" path="minMoney"/>
	<acme:form-url code="authenticated.inquire.form.label.maxMoney" path="maxMoney"/>
	<acme:form-url code="authenticated.inquire.form.label.email" path="email"/>
	
	
	
	<acme:form-return code="authenticated.inquire.form.button.return"/>
</acme:form>