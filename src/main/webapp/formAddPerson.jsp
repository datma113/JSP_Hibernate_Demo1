<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Insert title here</title>
        <link
            rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous"
        />
    </head>
    <c:url var="saveUrl" value="/person/save"/>
    <body class="container">
        <form action="${saveUrl}"  method="post" >
            <div class="form-group">
                <label for="">id</label>
                <input
                    type="text"
                    class="form-control"
                    name="id"
                    id=""
                    aria-describedby="helpId"
                    placeholder=""
                />
            </div>
            <div class="form-group">
                <label for="">fullName</label>
                <input
                    type="text"
                    class="form-control"
                    name="fullname"
                    id=""
                    aria-describedby="helpId"
                    placeholder=""
                />
            </div>
            <div class="form-group">
                <label for="">gmail</label>
                <input
                    type="text"
                    class="form-control"
                    name="gmail"
                    id=""
                    aria-describedby="helpId"
                    placeholder=""
                />
            </div>
            <button type="submit" class="btn btn-danger">Submit</button>
        </form>
    </body>
</html>
