package com.vistaridge.inventory.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_ledger_quantity")
public class InventoryLedgerQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long inventory_id;
    private String code;
    private String name;
    private String ref;
    private Float debit;	
    private Float credit;	
    private String comment;
    private Date post_date;	
    private Boolean discontinued;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Float getDebit() {
		return debit;
	}
	public void setDebit(Float debit) {
		this.debit = debit;
	}
	public Float getCredit() {
		return credit;
	}
	public void setCredit(Float credit) {
		this.credit = credit;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public Boolean getDiscontinued() {
		return discontinued;
	}
	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}
	
	public InventoryLedgerQuantity() {}
	
	public InventoryLedgerQuantity(long id, long inventory_id, String code, String name, String ref, Float debit,
			Float credit, String comment, Date post_date, Boolean discontinued) {
		super();
		this.id = id;
		this.inventory_id = inventory_id;
		this.code = code;
		this.name = name;
		this.ref = ref;
		this.debit = debit;
		this.credit = credit;
		this.comment = comment;
		this.post_date = post_date;
		this.discontinued = discontinued;
	}
	@Override
	public String toString() {
		return "InventoryLedgerQuantity [id=" + id + ", inventory_id=" + inventory_id + ", code=" + code + ", name="
				+ name + ", ref=" + ref + ", debit=" + debit + ", credit=" + credit + ", comment=" + comment
				+ ", post_date=" + post_date + ", discontinued=" + discontinued + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((credit == null) ? 0 : credit.hashCode());
		result = prime * result + ((debit == null) ? 0 : debit.hashCode());
		result = prime * result + ((discontinued == null) ? 0 : discontinued.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (inventory_id ^ (inventory_id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((post_date == null) ? 0 : post_date.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
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
		InventoryLedgerQuantity other = (InventoryLedgerQuantity) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (credit == null) {
			if (other.credit != null)
				return false;
		} else if (!credit.equals(other.credit))
			return false;
		if (debit == null) {
			if (other.debit != null)
				return false;
		} else if (!debit.equals(other.debit))
			return false;
		if (discontinued == null) {
			if (other.discontinued != null)
				return false;
		} else if (!discontinued.equals(other.discontinued))
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
		if (post_date == null) {
			if (other.post_date != null)
				return false;
		} else if (!post_date.equals(other.post_date))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
    
    
    
    
}


//id   			INTEGER      NOT NULL AUTO_INCREMENT,
//code 			VARCHAR(128) NOT NULL,
//name 			VARCHAR(128) NOT NULL,
//ref 			VARCHAR(128) NOT NULL,
//debit 		FLOAT,
//credit 		FLOAT,
//post_date 	DATE,