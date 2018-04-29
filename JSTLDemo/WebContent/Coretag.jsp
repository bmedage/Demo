<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var ="i" value="10"></c:set>
Value of  i : <c:out value="${i }"></c:out>
<c:if test="${i ge 10 }"><br>
<c:out value="Hello"></c:out><br>
</c:if>

<c:forEach var="x" begin="1" end="10" step="1" >

<c:out value="${x*5}"></c:out><br>
</c:forEach>

<c:set var="name">ABC,XYZ,lmn</c:set>
<c:out value="${name}"></c:out><br><br>

<c:forEach var="s" items="${name}">

<c:out value="${s}"></c:out><br>
</c:forEach>

<c:catch var="e"><br>
<%=10/0 %>
</c:catch>
<c:out value="${e }"></c:out>