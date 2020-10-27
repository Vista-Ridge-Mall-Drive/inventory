package com.vistaridge.inventory.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_header")
public class DeliveryHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long vendor_id;
    private String vendor_name;
    private Date receive_date;
    private long user_id;
    private Date post_date;
    private Boolean posted_flag;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(long vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public Date getReceive_date() {
		return receive_date;
	}
	public void setReceive_date(Date receive_date) {
		this.receive_date = receive_date;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public Boolean getPosted_flag() {
		return posted_flag;
	}
	public void setPosted_flag(Boolean posted_flag) {
		this.posted_flag = posted_flag;
	}
	public DeliveryHeader(long id, long vendor_id, String vendor_name, Date receive_date, long user_id, Date post_date,
			Boolean posted_flag) {
		super();
		this.id = id;
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.receive_date = receive_date;
		this.user_id = user_id;
		this.post_date = post_date;
		this.posted_flag = posted_flag;
	}
	@Override
	public String toString() {
		return "DeliveryHeader [id=" + id + ", vendor_id=" + vendor_id + ", vendor_name=" + vendor_name
				+ ", receive_date=" + receive_date + ", user_id=" + user_id + ", post_date=" + post_date
				+ ", posted_flag=" + posted_flag + "]";
	}
    
	
}
