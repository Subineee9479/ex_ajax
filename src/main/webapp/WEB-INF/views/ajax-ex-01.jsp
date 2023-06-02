<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01</title>
<!-- jQuery CDN  -->
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</head>
<body>
	<button onclick="ex01Fn()">ex01 함수 호출</button>
</body>
	<script>
		// 자바스크립트 (ex-01: get 요청하기)
		const ex01Fn = () => {
			$.ajax({
				// 요청방식: get
				// 요청주소: /ex01
				type: "get",
				url: "/ex01",
				// 요청하고 받은 결과를 어떻게 처리할것인가
				// success: 요청이 성공했을 때 실행되는 부분
				success: function() {
					
				},
				// success: 요청이 실패했을 때 실행되는 부분
				error: function() {
					
				}
			})
		}
	</script>

</html>