<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world!글 보기</h1>

<form action = "update" method = "get">
    <table>
        <thead>
            <tr>
            	<button type="button" onclick="location.href='/test'">뒤로가기</button>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>       
        </thead>
        <tbody>
            
                <tr>
                    <td><input type="text" name ="id" value="${detail.id}" disabled></td>
                    <td><input type="text" name ="pw" value="${detail.pw}" ></td>
                    <td><input type="text" name ="name" value="${detail.name}" ></td>
                </tr>
        </tbody>
    </table>
    <button type="submit"> 글 수정</button>
    <button type="submit" formaction="./delete/${detail.id}" formmethod="post">삭제</button>
 </form>
 
</body>
</html>
