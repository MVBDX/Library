<%--
  Created by IntelliJ IDEA.
  User: mohammad
  Date: 9/12/20
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add new book to library</title>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>MVBDX Book library</h2>
    </div>
</div>

<div id="container">
    <h3>Save Book</h3>


    <form:form action="saveBook" modelAttribute="book" method="POST">

        <!-- need to associate this data with book id -->
        <form:hidden path="id" />

        <table>
            <tbody>

                <tr>
                    <td><label>ID:</label></td>
<%--                    <td><form:input path="id" disabled="true"/></td>--%>
                </tr>

                <tr>
                    <td><label>Name:</label></td>
                    <td><form:input path="title"/></td>
                </tr>

                <tr>
                    <td><label>Original Title:</label></td>
                    <td><form:input path="originalTitle"/></td>
                </tr>
                    <%--    Publisher publisher--%>
                <tr>
                    <td><label>Printing:</label></td>
                    <td><form:input path="printing"/></td>
                </tr>

                <tr>
                    <td><label>Year:</label></td>
                    <td><form:input path="publishedYear"/></td>
                </tr>

                <tr>
                    <td><label>Original Pub. year:</label></td>
                    <td><form:input path="originalPubYear"/></td>
                </tr>

                <tr>
                    <td><label>Price:</label></td>
                    <td><form:input path="price"/></td>
                </tr>

                    <%--    //genre_id--%>
                    <%--    //formatId--%>

                <tr>
                    <td><label>Pages no:</label></td>
                    <td><form:input path="pagesNo"/></td>
                </tr>

                <tr>
                    <td><label>Purchased date:</label></td>
                    <td><form:input path="purchasedDate"/></td>
                </tr>

                    <%--    purchasedLocationId--%>

                <tr>
                    <td><label>Description:</label></td>
                    <td><form:input path="description"/></td>
                </tr>

                <tr>
                    <td><label>Added date:</label></td>
                    <td><form:input path="addedDate"/></td>
                </tr>

                <tr>
                    <label></label></td>
                    <td><input type="submit" value="Save" class="save"></td>
                </tr>

            </tbody>
        </table>

    </form:form>

    <div style="clear; both;"></div>
    <p>
        <a href="${pageContext.request.contextPath}/book/list">Back to list</a>
    </p>

</div>

</body>
</html>
