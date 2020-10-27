package com.vistaridge.inventory.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	@Override
	public String toString() {
		return "DeliveryDetails [id=" + id + ", header_id=" + header_id + ", inventory_id=" + inventory_id + ", code="
				+ code + ", name=" + name + ", desc=" + desc + ", unit_price=" + unit_price + ", unit_weight="
				+ unit_weight + ", create_date=" + create_date + "]";
	}
	public DeliveryDetails(long id, long header_id, long inventory_id, String code, String name, String desc,
			Float unit_price, String unit_weight, Date create_date) {
		this.id = id;
		this.header_id = header_id;
		this.inventory_id = inventory_id;
		this.code = code;
		this.name = name;
		this.desc = desc;
		this.unit_price = unit_price;
		this.unit_weight = unit_weight;
		this.create_date = create_date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + (int) (header_id ^ (header_id >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (inventory_id ^ (inventory_id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((unit_price == null) ? 0 : unit_price.hashCode());
		result = prime * result + ((unit_weight == null) ? 0 : unit_weight.hashCode());
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
		DeliveryDetails other = (DeliveryDetails) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (create_date == null) {
			if (other.create_date != null)
				return false;
		} else if (!create_date.equals(other.create_date))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (header_id != other.header_id)
			return false;
		if (id != other.id)
			return false;
		if (inventory_id != other.inventory_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (unit_price == null) {
			if (other.unit_price != null)
				return false;
		} else if (!unit_price.equals(other.unit_price))
			return false;
		if (unit_weight == null) {
			if (other.unit_weight != null)
				return false;
		} else if (!unit_weight.equals(other.unit_weight))
			return false;
		return true;
	}
	

    
    
}
