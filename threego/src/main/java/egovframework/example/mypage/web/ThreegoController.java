package egovframework.example.mypage.web;


import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import egovframework.example.mypage.service.DeliveryVO;
import egovframework.example.mypage.service.LoginVO;
import egovframework.example.mypage.service.NoticeVO;
import egovframework.example.mypage.service.ReviewVO;
import egovframework.example.mypage.service.ThreegoService;

@Controller
public class ThreegoController {
	
	@Resource(name = "ThreegoService")
	private ThreegoService threegoService;
	
	@RequestMapping(value="/mypage.do")
	public void list(LoginVO loginVO, HttpServletResponse response) throws Exception{
		
		// Spring은 바로 DAO로 가지않고 Service단을 거쳐서 간다. 중복이 되지만 사용자의 요구사항을 반영하기 위해서 필요하다.(model을 바꿔야되기 때문에)
		// Controller - Service - DAO
				
		List<?> list =threegoService.selectMypageList(loginVO);
		
		Gson json = new Gson();
		String go =json.toJson(list);
		
		//model.addAttribute("list", go);
		
		response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.print(go);
	    System.out.println("list");
	}
	
	@RequestMapping(value="/review.do")
	public void reviewlist(ReviewVO reviewVO, HttpServletResponse response) throws Exception{
		
		List<?> list = threegoService.selectReviewList(reviewVO);
		
		Gson json = new Gson();
		String review = json.toJson(list);
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(review);
		System.out.println("review");
	}
	
	@RequestMapping(value="/delivery.do")
	public void deliverylist(DeliveryVO deliveryVO, HttpServletResponse response, HttpServletRequest request) throws Exception{
		
		String r_id = request.getParameter("r_id");
		String dl_date = request.getParameter("dl_date");
		
		deliveryVO.setR_id(r_id);
		deliveryVO.setDl_date(dl_date);
		
		List<?> list = threegoService.selectDeliveryList(deliveryVO);
		
		Gson json = new Gson();
		String delivery = json.toJson(list);
		System.out.println(delivery);
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(delivery);
		System.out.println("delivery");
		
	}
	
	@RequestMapping(value="/call.do")
	public void callList(DeliveryVO deliveryVO, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String r_id = request.getParameter("r_id");
		
		deliveryVO.setR_id(r_id);
		
		List<?> list = threegoService.selectCallList(r_id);
		
		Gson json = new Gson();
		String call = json.toJson(list);
		System.out.println(call);
		
		response.setContentType("test/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(call);
		System.out.println("call");
	}
	
	@RequestMapping(value="/notice.do")
	public void noticeList(NoticeVO noticeVO, HttpServletRequest request, HttpServletResponse response) throws Exception{
		String r_id = request.getParameter("r_id");
		
		noticeVO.setR_id(r_id);
		
		List<?> list = threegoService.selectNoticeList(r_id);
		
		Gson json = new Gson();
		String notice = json.toJson(list);
		System.out.println(notice);
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(notice);
		System.out.println("notice");
		
	}
	
	@RequestMapping(value="/noticeDetail.do")
	public void noticeDetailList(NoticeVO noticeVO, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int n_postnum = Integer.parseInt(request.getParameter("n_postnum"));
		noticeVO.setN_postnum(n_postnum);
		
		List<?> list = threegoService.selectNoticeDetailList(n_postnum);
		
		Gson json = new Gson();
		String notice_de = json.toJson(list);
		System.out.println(notice_de);
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(notice_de);
		System.out.println("notice_de");
	}

	
	
}

