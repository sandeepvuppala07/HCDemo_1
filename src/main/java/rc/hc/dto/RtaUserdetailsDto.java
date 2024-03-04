package rc.hc.dto;


import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

//import rc.hc.customvalidations.BplConstraint;

//@BplConstraint(value = { "bpl","bplNo","bplCard" })
@Component
public class RtaUserdetailsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId; 
	
	//@NotNull(message = "Citizen Must not be Empty and NULL")
	private Integer citizen;
	
	//@NotBlank(message = "User Name Must not be Empty and NULL")
	private String userName ; 
	
	//@NotBlank(message = "User Name Must not be Empty and NULL")
	private String fatherName;
	
	private Integer gender ;
	
	
	//@Pattern(regexp = "^[\\/\\\\-_\\+() \\?\\.,=@\"a-zA-Z0-9 ]+$", message = "Address must be valid")
	private String address ;
	
	//@NotNull(message = "State Must not be Empty and NULL")
	private Integer stateId ;
	
	//@NotNull(message = "District Must not be Empty and NULL")
	private Integer districtId;
	
	//@NotNull(message = "Pincode Must not be Empty and NULL")
	private Integer pincode;
	
	//@NotNull(message = "BPL Feild is Mandatory")
	private Integer bpl ; 
	//@BplConstraint(value = { "" })
	private String bplNo; 
	
	private byte [] bplCard ;
	
	//@NotNull(message = "Security Question Must not be Empty and NULL")
	private Integer securityQuesId ;
	
	//@NotBlank(message = "Security Answer Must not be Empty and NULL")
	private String securityAns;
	
	//@Email(message = "Mail Id Must Valid")
	private String mailId; 
	
	//@Pattern(regexp = "^\\d{10}$", message = "Mobile Number is not valid")
	private String mobileNo;
	
	private String userCaptcha_1;
	
	private String hiddenCaptcha_1;

	private String realCaptcha_1;

	private String userCaptcha_2;
	
	private String hiddenCaptcha_2;

	private String realCaptcha_2;
	
	private String filepath;
	
	private String captchaMessage_1;
	
	private String captchaMessage_2;
	
	private MultipartFile bplfile;
	
	public MultipartFile getBplfile() {
		return bplfile;
	}

	public void setBplfile(MultipartFile bplfile) {
		this.bplfile = bplfile;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCitizen() {
		return citizen;
	}

	public void setCitizen(Integer citizen) {
		this.citizen = citizen;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getBpl() {
		return bpl;
	}

	public void setBpl(Integer bpl) {
		this.bpl = bpl;
	}

	public String getBplNo() {
		return bplNo;
	}

	public void setBplNo(String bplNo) {
		this.bplNo = bplNo;
	}


	public byte[] getBplCard() {
		return bplCard;
	}

	public void setBplCard(byte[] bplCard) {
		this.bplCard = bplCard;
	}

	public Integer getSecurityQuesId() {
		return securityQuesId;
	}

	public void setSecurityQuesId(Integer securityQuesId) {
		this.securityQuesId = securityQuesId;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserCaptcha_1() {
		return userCaptcha_1;
	}

	public void setUserCaptcha_1(String userCaptcha_1) {
		this.userCaptcha_1 = userCaptcha_1;
	}

	public String getHiddenCaptcha_1() {
		return hiddenCaptcha_1;
	}

	public void setHiddenCaptcha_1(String hiddenCaptcha_1) {
		this.hiddenCaptcha_1 = hiddenCaptcha_1;
	}

	public String getRealCaptcha_1() {
		return realCaptcha_1;
	}

	public void setRealCaptcha_1(String realCaptcha_1) {
		this.realCaptcha_1 = realCaptcha_1;
	}

	public String getUserCaptcha_2() {
		return userCaptcha_2;
	}

	public void setUserCaptcha_2(String userCaptcha_2) {
		this.userCaptcha_2 = userCaptcha_2;
	}

	public String getHiddenCaptcha_2() {
		return hiddenCaptcha_2;
	}

	public void setHiddenCaptcha_2(String hiddenCaptcha_2) {
		this.hiddenCaptcha_2 = hiddenCaptcha_2;
	}

	public String getRealCaptcha_2() {
		return realCaptcha_2;
	}

	public void setRealCaptcha_2(String realCaptcha_2) {
		this.realCaptcha_2 = realCaptcha_2;
	}

	public String getCaptchaMessage_1() {
		return captchaMessage_1;
	}

	public void setCaptchaMessage_1(String captchaMessage_1) {
		this.captchaMessage_1 = captchaMessage_1;
	}

	public String getCaptchaMessage_2() {
		return captchaMessage_2;
	}

	public void setCaptchaMessage_2(String captchaMessage_2) {
		this.captchaMessage_2 = captchaMessage_2;
	}
	

}
