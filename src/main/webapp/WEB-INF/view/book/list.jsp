<%--
  Created by IntelliJ IDEA.
  User: mohammad
  Date: 9/15/20
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books list</title>

    <!-- reference our style sheet -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>Library - Book List</h2>
        </div>

    </div>

    <div id="container">
        <div id="content">

            <!-- add a new button -->
            <input type="button" value="Add book"
                    onclick="window.location.href='showFormForAdd';  return false;"
                    class="add-button"/>

            <!-- add out html table here -->
            <table>
                <tr>
                    <th>Title</th>
                    <th>Original title</th>
                    <th>Printing</th>
                    <th>Action</th>
                </tr>

                <c:forEach var="tempBook" items="${books}">
                    <!-- construct an update link with book id -->
                    <c:url var="updateLink" value="/book/showFormForUpdate">
                        <c:param name="bookId" value="${tempBook.id}"/>
                    </c:url>

                    <c:url var="deleteLink" value="/book/delete">
                        <c:param name="bookId" value="${tempBook.id}"/>
                    </c:url>

                    <tr>
                        <td>${tempBook.title}</td>
                        <td>${tempBook.originalTitle}</td>
                        <td>${tempBook.printing}</td>
                        <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}"
                               onclick="if (!(confirm('Are you sure to delete this Book?'))) return false">Delete</a>
                        </td>
                    </tr>

                </c:forEach>
            </table>

        </div>
    </div>
</body>
</html>
