package com.ocean.sys.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "RBAC_USER_EXT")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacUserExtInfo extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;//主键
	private RbacUser user;
	private Boolean isApproved;
	private String email;
	private String phone;
	private String address;
	private String  qq;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@OneToOne(optional = false, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "USER_ID", referencedColumnName = "id", unique = true)
	public RbacUser getUser() {
		return user;
	}
	public void setUser(RbacUser user) {
		this.user = user;
	}
	@Column(name="IS_APPROVED")
	public Boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}
	@Column(name="EMAIL",length=32)
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="PHONE",length=32)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="ADDRESS",length=32)
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="QQ",length=128)
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
}