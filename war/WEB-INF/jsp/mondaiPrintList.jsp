<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>午前過去問確認</title>

<!-- Bootstrap -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-67262963-1', 'auto');
  ga('send', 'pageview');

</script>
</head>
<body>

	<div class="jumbotron">
		<div class="container">

			<h1>午前過去問題の正解を見る</h1>
			<p>
				配布した午前過去問題の正解を確認できるサイト <a class="btn btn-primary btn-lg" href="/openid"
					role="button">login &raquo;</a>
			</p>
			</p>
		</div>
	</div>



	<div class="container">
		<h1>解答したプリントの種類を入力してください</h1>
		<form method=get action="/mondai/list" class="form-inline">
			<select class="form-control" name="mondaiPrintId">
				<%
					List<MondaiPrint> mpList = (List<MondaiPrint>) request
							.getAttribute("mpList");
					for (MondaiPrint mp : mpList) {
						out.print("<OPTION VALUE='");
						out.print(mp.getId());
						out.print("'>");
						out.print(mp.getId());
						out.print(":");
						out.print(mp.getName());
						out.print("</OPTION>");
					}

					//  <c:forEach var="obj" items="${mpList} }">
					//	<h2>${obj.id }</h2>
					//	</c:forEach>
				%>
			</select>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>