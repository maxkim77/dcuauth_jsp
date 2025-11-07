<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("user-id");
	if (id == null){
		id = "";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>dcustudy</title>
    <link rel="stylesheet" href="./css/common.css">
    <link rel="stylesheet" href="./css/profile.css">
</head>
<body>
    <!-- header -->
    <header class="layout-header">
        <h1><a href="./">DCU STUDY</a></h1>

        <div>
            <a href="./jspprofile.jsp">프로필</a>
            <a href="./jsplogin.jsp">로그인</a>
            <button type="button">로그아웃</button>
        </div>
    </header>
    <!-- main -->
     <main class="profile">
        <div class="welcome-container">
            <img src="./img/user.png" alt="프로필이미지" class="profile-img">
            <h2><%= id %>님 환영합니다!</h2>
            <p>서비스에 오신것을 진심으로 환영합니다.</p>
            <p>오늘도 즐거운 하루 보내세요!</p>
        </div>
     </main>
    <!-- footer -->
    <footer class="layout-footer">
        Copyright 2025. DCU practice.
    </footer>
</body>
</html>