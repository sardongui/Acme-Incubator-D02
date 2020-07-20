<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-url code="anonymous.jimenez-bulletin.form.label.web" path="web"/>
	<acme:form-textarea code="anonymous.jimenez-bulletin.form.label.description" path="description"/>
	
	<acme:form-submit code="anonymous.jimenez-bulletin.form.button.create" action="/anonymous/jimenez-bulletin/create"/>
	<acme:form-return code="anonymous.jimenez-bulletin.form.button.return"/>
</acme:form>