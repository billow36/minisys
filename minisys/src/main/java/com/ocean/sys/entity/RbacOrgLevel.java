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
 * 行政级别
 * @author OCEAN
 *
 */
@Entity
@Table(name = "RBAC_ORG_LEVEL")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacOrgLevel extends  DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String orgLevelId;
	private String orgLevelName;
	private String orgLevelDesc;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="ORG_LEVEL_ID",length=32)
	public String getOrgLevelId() {
		return orgLevelId;
	}
	public void setOrgLevelId(String orgLevelId) {
		this.orgLevelId = orgLevelId;
	}
	@Column(name="ORG_LEVEL_NAME",length=32)
	public String getOrgLevelName() {
		return orgLevelName;
	}
	public void setOrgLevelName(String orgLevelName) {
		this.orgLevelName = orgLevelName;
	}
	@Column(name="ORG_LEVEL_DESC",length=32)
	public String getOrgLevelDesc() {
		return orgLevelDesc;
	}
	public void setOrgLevelDesc(String orgLevelDesc) {
		this.orgLevelDesc = orgLevelDesc;
	}
}
