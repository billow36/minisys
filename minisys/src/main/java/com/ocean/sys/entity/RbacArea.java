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
@Table(name = "RBAC_AREA")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacArea extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;//主键
	private String areaId; //区域编码
	private String code;//编码
	private RbacArea parent;//父编码
	private List<RbacArea> child;
	private int type;//类型
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="AREAD_ID",length=32)
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	@Column(name="CODE",length=32)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	public RbacArea getParent() {
		return parent;
	}
	public void setParent(RbacArea parent) {
		this.parent = parent;
	}
	@OneToMany(mappedBy="parent")
	public List<RbacArea> getChild() {
		return child;
	}
	public void setChild(List<RbacArea> child) {
		this.child = child;
	}
	@Column(name="TYPE",length=32)
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}