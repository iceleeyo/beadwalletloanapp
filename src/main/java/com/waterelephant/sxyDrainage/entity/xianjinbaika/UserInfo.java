//package com.waterelephant.sxyDrainage.entity.xianjinbaika;
//
///**
// * Module: UserInfo.java
// * (code:xjbk)
// *
// * @author huangjin
// * @version 1.0
// * @description: <描述>
// * @since JDK 1.8
// */
//public class UserInfo {
//    private String user_name;//string	是	用户身份证姓名
//    private String user_phone;//	string	是	用户明文手机号
//    private String user_idcard;//	string	是	用户明文身份证号
//    private String loan_use;    //string	是	贷款用途 1: 装修,2: 婚庆,3: 旅游,4: 教育,5: 租房,6: 汽车周边,7: 电子数码产品,8: 医疗,9: 其他,10: 家用电器,11: 家具家居
//    private String degree;//string	是	教育程度 1中专/高中以下 2大专 3本科 4硕士 5博士及以上
//    private FamilyInfo family_info;//家庭信息
//
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
//
//    public String getUser_phone() {
//        return user_phone;
//    }
//
//    public void setUser_phone(String user_phone) {
//        this.user_phone = user_phone;
//    }
//
//    public String getUser_idcard() {
//        return user_idcard;
//    }
//
//    public void setUser_idcard(String user_idcard) {
//        this.user_idcard = user_idcard;
//    }
//
//    public String getLoan_use() {
//        return loan_use;
//    }
//
//    public void setLoan_use(String loan_use) {
//        this.loan_use = loan_use;
//    }
//
//    public String getDegree() {
//        return degree;
//    }
//
//    public void setDegree(String degree) {
//        this.degree = degree;
//    }
//
//    public FamilyInfo getFamily_info() {
//        return family_info;
//    }
//
//    public void setFamily_info(FamilyInfo family_info) {
//        this.family_info = family_info;
//    }
//    //	private String user_name;// 用户身份证姓名
////	private String user_phone;// 用户明文手机号
////	private String id_number;// 用户明文身份证号
////	private String profession_type;// 职业类型 1上班族 2企业主 3个体户 4学生 5自由职业
////	private String face_recognition_picture;// 活体识别头像URL
////	private String id_number_picture;// 手持身份证头像URL
////	private String id_number_z_picture;// 身份证正面照片URL
////	private String id_number_f_picture;// 身份证反面照片URL
////	private String ocr_race;// OCR识别身份证民族
////	private String ocr_address;// OCR识别身份证地址
////	private String ocr_name;// OCR识别身份证姓名
////	private String ocr_sex;// OCR识别身份证性别
////	private String ocr_birthday;// OCR识别身份证出生日期
////	private String ocr_id_number;// OCR识别身份证号
////	private String ocr_issued_by;// OCR识别身份证发证机关
////	private String ocr_start_time;// OCR识别身份证有效期开始时间
////	private String ocr_end_time;// OCR识别身份证有效期结束时间
////
////	public String getUser_name() {
////		return user_name;
////	}
////
////	public void setUser_name(String user_name) {
////		this.user_name = user_name;
////	}
////
////	public String getUser_phone() {
////		return user_phone;
////	}
////
////	public void setUser_phone(String user_phone) {
////		this.user_phone = user_phone;
////	}
////
////	public String getId_number() {
////		return id_number;
////	}
////
////	public void setId_number(String id_number) {
////		this.id_number = id_number;
////	}
////
////	public String getProfession_type() {
////		return profession_type;
////	}
////
////	public void setProfession_type(String profession_type) {
////		this.profession_type = profession_type;
////	}
////
////	public String getFace_recognition_picture() {
////		return face_recognition_picture;
////	}
////
////	public void setFace_recognition_picture(String face_recognition_picture) {
////		this.face_recognition_picture = face_recognition_picture;
////	}
////
////	public String getId_number_picture() {
////		return id_number_picture;
////	}
////
////	public void setId_number_picture(String id_number_picture) {
////		this.id_number_picture = id_number_picture;
////	}
////
////	public String getId_number_z_picture() {
////		return id_number_z_picture;
////	}
////
////	public void setId_number_z_picture(String id_number_z_picture) {
////		this.id_number_z_picture = id_number_z_picture;
////	}
////
////	public String getId_number_f_picture() {
////		return id_number_f_picture;
////	}
////
////	public void setId_number_f_picture(String id_number_f_picture) {
////		this.id_number_f_picture = id_number_f_picture;
////	}
////
////	public String getOcr_race() {
////		return ocr_race;
////	}
////
////	public void setOcr_race(String ocr_race) {
////		this.ocr_race = ocr_race;
////	}
////
////	public String getOcr_address() {
////		return ocr_address;
////	}
////
////	public void setOcr_address(String ocr_address) {
////		this.ocr_address = ocr_address;
////	}
////
////	public String getOcr_name() {
////		return ocr_name;
////	}
////
////	public void setOcr_name(String ocr_name) {
////		this.ocr_name = ocr_name;
////	}
////
////	public String getOcr_sex() {
////		return ocr_sex;
////	}
////
////	public void setOcr_sex(String ocr_sex) {
////		this.ocr_sex = ocr_sex;
////	}
////
////	public String getOcr_birthday() {
////		return ocr_birthday;
////	}
////
////	public void setOcr_birthday(String ocr_birthday) {
////		this.ocr_birthday = ocr_birthday;
////	}
////
////	public String getOcr_id_number() {
////		return ocr_id_number;
////	}
////
////	public void setOcr_id_number(String ocr_id_number) {
////		this.ocr_id_number = ocr_id_number;
////	}
////
////	public String getOcr_issued_by() {
////		return ocr_issued_by;
////	}
////
////	public void setOcr_issued_by(String ocr_issued_by) {
////		this.ocr_issued_by = ocr_issued_by;
////	}
////
////	public String getOcr_start_time() {
////		return ocr_start_time;
////	}
////
////	public void setOcr_start_time(String ocr_start_time) {
////		this.ocr_start_time = ocr_start_time;
////	}
////
////	public String getOcr_end_time() {
////		return ocr_end_time;
////	}
////
////	public void setOcr_end_time(String ocr_end_time) {
////		this.ocr_end_time = ocr_end_time;
////	}
//
//}
