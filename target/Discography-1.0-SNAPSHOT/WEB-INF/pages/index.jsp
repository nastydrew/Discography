<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Discography</title>
</head>
<body>
    <h2>Discography</h2>
    <table>
      <tr>
        <th>groupName</th>
        <th>albumName</th>
        <th>year</th>
        <th>genre</th>
        <th>action</th>
      </tr>
      <c:forEach var="discography" items="${discographyList}">
          <tr>
              <td>${discography.groupName}</td>
              <td>${discography.albumName}</td>
              <td>${discography.year}</td>
              <td>${discography.genre}</td>
              <td>${discography.albumImage}</td>
              <td>
                  <a href="/edit/${discography.id}">edit</a>
                  <a href="/delete/${discography.id}">delete</a>
              </td>
          </tr>
      </c:forEach>
    </table>
    <c:url value="/add" var="add"/>
    <a href="${add}">Add new discography</a>
</body>
</html>
