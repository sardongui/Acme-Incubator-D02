<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="authenticated.notice.list.label.headerPicture" path="headerPicture" width="20%" />
	<acme:list-column code="authenticated.notice.list.label.title" path="title" width="20%" />
	<acme:list-column code="authenticated.notice.list.label.body" path="body" width="20%" />
	<acme:list-column code="authenticated.notice.list.label.creationMoment" path="creationMoment" width="20%" />
</acme:list>