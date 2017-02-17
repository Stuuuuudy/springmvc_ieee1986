<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<P>  List Data ${listData.get(0)}. </P>
<P>  List Data ${listData.get(1)}. </P>
<P>  List Data ${listData.get(2)}. </P>

<P>  Map Data ${mapData.key1}. </P>
<P>  Map Data ${mapData.key2}. </P>
<P>  Map Data ${mapData.key3}. </P>

<P>  User Data ${userData.id}. </P>
<P>  User Data ${userData.name}. </P>

</body>
</html>
