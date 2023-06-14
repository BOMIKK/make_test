<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world! 글쓰기</h1>
 
 <form action = "regist" method = "get">
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            
                <tr>
                    <td><input type="text" name ="id"></td>
                    <td><input type="text" name ="pw"></td>
                    <td><input type="text" name ="name"></td>
                </tr>
            
        </tbody>
    </table>
    
    <button type="submit"> 작성</button>
    </form>
 
 
</body>
</html>
