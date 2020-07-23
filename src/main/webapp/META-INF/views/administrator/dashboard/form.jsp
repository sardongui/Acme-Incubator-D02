<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
    <acme:form-textbox code="administrator.dashboard.form.label.numberNotices" path="numberNotices" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberTechnologies" path="numberTechnologies" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberTools" path="numberTools" />
    
    <acme:form-textbox code="administrator.dashboard.form.label.minMoneyActiveInquires" path="minMoneyActiveInquires" />
    <acme:form-textbox code="administrator.dashboard.form.label.maxMoneyActiveInquires" path="maxMoneyActiveInquires" />
    <acme:form-textbox code="administrator.dashboard.form.label.averageMoneyActiveInquires" path="averageMoneyActiveInquires" />
    <acme:form-textbox code="administrator.dashboard.form.label.stddevMoneyActiveInquires" path="stddevMoneyActiveInquires" />
    
    
    
    
    <acme:form-textbox code="administrator.dashboard.form.label.minMoneyActiveOvertures" path="minMoneyActiveOvertures" />
    <acme:form-textbox code="administrator.dashboard.form.label.maxMoneyActiveOvertures" path="maxMoneyActiveOvertures" /> 
    <acme:form-textbox code="administrator.dashboard.form.label.averageMoneyActiveOvertures" path="averageMoneyActiveOvertures" />
    <acme:form-textbox code="administrator.dashboard.form.label.stddevMoneyActiveOvertures" path="stddevMoneyActiveOvertures" />
    
    <acme:form-return code="administrator.dashboard.form.button.return" />
</acme:form>