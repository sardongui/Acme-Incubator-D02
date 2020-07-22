<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="authenticated.inquire.list.label.title" path="title"/>
	<acme:list-column code="authenticated.inquire.form.label.creationDate" path="creationDate"/>
</acme:list>