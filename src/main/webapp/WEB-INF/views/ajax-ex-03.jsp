<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03</title>
<!-- jQuery CDN  -->
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</head>
<body>
	<button onclick="ex03Fn()">ex03 함수 호출</button>
</body>
	<script>
		// 자바스크립트 (ex-03: get 요청하기 & front로부터 parameter 전달하기)
		const ex03Fn = () => {
			const val1 = "Hello SpringBoot!!";
			$.ajax({
				// 요청방식: get
				// 요청주소: /ex03
				type: "get",
				url: "/ex03",
				// parameter 전달하기 -> data라는 속성 사용!
				data: {
					// key(parameter 이름): value(parameter에 담을 value)
					"param1": val1,
					"param2": "안녕"
				},
				// 요청하고 받은 결과를 어떻게 처리할것인가
				// success: 요청이 성공했을 때 실행되는 부분
				// res: 함수 매개변수
				success: function(res) {
					console.log("성공", res);
				},
				// success: 요청이 실패했을 때 실행되는 부분
				error: function() {
					console.log("실패");
				}
			})
		}
	</script>

</html>