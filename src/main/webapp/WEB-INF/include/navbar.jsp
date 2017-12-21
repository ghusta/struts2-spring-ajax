<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- Fragment JSP --%>
<nav class="nav nav-pills">
    <a class="nav-item nav-link" href="<s:url action="index"/>">Home</a>
    <a class="nav-item nav-link" href="<s:url action="displayList"/>">List</a>
    <a class="nav-item nav-link" href="<s:url action="displaySelectList"/>">Selection</a>
    <a class="nav-item nav-link" href="<s:url namespace="ajax" action="getAjaxList" />">
        <i class="fa fa-plug fa-2x" aria-hidden="true"></i> Ajax !</a>

    <a class="nav-item nav-link" href="<s:url namespace="config-browser" action="index"/>">
        <i class="fa fa-cogs fa-2x" aria-hidden="true"></i> Config Browser</a>

</nav>
