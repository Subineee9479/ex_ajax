package com.example.Ajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.AjaxDTO;

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
	
	@GetMapping("/ex03")
	public @ResponseBody String ex03(@RequestParam("param1") String param1, 
									@RequestParam("param2") String param2) {
		System.out.println("param1 = " + param1 + ", param2 = " + param2);
		return "ex03메서드 호출 완료";
	}
	
	@PostMapping("/ex04")
	public @ResponseBody String ex04(@RequestParam("param1") String param1, 
									@RequestParam("param2") String param2) {
		System.out.println("param1 = " + param1 + ", param2 = " + param2);
		return "ex04메서드 호출 완료";
	}
	
	@GetMapping("/ex05")
	public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		return ajaxDTO;		
	}
	
	@PostMapping("/ex06")
	public @ResponseBody AjaxDTO ex06(@ModelAttribute AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		return ajaxDTO;		
	}
	
	@PostMapping("/ex07")
	public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		return ajaxDTO;		
	}
	
	private List<AjaxDTO> DTOList() {
		List<AjaxDTO> dtoList = new ArrayList<>();
		dtoList.add(new AjaxDTO("data1", "data11"));
		dtoList.add(new AjaxDTO("data2", "data22"));
		return dtoList;
	}
	
	@PostMapping("/ex08")
	public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		List<AjaxDTO> dtoList = DTOList();
		dtoList.add(ajaxDTO);
		return dtoList;		
	}
	
	@PostMapping("/ex09")
	public ResponseEntity ex09(@RequestBody AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		//return new ResponseEntity<>(HttpStatus.NOT_FOUND); // ResponseEntity 객체를 여기서 선언한다.	
		return new ResponseEntity<>(ajaxDTO, HttpStatus.OK);
	}
	
	@PostMapping("/ex10")
	// ResponseEntity 로 리턴주고 @RequestBody로 받음
	public ResponseEntity ex10(@RequestBody AjaxDTO ajaxDTO) {
		System.out.println("ajaxDTO = " + ajaxDTO);
		List<AjaxDTO> dtoList = DTOList();
		dtoList.add(ajaxDTO);
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}
	
	
	
	
}