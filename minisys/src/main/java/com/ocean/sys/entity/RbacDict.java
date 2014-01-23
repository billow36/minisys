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
@Table(name = "RBAC_DICT")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacDict extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;//主键
	private String name;
	private int sort;
	private int type;
	private String value;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Id
	@Column(name="NAME",length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="SORT")
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	@Column(name="TYPE")
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Column(name="VALUE",length=32)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}