package rc.hc.dto;


import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

//import rc.hc.customvalidations.BplConstraint;

//@BplConstraint(value = { "bpl","bplNo","bplCard" })
@Component
public class RtaUserdetailsDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId; 
	
	@NotNull(message = "Citizen Must not be Empty and NULL")
	private Integer citizen;
	
	@NotBlank(message = "User Name Must not be Empty and NULL")
	private String userName ; 
	
	@NotBlank(message = "User Name Must not be Empty and NULL")
	private String fatherName;
	
	private Integer gender ;
	
	
	@Pattern(regexp = "^[\\/\\\\-_\\+() \\?\\.,=@\"a-zA-Z0-9 ]+$", message = "Address must be valid")
	private String address ;
	
	@NotNull(message = "State Must not be Empty and NULL")
	private Integer stateId ;
	
	@NotNull(message = "District Must not be Empty and NULL")
	private Integer districtId;
	
	@NotNull(message = "Pincode Must not be Empty and NULL")
	private Integer pincode;
	
	@NotNull(message = "BPL Feild is Mandatory")
	private Integer bpl ; 
	//@BplConstraint(value = { "" })
	private String bplNo; 
	
	private byte [] bplCard ;
	
	@NotNull(message = "Security Question Must not be Empty and NULL")
	private Integer securityQuesId ;
	
	@NotBlank(message = "Security Answer Must not be Empty and NULL")
	private String securityAns;
	
	@Email(message = "Mail Id Must Valid")
	private String mailId; 
	
	@Pattern(regexp = "^\\d{10}$", message = "Mobile Number is not valid")
	private String mobileNo;
	
	private String userCaptcha;
	
	private String hiddenCaptcha;

	private String realCaptcha;

	private String filepath;
	
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

	public String getUserCaptcha() {
		return userCaptcha;
	}

	public void setUserCaptcha(String userCaptcha) {
		this.userCaptcha = userCaptcha;
	}

	public String getHiddenCaptcha() {
		return hiddenCaptcha;
	}

	public void setHiddenCaptcha(String hiddenCaptcha) {
		this.hiddenCaptcha = hiddenCaptcha;
	}

	public String getRealCaptcha() {
		return realCaptcha;
	}

	public void setRealCaptcha(String realCaptcha) {
		this.realCaptcha = realCaptcha;
	}
	
	

}
