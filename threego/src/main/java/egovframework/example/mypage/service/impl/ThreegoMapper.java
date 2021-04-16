/*
 * Copyright 2011 MOPAS(Ministry of Public Administration and Security).
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
package egovframework.example.mypage.service.impl;

import java.util.List;

import egovframework.example.mypage.service.DeliveryVO;
import egovframework.example.mypage.service.LoginVO;
import egovframework.example.mypage.service.ReviewVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * sample에 관한 데이터처리 매퍼 클래스
 *
 * @author  표준프레임워크센터
 * @since 2014.01.24
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *
 *          수정일          수정자           수정내용
 *  ----------------    ------------    ---------------------------
 *   2014.01.24        표준프레임워크센터          최초 생성
 *
 * </pre>
 */
@Mapper("ThreegoMapper")
public interface ThreegoMapper {	// DAO
	// SQL => id="selectBoardList"  parameterType="BoardVO"
	List<?> selectMypageList(LoginVO loginVO) throws Exception;	// 상세페이지  List
	List<?> selectReviewList(ReviewVO reviewVO) throws Exception;	// review List
	List<?> selectDeliveryList(DeliveryVO deliveryVO) throws Exception; // 배달 List
	List<?> selectCallList(String r_id) throws Exception; // 콜 List
	List<?> selectNoticeList(String r_id) throws Exception; // 공지사항 List
	List<?> selectNoticeDetailList(int n_postnum) throws Exception; // 공지사항  내용 List
	
	void insertBoard(LoginVO loginVO) throws Exception;
}
