package com.ocean.sys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * 职务
 * @author OCEAN
 *
 */
@Entity
@Table(name = "RBAC_POSITION")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacPosition {
	private Long id;
	private String positionId;
	private String positionName;
	private Long orgLevelId;
	private Long companyId;
	private String positionDesc;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="POSITION_ID",length=32)
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	@Column(name="POSITION_NAME",length=32)
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	@Column(name="ORG_LEVEL_ID",length=32)
	public Long getOrgLevelId() {
		return orgLevelId;
	}
	public void setOrgLevelId(Long orgLevelId) {
		this.orgLevelId = orgLevelId;
	}
	@Column(name="COMPANY_ID",length=32)
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	@Column(name="POSITION_DESC",length=32)
	public String getPositionDesc() {
		return positionDesc;
	}
	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}
}
