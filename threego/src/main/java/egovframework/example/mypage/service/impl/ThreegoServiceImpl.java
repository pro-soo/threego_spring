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
package egovframework.example.mypage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.mypage.service.DeliveryVO;
import egovframework.example.mypage.service.LoginVO;
import egovframework.example.mypage.service.ReviewVO;
import egovframework.example.mypage.service.ThreegoService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

/**
 * @Class Name : EgovSampleServiceImpl.java
 * @Description : Sample Business Implement Class
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

@Service("ThreegoService")
public class ThreegoServiceImpl extends EgovAbstractServiceImpl implements ThreegoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ThreegoServiceImpl.class);

	/** SampleDAO */
//	@Resource(name = "sampleDAO")
//	private SampleDAO sampleDAO;
	// TODO mybatis 사용
	  @Resource(name="ThreegoMapper")
		private ThreegoMapper threegoDAO;	// Mapper를 DAO 개념으로 본다.
	  	
	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;

	
	@Override					// 검색 키워드가 들어가야 되기 때문에 VO를 매개변수로 해준다.
	public List<?> selectMypageList(LoginVO loginVO) throws Exception {	// 상세페이지 리스트
		return threegoDAO.selectMypageList(loginVO);
	}


	@Override
	public List<?> selectReviewList(ReviewVO reviewVO) throws Exception {	// review 리스트
		return threegoDAO.selectReviewList(reviewVO);
	}

	@Override
	public List<?> selectDeliveryList(DeliveryVO deliveryVO) throws Exception {	// 배달 리스트
		
		return threegoDAO.selectDeliveryList(deliveryVO);
	}
	
	@Override
	public List<?> selectCallList(String r_id) throws Exception {	// 콜 리스트
		return threegoDAO.selectCallList(r_id);
	}
	
	@Override
	public List<?> selectNoticeList(String r_id) throws Exception {	// 공지사항 리스트
		return threegoDAO.selectNoticeList(r_id);
	}
	
	@Override
	public void insertBoard(LoginVO loginVO) throws Exception {
		// TODO Auto-generated method stub
		
	}








	

	

}
