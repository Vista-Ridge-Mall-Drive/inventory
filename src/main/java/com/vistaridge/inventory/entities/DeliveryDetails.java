package com.vistaridge.inventory.entities;

import java.util.Date;

import javax.persistence.CascadeType;
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
    private long inventory_id;
    private String code;
    private String name;
    private String desc;
    private Float unit_price;
    private String unit_weight;
    private Date create_date;
    private Date post_date;
    private Boolean posted_flag;
    
    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "id")
    //@JsonIgnore
    //private DeliveryHeader deliveryHeader;
    
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
	public long getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(long inventory_id) {
		this.inventory_id = inventory_id;
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
	public DeliveryDetails(long id, long header_id, long inventory_id, String code, String name, String desc,
			Float unit_price, String unit_weight, Date create_date, Date post_date, Boolean posted_flag) {
		super();
		this.id = id;
		this.header_id = header_id;
		this.inventory_id = inventory_id;
		this.code = code;
		this.name = name;
		this.desc = desc;
		this.unit_price = unit_price;
		this.unit_weight = unit_weight;
		this.create_date = create_date;
		this.post_date = post_date;
		this.posted_flag = posted_flag;
	}
	@Override
	public String toString() {
		return "DeliveryDetails [id=" + id + ", header_id=" + header_id + ", inventory_id=" + inventory_id + ", code="
				+ code + ", name=" + name + ", desc=" + desc + ", unit_price=" + unit_price + ", unit_weight="
				+ unit_weight + ", create_date=" + create_date + ", post_date=" + post_date + ", posted_flag="
				+ posted_flag + "]";
	}
    
    

    
    
}
