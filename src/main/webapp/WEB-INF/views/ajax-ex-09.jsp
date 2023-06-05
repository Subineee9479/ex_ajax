<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex09</title>
<!-- jQuery CDN  -->
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</head>
<body>
	<button onclick="ex09Fn()">ex09 함수 호출</button>
</body>
	<script>
		// 자바스크립트 (ex-09: post 요청하기 & parameter 전달하기 & ResponseEntity에 DTO 객체 리턴 하기)
		const ex09Fn = () => {
			const val1 = "Hello SpringBoot!!";
			
			const params = {
					"param1": val1,
					"param2": "안녕"
			};
			
			$.ajax({
				// 요청방식: post
				// 요청주소: /ex09
				type: "post",
				url: "/ex09",
				// parameter 전달하기 -> data라는 속성 사용!
				data: JSON.stringify(params),
				contentType: "application/json",
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