package edu.kh.project.test.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class testVO {

	// 학생 VO
	private int studentNumber;
	private String studentName;
	private String koreanScore;
	private String englishScore;
	private String mathScore;
	
	// 매니저 VO
	private int managerNumber;
	private String managerName;
	private String managerHireDate;
}
