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
@Table(name = "RBAC_PMA")
@DynamicInsert
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacPMA extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;// 主键
	private RbacPrivilege privilege;
	private RbacMenu menu;
	private RbacAction action;

	public RbacPMA() {

	}

	public RbacPMA(Long id) {
		this.id = id;
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

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public RbacPrivilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(RbacPrivilege privilege) {
		this.privilege = privilege;
	}

	public RbacMenu getMenu() {
		return menu;
	}

	public void setMenu(RbacMenu menu) {
		this.menu = menu;
	}

	public RbacAction getAction() {
		return action;
	}

	public void setAction(RbacAction action) {
		this.action = action;
	}
}