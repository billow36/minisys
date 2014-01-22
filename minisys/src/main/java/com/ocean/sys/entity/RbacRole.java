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
@Table(name = "RBAC_ROLE")
@DynamicInsert
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacRole extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;// 主键
	private int level;//角色级别
	private RbacRole parent;//父角色
	private List<RbacRole> childs;//子角色
	private String roleName;//角色名字

	private int roleType;//角色类型 

	public RbacRole() {

	}

	public RbacRole(Long id) {
		this.id = id;
	}
	@OneToMany(mappedBy="parent")
	public List<RbacRole> getChilds() {
		return childs;
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
	@Column(name="LEVEL")
	public int getLevel() {
		return level;
	}
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	public RbacRole getParent() {
		return parent;
	}
	@Column(name="ROLE_NAME",length=32)
	public String getRoleName() {
		return roleName;
	}
	@Column(name="ROLE_TYPE",length=32)
	public int getRoleType() {
		return roleType;
	}
	
	public void setChilds(List<RbacRole> childs) {
		this.childs = childs;
	}
	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public void setParent(RbacRole parent) {
		this.parent = parent;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}
}