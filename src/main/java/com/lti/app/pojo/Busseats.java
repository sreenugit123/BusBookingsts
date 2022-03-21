package com.lti.app.pojo;

import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Table(name="busseats")
public class Busseats 
{
	@Id
	@Column(name="seatno")
	private String sno;
	@Column(name="busid")
	private String bid;
	public Busseats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Busseats(String sno, String bid) {
		super();
		this.sno = sno;
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "busseats [sno=" + sno + ", bid=" + bid + "]";
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	
	

}
