package com.misa.pool.dom;

import java.io.Serializable;

public class CarItem implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7616901191365139258L;
	/*
	 * Logo 车图标
地点：从哪出发到哪里
时间：此时间范围内有效
车型：轿车/面包车
收费情况：￥价格/人，每人需要支付
联系方式：手机号
描述信息：车主的描述信息

	 * */
	
	private String logo = null;
	private String address = null;
	private String time = null;
	private String carType = null;
	private String price = null;
	private String phone = null;
	private String des = null;
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	
}
