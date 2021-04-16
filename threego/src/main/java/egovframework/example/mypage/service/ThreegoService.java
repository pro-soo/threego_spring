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

import java.util.List;

/**
 * @Class Name : EgovSampleService.java
 * @Description : EgovSampleService Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */
public interface ThreegoService {
	List<?> selectMypageList(LoginVO loginVO) throws Exception;	// 상세페이지  List
	List<?> selectReviewList(ReviewVO reviewVO) throws Exception;	// review List
	List<?> selectDeliveryList(DeliveryVO deliveryVO) throws Exception; // 배달 List
	List<?> selectCallList(String r_id) throws Exception; // 콜 List
	List<?> selectNoticeList(String r_id) throws Exception; // 공지사항 List
	List<?> selectNoticeDetailList(int n_postnum) throws Exception; // 공지사항  내용 List
	
	void insertBoard(LoginVO loginVO) throws Exception;

}
