package egovframework.example.mypage.service;

import java.sql.Date;

public class DeliveryVO {
	
	private int dl_number;
	private String dl_date;
    private String r_id;
    private String dl_shop;    
    private String dl_food;  
    private int dl_price;  
    private String dl_cooktime;
    private String dl_address;
    private int dl_call;
    private String dl_status;
    private String dl_r_lati;
    private String dl_r_longi;
    private String dl_shoploc;
    private String dl_distoshop;
    private String dl_distoadd;
    private String dl_dltime;
    
	public int getDl_number() {
		return dl_number;
	}
	public void setDl_number(int dl_number) {
		this.dl_number = dl_number;
	}
	public String getDl_date() {
		return dl_date;
	}
	public void setDl_date(String dl_date) {
		this.dl_date = dl_date;
	}
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getDl_shop() {
		return dl_shop;
	}
	public void setDl_shop(String dl_shop) {
		this.dl_shop = dl_shop;
	}
	public String getDl_food() {
		return dl_food;
	}
	public void setDl_food(String dl_food) {
		this.dl_food = dl_food;
	}
	public int getDl_price() {
		return dl_price;
	}
	public void setDl_price(int dl_price) {
		this.dl_price = dl_price;
	}
	public String getDl_cooktime() {
		return dl_cooktime;
	}
	public void setDl_cooktime(String dl_cooktime) {
		this.dl_cooktime = dl_cooktime;
	}
	public String getDl_address() {
		return dl_address;
	}
	public void setDl_address(String dl_address) {
		this.dl_address = dl_address;
	}
	public int getDl_call() {
		return dl_call;
	}
	public void setDl_call(int dl_call) {
		this.dl_call = dl_call;
	}
	public String getDl_status() {
		return dl_status;
	}
	public void setDl_status(String dl_status) {
		this.dl_status = dl_status;
	}
	public String getDl_r_lati() {
		return dl_r_lati;
	}
	public void setDl_r_lati(String dl_r_lati) {
		this.dl_r_lati = dl_r_lati;
	}
	public String getDl_r_longi() {
		return dl_r_longi;
	}
	public void setDl_r_longi(String dl_r_longi) {
		this.dl_r_longi = dl_r_longi;
	}
	public String getDl_shoploc() {
		return dl_shoploc;
	}
	public void setDl_shoploc(String dl_shoploc) {
		this.dl_shoploc = dl_shoploc;
	}
	public String getDl_distoshop() {
		return dl_distoshop;
	}
	public void setDl_distoshop(String dl_distoshop) {
		this.dl_distoshop = dl_distoshop;
	}
	public String getDl_distoadd() {
		return dl_distoadd;
	}
	public void setDl_distoadd(String dl_distoadd) {
		this.dl_distoadd = dl_distoadd;
	}
	public String getDl_dltime() {
		return dl_dltime;
	}
	public void setDl_dltime(String dl_dltime) {
		this.dl_dltime = dl_dltime;
	}
	@Override
	public String toString() {
		return "DeliveryVO [dl_number=" + dl_number + ", dl_date=" + dl_date + ", r_id=" + r_id + ", dl_shop=" + dl_shop
				+ ", dl_food=" + dl_food + ", dl_price=" + dl_price + ", dl_cooktime=" + dl_cooktime + ", dl_address="
				+ dl_address + ", dl_call=" + dl_call + ", dl_status=" + dl_status + ", dl_r_lati=" + dl_r_lati
				+ ", dl_r_longi=" + dl_r_longi + ", dl_shoploc=" + dl_shoploc + ", dl_distoshop=" + dl_distoshop
				+ ", dl_distoadd=" + dl_distoadd + ", dl_dltime=" + dl_dltime + "]";
	}
    
    

}
