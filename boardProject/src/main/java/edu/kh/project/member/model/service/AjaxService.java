package edu.kh.project.member.model.service;

import edu.kh.project.member.model.dto.Member;

public interface AjaxService {

	
	
	/** 전화번호 조회 서비스
	 * @param nickname
	 * @return
	 */
	String selectMemberTel(String nickname);

	
	
	/** 맴버 조회 서비스
	 * @param email
	 * @return
	 */
	Member selectMember(String email);



	/** 이메일 중복검사
	 * @param email
	 * @return
	 */
	int checkEmail(String email);



	int checkNickname(String nickname);

}