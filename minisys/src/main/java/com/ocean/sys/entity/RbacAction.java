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

@Entity
@Table(name = "RBAC_ACTION")
@DynamicInsert
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacAction extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;// 主键
	private String actionId;
	private String actionName;
	private String actionDesc;

	public RbacAction() {

	}

	public RbacAction(Long id) {
		this.id = id;
	}

	@Column(name = "ACTION_DESC", length = 128)
	public String getActionDesc() {
		return actionDesc;
	}

	@Column(name = "ACTION_ID", length = 32)
	public String getActionId() {
		return actionId;
	}

	@Column(name = "ACTION_NAME", length = 32)
	public String getActionName() {
		return actionName;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

}