package rc.hc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "rtauserdetails")
public class RtaUserdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Integer userId;

	@Column(name = "citizenofind")
	private Integer citizen;

	@Column(name = "username")
	private String userName;

	@Column(name = "fathername")
	private String fatherName;

	@Column(name = "usergender")
	private Integer gender;

	@Column(name = "useraddress")
	private String address;

	@Column(name = "userstateid")
	private Integer stateId;

	@Column(name = "userdistrictid")
	private Integer districtId;

	@Column(name = "userpincode")
	private Integer pincode;

	@Column(name = "userbpl")
	private Integer bpl;

	@Column(name = "bplno")
	private String bplNo;

	@Lob
	@Column(name = "bplcard")
	private byte [] bplCard;

	@Column(name = "securityquesid")
	private Integer securityQuesId;

	@Column(name = "securityans")
	private String securityAns;

	@Column(name = "usermailid")
	private String mailId;

	@Column(name = "usermobileno")
	private String mobileNo;

	@Column(name = "filepath")
	private String filepath;
	
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

}
