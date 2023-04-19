<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<form th:object="${client}" th:action="@{/submit}" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" th:field="*{name}"/>
    <label for="phoneNumber">Phone Number:</label>
    <input type="text" id="phoneNumber" th:field="*{phoneNumber}"/>
    <label for="NIP">NIP:</label>
    <input type="text" id="NIP" th:field="*{NIP}"/>
    <label for="address">Address:</label>
    <input type="text" id="address" th:field="*{address}"/>
    <label for="city">City:</label>
    <input type="text" id="city" th:field="*{city}"/>
    <button type="submit">Wyślij</button>
</form>

</html>
