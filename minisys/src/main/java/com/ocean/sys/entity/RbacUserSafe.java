package com.ocean.sys.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "RBAC_USER_SAFE")
@DynamicInsert
@DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RbacUserSafe extends DataEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;// 主键
	private RbacUser user;
	private String email;// 密码发送邮箱
	private String passwordAnswer;// 密码答案
	private String passwordQuestion;// 密码提问
	private int failedPasswordAnswerAttempCount;// 密码问题尝试回答错误
	private int failedPasswordAttemp;// 密码错误尝试次数

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne(optional = false, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "USER_ID", referencedColumnName = "id", unique = true)
	public RbacUser getUser() {
		return user;
	}

	public void setUser(RbacUser user) {
		this.user = user;
	}

	@Column(name = "EMAIL", length = 32)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSWORD_ANSWER", length = 128)
	public String getPasswordAnswer() {
		return passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	@Column(name = "PASSWORD_QUESTION", length = 128)
	public String getPasswordQuestion() {
		return passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	@Column(name = "FAILED_PASSWORD_ANSWER_ATTEMP_COUNT")
	public int getFailedPasswordAnswerAttempCount() {
		return failedPasswordAnswerAttempCount;
	}

	public void setFailedPasswordAnswerAttempCount(
			int failedPasswordAnswerAttempCount) {
		this.failedPasswordAnswerAttempCount = failedPasswordAnswerAttempCount;
	}

	@Column(name = "FAILED_PASSWORD_ATTEMP")
	public int getFailedPasswordAttemp() {
		return failedPasswordAttemp;
	}

	public void setFailedPasswordAttemp(int failedPasswordAttemp) {
		this.failedPasswordAttemp = failedPasswordAttemp;
	}

}