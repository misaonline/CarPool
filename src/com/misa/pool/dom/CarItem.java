package com.misa.pool.dom;

import java.io.Serializable;

public class CarItem implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7616901191365139258L;
	/*
	 * Logo ��ͼ��
�ص㣺���ĳ���������
ʱ�䣺��ʱ�䷶Χ����Ч
���ͣ��γ�/�����
�շ���������۸�/�ˣ�ÿ����Ҫ֧��
��ϵ��ʽ���ֻ���
������Ϣ��������������Ϣ

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
