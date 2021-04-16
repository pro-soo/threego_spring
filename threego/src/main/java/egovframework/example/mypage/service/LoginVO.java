/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.mypage.service;

import egovframework.example.sample.service.SampleDefaultVO;

/**
 * @Class Name : SampleVO.java
 * @Description : SampleVO Class
 * @Modification Information
 * @ @ 수정일 수정자 수정내용 @ --------- --------- ------------------------------- @
 *   2009.03.16 최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 * 		Copyright (C) by MOPAS All right reserved.
 */
public class LoginVO extends SampleDefaultVO {

	private String r_id;
	private String r_pw;
	private int r_box;
	private String r_name;
	private int r_age;
	private String r_gender;
	private String r_phone;
	private int r_money;
	

	public String getR_id() {
		return r_id;
	}

	public void setR_id(String r_id) {
		this.r_id = r_id;
	}

	public String getR_pw() {
		return r_pw;
	}

	public void setR_pw(String r_pw) {
		this.r_pw = r_pw;
	}

	public int getR_box() {
		return r_box;
	}

	public void setR_box(int r_box) {
		this.r_box = r_box;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public int getR_age() {
		return r_age;
	}

	public void setR_age(int r_age) {
		this.r_age = r_age;
	}

	public String getR_gender() {
		return r_gender;
	}

	public void setR_gender(String r_gender) {
		this.r_gender = r_gender;
	}

	public String getR_phone() {
		return r_phone;
	}

	public void setR_phone(String r_phone) {
		this.r_phone = r_phone;
	}

	public int getR_money() {
		return r_money;
	}

	public void setR_money(int r_money) {
		this.r_money = r_money;
	}

	@Override
	public String toString() {
		return "MypageVO [r_id=" + r_id + ", r_pw=" + r_pw + ", r_box=" + r_box + ", r_name=" + r_name + ", r_age="
				+ r_age + ", r_gender=" + r_gender + ", r_phone=" + r_phone + ", r_money=" + r_money + "]";
	}
	
	
	
}
