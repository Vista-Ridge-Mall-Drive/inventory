package com.vistaridge.inventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String name;
    private String desc;
    private Float unit_price;	
    private String unit_weight;
    private Float qty_in_stock;	
    private Float reorder_level;	
    private Float reorder_time_in_days;	
    private Float reorder_qty;	
    private Boolean discontinued;
    
    public Inventory(){}
    
    public Inventory(String code, String name, String desc) {
    	this.code = code;
    	this.name = name;
    	this.desc = desc;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Float getQty_in_stock() {
		return qty_in_stock;
	}

	public void setQty_in_stock(Float qty_in_stock) {
		this.qty_in_stock = qty_in_stock;
	}

	public Float getReorder_level() {
		return reorder_level;
	}

	public void setReorder_level(Float reorder_level) {
		this.reorder_level = reorder_level;
	}

	public Float getReorder_time_in_days() {
		return reorder_time_in_days;
	}

	public void setReorder_time_in_days(Float reorder_time_in_days) {
		this.reorder_time_in_days = reorder_time_in_days;
	}

	public Float getReorder_qty() {
		return reorder_qty;
	}

	public void setReorder_qty(Float reorder_qty) {
		this.reorder_qty = reorder_qty;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	
	
	public Inventory(long id, String code, String name, String desc, Float unit_price, String unit_weight,
			Float qty_in_stock, Float reorder_level, Float reorder_time_in_days, Float reorder_qty,
			Boolean discontinued) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.desc = desc;
		this.unit_price = unit_price;
		this.unit_weight = unit_weight;
		this.qty_in_stock = qty_in_stock;
		this.reorder_level = reorder_level;
		this.reorder_time_in_days = reorder_time_in_days;
		this.reorder_qty = reorder_qty;
		this.discontinued = discontinued;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", code=" + code + ", name=" + name + ", desc=" + desc + ", unit_price="
				+ unit_price + ", unit_weight=" + unit_weight + ", qty_in_stock=" + qty_in_stock + ", reorder_level="
				+ reorder_level + ", reorder_time_in_days=" + reorder_time_in_days + ", reorder_qty=" + reorder_qty
				+ ", discontinued=" + discontinued + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((discontinued == null) ? 0 : discontinued.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qty_in_stock == null) ? 0 : qty_in_stock.hashCode());
		result = prime * result + ((reorder_level == null) ? 0 : reorder_level.hashCode());
		result = prime * result + ((reorder_qty == null) ? 0 : reorder_qty.hashCode());
		result = prime * result + ((reorder_time_in_days == null) ? 0 : reorder_time_in_days.hashCode());
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
		Inventory other = (Inventory) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (discontinued == null) {
			if (other.discontinued != null)
				return false;
		} else if (!discontinued.equals(other.discontinued))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qty_in_stock == null) {
			if (other.qty_in_stock != null)
				return false;
		} else if (!qty_in_stock.equals(other.qty_in_stock))
			return false;
		if (reorder_level == null) {
			if (other.reorder_level != null)
				return false;
		} else if (!reorder_level.equals(other.reorder_level))
			return false;
		if (reorder_qty == null) {
			if (other.reorder_qty != null)
				return false;
		} else if (!reorder_qty.equals(other.reorder_qty))
			return false;
		if (reorder_time_in_days == null) {
			if (other.reorder_time_in_days != null)
				return false;
		} else if (!reorder_time_in_days.equals(other.reorder_time_in_days))
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
