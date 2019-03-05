package com.cegz.sys.model.view.adver;

/**
 * 联系人视图
 *
 * @author lijiaxin
 * @date 2018年7月25日
 */
public class ContactView {
	/**
	 * id
	 */
	private Long id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 身份证正面照片
	 */
	private String firstImageUrl;

	/**
	 * 身份证反面照片
	 */
	private String secondImageUrl;

	/**
	 * 驾驶证照片
	 */
	private String driveLicenseImageUrl;

	/**
	 * 状态 0 审核中 1 审核完成，2 认证失败
	 */
	private int status;


	/**
	 * 车牌号
	 */
	private String plateNumber;

	/**
	 * 车主性别
	 */
	private String sex;

	/**
	 * 失败原因
	 */
	private String reason;

	/**
	 * 审核者id
	 */
	private Long updateUserId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstImageUrl() {
		return firstImageUrl;
	}

	public void setFirstImageUrl(String firstImageUrl) {
		this.firstImageUrl = firstImageUrl;
	}

	public String getSecondImageUrl() {
		return secondImageUrl;
	}

	public void setSecondImageUrl(String secondImageUrl) {
		this.secondImageUrl = secondImageUrl;
	}

	public String getDriveLicenseImageUrl() {
		return driveLicenseImageUrl;
	}

	public void setDriveLicenseImageUrl(String driveLicenseImageUrl) {
		this.driveLicenseImageUrl = driveLicenseImageUrl;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
}
