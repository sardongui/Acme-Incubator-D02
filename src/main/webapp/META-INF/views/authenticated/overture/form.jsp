<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.overture.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.overture.form.label.moment" path="moment"/>
	<acme:form-moment code="authenticated.overture.form.label.deadline" path="deadline"/>
	<acme:form-textarea code="authenticated.overture.form.label.description" path="description"/>
	<acme:form-textbox code="authenticated.overture.form.label.email" path="email"/>
	<acme:form-money code="authenticated.overture.form.label.minMoney" path="minMoney"/>
	<acme:form-money code="authenticated.overture.form.label.maxMoney" path="maxMoney"/>
	
	<acme:form-return code="authenticated.overture.form.button.return"/>
</acme:form>