//package com.waterelephant.sxyDrainage.sina.entity;
//
///**
// * 统一对外接口 - 用户检测（code0091）
// * 
// * @author YANHUI
// *
// */
//public class RequestCheckUser {
//	private String name;  // 借款人姓名
//	private String phone;  // 电话
//	private String verifyCode;//验证码
//	private String bankCode;
//	private String bankPhone;
//	public String getBankPhone() {
//		return bankPhone;
//	}
//	public void setBankPhone(String bankPhone) {
//		this.bankPhone = bankPhone;
//	}
//	public String getBankCode() {
//		return bankCode;
//	}
//	public void setBankCode(String bankCode) {
//		this.bankCode = bankCode;
//	}
//	private String bankCardNo;//
//	
//	public String getBankCardNo() {
//		return bankCardNo;
//	}
//	public void setBankCardNo(String bankCardNo) {
//		this.bankCardNo = bankCardNo;
//	}
//	public String getVerifyCode() {
//		return verifyCode;
//	}
//	public void setVerifyCode(String verifyCode) {
//		this.verifyCode = verifyCode;
//	}
//	private String orderNo;  // 机构订单流水号
//	private String idCard;  // 身份证
//	private Double loanAmount; // 预借款金额  单位:分
//	//private String applyDate;  // 借款日期  格式：yyyy-MM-dd HH:mm:ss
//	private int sesameScore;  // 芝麻分
//	private String desc; // 借款用途
//	private String houseAddress;  // 住宅地址
//	private int marriage; // 婚姻状况  0：未婚，1：已婚
//	private String email;  // 邮箱
//	private int haveCar; // 是否有车 0：无车，1：有车
//	private int haveHouse; // 是否有房  0：无房，1：有房
//	private String firstName;   // 联系人姓名（1）
//	private String firstPhone;  // 联系人电话（1）
//	private String secondName;  // 联系人姓名（2）
//	private String secondPhone; // 联系人电话（2）
//	private String colleagueName;  // 同事
//	private String colleaguePhone; // 同事电话
//	private String friend1Name;   // 朋友1
//	private String friend1Phone;  // 朋友1电话
//	private String friend2Name;   // 朋友2
//	private String friend2Phone;  // 朋友2电话
//	private String qqchat;  // QQ
//	private String wechat;  // 微信
//	//============
//	private String orderId;
//	public String getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(String orderId) {
//		this.orderId = orderId;
//	}
//	private String companyName; // 公司名称
//	private String industry; 	// 行业
//	private String income; 		// 月收入
//	private String jobTime; 	// 工作年限
//	private Object penetrate; // 透传信息
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getOrderNo() {
//		return orderNo;
//	}
//	public void setOrderNo(String orderNo) {
//		this.orderNo = orderNo;
//	}
//	public String getIdCard() {
//		return idCard;
//	}
//	public void setIdCard(String idCard) {
//		this.idCard = idCard;
//	}
//	public Double getLoanAmount() {
//		return loanAmount;
//	}
//	public void setLoanAmount(Double loanAmount) {
//		this.loanAmount = loanAmount;
//	}
//	public int getSesameScore() {
//		return sesameScore;
//	}
//	public void setSesameScore(int sesameScore) {
//		this.sesameScore = sesameScore;
//	}
//	public String getDesc() {
//		return desc;
//	}
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//	public String getHouseAddress() {
//		return houseAddress;
//	}
//	public void setHouseAddress(String houseAddress) {
//		this.houseAddress = houseAddress;
//	}
//	public int getMarriage() {
//		return marriage;
//	}
//	public void setMarriage(int marriage) {
//		this.marriage = marriage;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getHaveCar() {
//		return haveCar;
//	}
//	public void setHaveCar(int haveCar) {
//		this.haveCar = haveCar;
//	}
//	public int getHaveHouse() {
//		return haveHouse;
//	}
//	public void setHaveHouse(int haveHouse) {
//		this.haveHouse = haveHouse;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getFirstPhone() {
//		return firstPhone;
//	}
//	public void setFirstPhone(String firstPhone) {
//		this.firstPhone = firstPhone;
//	}
//	public String getSecondName() {
//		return secondName;
//	}
//	public void setSecondName(String secondName) {
//		this.secondName = secondName;
//	}
//	public String getSecondPhone() {
//		return secondPhone;
//	}
//	public void setSecondPhone(String secondPhone) {
//		this.secondPhone = secondPhone;
//	}
//	public String getColleagueName() {
//		return colleagueName;
//	}
//	public void setColleagueName(String colleagueName) {
//		this.colleagueName = colleagueName;
//	}
//	public String getColleaguePhone() {
//		return colleaguePhone;
//	}
//	public void setColleaguePhone(String colleaguePhone) {
//		this.colleaguePhone = colleaguePhone;
//	}
//	public String getFriend1Name() {
//		return friend1Name;
//	}
//	public void setFriend1Name(String friend1Name) {
//		this.friend1Name = friend1Name;
//	}
//	public String getFriend1Phone() {
//		return friend1Phone;
//	}
//	public void setFriend1Phone(String friend1Phone) {
//		this.friend1Phone = friend1Phone;
//	}
//	public String getFriend2Name() {
//		return friend2Name;
//	}
//	public void setFriend2Name(String friend2Name) {
//		this.friend2Name = friend2Name;
//	}
//	public String getFriend2Phone() {
//		return friend2Phone;
//	}
//	public void setFriend2Phone(String friend2Phone) {
//		this.friend2Phone = friend2Phone;
//	}
//	public String getQqchat() {
//		return qqchat;
//	}
//	public void setQqchat(String qqchat) {
//		this.qqchat = qqchat;
//	}
//	public String getWechat() {
//		return wechat;
//	}
//	public void setWechat(String wechat) {
//		this.wechat = wechat;
//	}
//	public String getCompanyName() {
//		return companyName;
//	}
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}
//	public String getIndustry() {
//		return industry;
//	}
//	public void setIndustry(String industry) {
//		this.industry = industry;
//	}
//	public String getIncome() {
//		return income;
//	}
//	public void setIncome(String income) {
//		this.income = income;
//	}
//	public String getJobTime() {
//		return jobTime;
//	}
//	public void setJobTime(String jobTime) {
//		this.jobTime = jobTime;
//	}
//	public Object getPenetrate() {
//		return penetrate;
//	}
//	public void setPenetrate(Object penetrate) {
//		this.penetrate = penetrate;
//	}
//
//	
//}
