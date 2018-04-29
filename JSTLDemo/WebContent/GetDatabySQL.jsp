<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<s:setDataSource var="c" driver="com.mysql.jdbc.Driver" 
					url="jdbc:mysql://localhost:3306/empdb"
					user="root" password="root"/>
					
<s:query var="rs" sql="select *from empinfo" dataSource="${c}"></s:query>					

<j:forEach var="data" items="${rs.rows }"><br/>

<j:out value="${data.id }"></j:out>   
<j:out value="${data.name }"></j:out>  
<j:out value="${data.dept }"></j:out>  
<j:out value="${data.email }"></j:out>
<j:out value="${data.sal }"></j:out>

</j:forEach>
					
