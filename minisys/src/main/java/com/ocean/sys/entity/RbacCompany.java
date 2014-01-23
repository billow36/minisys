package com.ocean.sys.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@Entity
@Table(name = "RBAC_COMPANY")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacCompany extends DataEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -43571681921820302L;
	private Long id;
	private String companyId;
	private String companyName;
	private String address;
	private String level;
	private RbacCompany parent;
	private List<RbacCompany> child;
	private int type;
	private String workPhone;
	private String workZip;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="COMPANY_ID",length=32)
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	@Column(name="COMPANY_NAME",length=32)
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="LEVEL")
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	public RbacCompany getParent() {
		return parent;
	}
	public void setParent(RbacCompany parent) {
		this.parent = parent;
	}
	@OneToMany(mappedBy="parent")
	public List<RbacCompany> getChild() {
		return child;
	}
	public void setChild(List<RbacCompany> child) {
		this.child = child;
	}
	@Column(name="TYPE")
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Column(name="WORK_PHONE",length=32)
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	@Column(name="WORK_ZIP",length=32)
	public String getWorkZip() {
		return workZip;
	}
	public void setWorkZip(String workZip) {
		this.workZip = workZip;
	}
	
}
