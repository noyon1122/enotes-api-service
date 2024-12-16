package com.noyon.main.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {

	private boolean isActive;
	private boolean isDeleted;
	
	private Integer createdBy;
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	private Date createOn;
	
	private Integer updateBy;
	private Date updateOn;
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public Integer getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdatOn() {
		return updateOn;
	}
	public void setUpdatOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	
	
	
}
