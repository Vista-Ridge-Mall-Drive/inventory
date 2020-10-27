package com.vistaridge.inventory.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "delivery_details")
public class DeliveryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;	
    private long header_id;
    
    @Column(name = "inventory_id")
    private long inventoryId;
    private String code;
    private String name;
    private String desc;
    private Float unit_price;
    private String unit_weight;
    private Date create_date;
    private Date post_date;
    private Boolean posted_flag;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getHeader_id() {
		return header_id;
	}
	public void setHeader_id(long header_id) {
		this.header_id = header_id;
	}
	public long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Float getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
	}
	public String getUnit_weight() {
		return unit_weight;
	}
	public void setUnit_weight(String unit_weight) {
		this.unit_weight = unit_weight;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
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

    
    
}
