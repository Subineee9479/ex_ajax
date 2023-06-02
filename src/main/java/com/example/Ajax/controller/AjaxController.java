package com.example.Ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	@GetMapping("/ex01")
	public String ex01() {
		System.out.println("AjaxController.ex01");
		return "index"; // index.jsp에 작성된 내용이 출력됨
	}
	
	@PostMapping("/ex02")
	 // Http요청과 관련된거...@ResponseBody
	public @ResponseBody String ex02() {
		System.out.println("AjaxController.ex02");
		return "안녕하세요"; // 리턴값이 그대로 출력됨(index 값 그대로 출력)
	}
}
