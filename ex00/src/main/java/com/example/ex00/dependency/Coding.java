package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	
	// 필드 주입 
	// 굉장히 편하게 주입할 수 있으니 순환 참조(무한루프)시 오류가 발생하지 않기 때문에 StackOverFlow 발생
	
	
	// final은 상수이므로 반드시 선언과 동시에 값을 지정해야함 
	// 하지만 필드 주입을 통해 초기화를 해줌으로 에러발생 x 
	@Autowired
	private final Computer computer;
	// 외부에서 간접접근 및 다른값이 들어오지 못하도록
	
	// Setter 주입
//	@Autowired
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
	
	

}
