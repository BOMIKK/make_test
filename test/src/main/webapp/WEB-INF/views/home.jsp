<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="resources/js/home.js"></script>
</head>
<body>
    <h1>전체 글보기</h1>
 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>글쓰기</th>
                <button type="button" onclick="location.href='./add'">글작성</button>
                <form action="/search" method="get">
				  <input type="text" name="searchText" placeholder="일반 검색어를 입력하세요" />
				  <button type="submit">일반 검색</button>
				</form>
                <form action="/searchAll" method="get">
                	<input type="text" name="searchAllText" placeholder="전체 검색어를 입력하세요" />
				    <button type="submit">전체 검색</button>
                </form>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td><a href="one.do/${member.id}">${member.id}</a></td>
                    <td>${member.pw}</td>
                    <td>${member.name}</td>
                </tr>
            </c:forEach>
        </tbody>
        <form id="checkForm" name="checkForm">
        <input type="checkbox" name="mcode" id="mcode" value="00">전체
        <input type="checkbox" name="mcode" value="01">사업팀
		<input type="checkbox" name="mcode" value="02">지원팀
		<input type="checkbox" name="mcode" value="03">운영팀
		
		<button id="enroll">발송</button>
		</form>
    </table>
 
 
</body>
</html>
