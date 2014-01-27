package com.ocean.sys.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "RBAC_MENU")
@DynamicInsert
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacMenu {
	private Long id;
	private String href;
	private String icon;
	private Boolean isShow;
	private String menuName;
	private RbacMenu parent;
	private int sort;
	private String target;
	private String permission;

	private List<RbacMenu> childs;
	@OneToMany(mappedBy="parent")
	public List<RbacMenu> getChilds() {
		return childs;
	}

	@Column(name = "HREF", length = 64)
	public String getHref() {
		return href;
	}

	@Column(name = "ICON", length = 32)
	public String getIcon() {
		return icon;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	@Column(name = "IS_SHOW")
	public Boolean getIsShow() {
		return isShow;
	}

	@Column(name = "MENU_NAME", length = 32)
	public String getMenuName() {
		return menuName;
	}
	
	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="PARENT_ID", updatable=false)
	public RbacMenu getParent() {
		return parent;
	}

	@Column(name = "PERMISSION", length = 32)
	public String getPermission() {
		return permission;
	}

	@Column(name = "SORT")
	public int getSort() {
		return sort;
	}

	public String getTarget() {
		return target;
	}

	public void setChilds(List<RbacMenu> childs) {
		this.childs = childs;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public void setParent(RbacMenu parent) {
		this.parent = parent;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
