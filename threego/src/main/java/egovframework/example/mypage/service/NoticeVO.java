package egovframework.example.mypage.service;

public class NoticeVO {
	private String r_id;
	private String n_title;
	private String n_content;
	private String n_date;
	private int n_postnum;
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_date() {
		return n_date;
	}
	public void setN_date(String n_date) {
		this.n_date = n_date;
	}
	public int getN_postnum() {
		return n_postnum;
	}
	public void setN_postnum(int n_postnum) {
		this.n_postnum = n_postnum;
	}
	@Override
	public String toString() {
		return "NoticeVO [r_id=" + r_id + ", n_title=" + n_title + ", n_content=" + n_content + ", n_date=" + n_date
				+ ", n_postnum=" + n_postnum + "]";
	}
	
	
}
