package dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
// AllArgsConstructor : 모든 필드를 매개변수로 하는 생성자
public class AjaxDTO {

	private String param1;
	private String param2;
	
	// 기본 생성자
	public AjaxDTO() {
	}
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public AjaxDTO(String param1, String param2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
	}
	
	
	
}
