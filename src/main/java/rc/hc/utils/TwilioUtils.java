package rc.hc.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import rc.hc.config.TwilioConfig;
import rc.hc.dto.OtpStatus;
import rc.hc.dto.PasswordResetRequestDto;
import rc.hc.dto.PasswordResetResponseDto;

@Service
public class TwilioUtils {
	
	@Autowired
	private TwilioConfig twilioConfig;
       
	private String otp;
	
	private String messageBody;
	
	Map<String,String> otpMap = new HashMap<>();
	public  PasswordResetResponseDto senOtpForMobNo(PasswordResetRequestDto passwordResetRequestDto) {
		 otp =generateOtp();
		 messageBody="Thanks for Registering With RTA, here is your otp: "+otp;
		PasswordResetResponseDto passwordResetResponseDto = null;
		try {

			PhoneNumber to = new PhoneNumber(passwordResetRequestDto.getPhNumber());
			PhoneNumber from= new PhoneNumber(twilioConfig.getTrialNumber());
			
			Message message = Message
	                .creator(to,from,messageBody)
	                .create();
			otpMap.put(passwordResetRequestDto.getEmail(),otp);
			passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.DELIVERED,messageBody);
		}catch(Exception ex) {
			passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.FAILED,ex.getMessage());
		}
        return passwordResetResponseDto;
		
	}
	
	//six digit otp
	public String generateOtp() {
		return new DecimalFormat("000000")
				.format(new Random().nextInt(999999));
	}
	
	public String validateOtp(String userIpOtp, String userName) {
		
		if(userIpOtp.equalsIgnoreCase(otpMap.get(userName))) {
			return "valid OTP";
		}
		else {
			return "Invalid OTP";
		}
	}
}
