package egovframework.example.mypage.service;

import egovframework.example.sample.service.SampleDefaultVO;

public class ReviewVO extends SampleDefaultVO{
	private int dl_number;
	private int ra_rating;
	private String ra_evals;
	private int ra_reviewnum;
	
	public int getDl_number() {
		return dl_number;
	}
	public void setDl_number(int dl_number) {
		this.dl_number = dl_number;
	}
	public int getRa_rating() {
		return ra_rating;
	}
	public void setRa_rating(int ra_rating) {
		this.ra_rating = ra_rating;
	}
	public String getRa_evals() {
		return ra_evals;
	}
	public void setRa_evals(String ra_evals) {
		this.ra_evals = ra_evals;
	}
	public int getRa_reviewnum() {
		return ra_reviewnum;
	}
	public void setRa_reviewnum(int ra_reviewnum) {
		this.ra_reviewnum = ra_reviewnum;
	}
	@Override
	public String toString() {
		return "ReviewVO [dl_number=" + dl_number + ", ra_rating=" + ra_rating + ", ra_evals=" + ra_evals
				+ ", ra_reviewnum=" + ra_reviewnum + "]";
	}
	
	
	
}
