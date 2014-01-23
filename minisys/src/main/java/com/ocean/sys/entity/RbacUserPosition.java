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
@Table(name = "RBAC_USER_POSITION")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacUserPosition {
	private Long id;
	private Long positionId;
	private Long userId;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="POSITION_ID")
	public Long getPositionId() {
		return positionId;
	}
	@Column(name="USER_ID")
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}
	
}
