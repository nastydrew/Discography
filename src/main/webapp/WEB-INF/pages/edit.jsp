<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:choose>
        <c:when test="${empty discography.groupName}">
            <title>Add</title>
        </c:when>
        <c:otherwise>
            <title>Edit</title>
        </c:otherwise>
    </c:choose>
</head>
<body>
    <c:url value="/add" var="addDiscography"/>
    <c:url value="/edit" var="editDiscography"/>

    <form action="${ empty discography.groupName ? addDiscography : editDiscography}" method="POST">
        <c:if test="${!empty discography.groupName}">
            <input type="hidden" name="id" value="${discography.id}">
        </c:if>
<%--        <input hidden name="id" value="${discography.id}">--%>
        <input placeholder="Group Name" type="text" name="groupName" id="groupName" value="${discography.groupName}" >
        <input placeholder="Album Name" type="text" name="albumName" id="albumName" value="${discography.albumName}" >
        <input placeholder="Year" type="text" name="year" id="year" value="${discography.year}">
        <input placeholder="Genre" type="text" name="genre" id="genre" value="${discography.genre}">
        <input placeholder="Image will be here" disabled type="text" name="albumImage" id="albumImage" value="${discography.albumImage}">


        <c:choose>
            <c:when test="${empty discography.groupName}">
                <input type="submit" value="Add discography">
            </c:when>
            <c:otherwise>
                <input type="submit" value="Edit discography">
            </c:otherwise>
        </c:choose>
    </form>
</body>
</html>
