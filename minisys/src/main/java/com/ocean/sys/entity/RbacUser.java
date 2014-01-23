package com.ocean.sys.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "RBAC_USER")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacUser extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;//主键
	private String eName;//英文名字
	private String loginId;//登陆ID
	private String name;//真实名字
	private String nickName;//昵称
	private String password;//密码
	private Date lastLoginTime;//上次登陆时间
	private String salt;//用于记录登陆生成码
	private Boolean enable;//用户是否启用
	private String loginIp;//登陆地址
	private int accountStatus;//状态，0--离线，1--在线
	private Date registTime;//注册时间
	
	private RbacUserExtInfo userExtInfo;//用户扩展信息
	private RbacUserSafe userSafe;//用户安全
	public RbacUser(){
		
	}
	public RbacUser(Long id){
		this.id = id;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGESIT_TIME")
	
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	/**
	 * @return the accountStatus
	 */
	@Column(name="ACCOUNT_STATUS")	
	public int getAccountStatus() {
		return accountStatus;
	}
	
	/**
	 * @return the enable
	 */
	@Column(name="ENABLE")	
	public Boolean getEnable() {
		return enable;
	}
	/**
	 * @return the eName
	 */
	@Column(name="ENAME",length=16)	
	public String geteName() {
		return eName;
	}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	/**
	 * @return the lastLoginTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_LOGIN_TIME")	
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * @return the loginId
	 */
	@Column(name="LOGIN_ID",length=16,unique=true)	
	public String getLoginId() {
		return loginId;
	}
	/**
	 * @return the loginIp
	 */
	@Column(name="LOGIN_IP",length=16)	
	public String getLoginIp() {
		return loginIp;
	}
	/**
	 * @return the name
	 */
	@Column(name="NAME",length=32)	
	public String getName() {
		return name;
	}
	/**
	 * @return the nickName
	 */
	@Column(name="NICK_NAME",length=32)	
	public String getNickName() {
		return nickName;
	}
	/**
	 * @return the password
	 */
	@Column(name="PASSWORD",length=128)	
	public String getPassword() {
		return password;
	}
	/**
	 * @return the salt
	 */
	@Column(name="SALT",length=32)	
	public String getSalt() {
		return salt;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}
	/**
	 * @param enable the enable to set
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * @param loginIp the loginIp to set
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	@OneToOne(optional = true,cascade=CascadeType.ALL,mappedBy="user")
	public RbacUserExtInfo getUserExtInfo() {
		return userExtInfo;
	}
	public void setUserExtInfo(RbacUserExtInfo userExtInfo) {
		this.userExtInfo = userExtInfo;
	}
	@OneToOne(optional = true,cascade=CascadeType.ALL,mappedBy="user")
	public RbacUserSafe getUserSafe() {
		return userSafe;
	}
	public void setUserSafe(RbacUserSafe userSafe) {
		this.userSafe = userSafe;
	}
	
}