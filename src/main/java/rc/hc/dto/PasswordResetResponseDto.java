package rc.hc.dto;

public class PasswordResetResponseDto {

	private OtpStatus otpStatus;
	private String message;
	
	public OtpStatus getOtpStatus() {
		return otpStatus;
	}
	public void setOtpStatus(OtpStatus otpStatus) {
		this.otpStatus = otpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PasswordResetResponseDto(OtpStatus otpStatus, String message) {
		super();
		this.otpStatus = otpStatus;
		this.message = message;
	}
	
}
