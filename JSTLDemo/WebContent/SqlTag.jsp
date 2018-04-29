<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<s:setDataSource var="c" driver="com.mysql.jdbc.Driver" 
					url="jdbc:mysql://localhost:3306/empdb"
					user="root" password="root"/>
<s:update dataSource="${c}" var="count" 
						sql="insert into empinfo values(0,'abcd','asdsd','v@m.cm','4545')"></s:update>
						
						
<h1><c:out value="${count}"></c:out >: Rows inserted</h1>	

To view<a href="GetDatabySQL.jsp">Click</a>
						
						
						
						
						
						
						
						
						
											