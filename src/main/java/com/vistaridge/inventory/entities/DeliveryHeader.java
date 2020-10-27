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
	@Override
	public String toString() {
		return "DeliveryHeader [id=" + id + ", vendor_id=" + vendor_id + ", vendor_name=" + vendor_name
				+ ", receive_date=" + receive_date + ", user_id=" + user_id + "]";
	}
	public DeliveryHeader(long id, long vendor_id, String vendor_name, Date receive_date, long user_id) {
		this.id = id;
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
		this.receive_date = receive_date;
		this.user_id = user_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((receive_date == null) ? 0 : receive_date.hashCode());
		result = prime * result + (int) (user_id ^ (user_id >>> 32));
		result = prime * result + (int) (vendor_id ^ (vendor_id >>> 32));
		result = prime * result + ((vendor_name == null) ? 0 : vendor_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryHeader other = (DeliveryHeader) obj;
		if (id != other.id)
			return false;
		if (receive_date == null) {
			if (other.receive_date != null)
				return false;
		} else if (!receive_date.equals(other.receive_date))
			return false;
		if (user_id != other.user_id)
			return false;
		if (vendor_id != other.vendor_id)
			return false;
		if (vendor_name == null) {
			if (other.vendor_name != null)
				return false;
		} else if (!vendor_name.equals(other.vendor_name))
			return false;
		return true;
	}
    
    
    
    
//    vendor_id		INTEGER      NOT NULL,
//    vendor_name 	VARCHAR(128) NOT NULL,
//    receive_date 	DATE,
//    user_id		INTEGER      NOT NULL,    
    
//    private String code;
//    private String name;
//    private String desc;
//    private Float unit_price;	
//    private String unit_weight;
//    private Float qty_in_stock;	
//    private Float reorder_level;	
//    private Float reorder_time_in_days;	
//    private Float reorder_qty;	
//    private Boolean discontinued;
	
}
