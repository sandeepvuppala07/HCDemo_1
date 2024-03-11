package rc.hc.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import rc.hc.dto.PasswordResetRequestDto;
import rc.hc.dto.PasswordResetResponseDto;
import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.service.ImageStorageService;
import rc.hc.service.RtaService;
import rc.hc.utils.TwilioUtils;

@Controller
public class AdminController {

	@Autowired
	RtaService rtaService;

	@Autowired
	ImageStorageService imageStorageService;

	@Autowired
	TwilioUtils twilioUtils;
	/*
	 * @Autowired RtaUserdetailsDto rtaUserdetailsDto;
	 */

	@GetMapping(path = "/form", produces = { MediaType.MULTIPART_FORM_DATA_VALUE,MediaType.TEXT_PLAIN_VALUE })
	public String registrationForm(Model model,@ModelAttribute("rtaUserDetailsDto") RtaUserdetailsDto rtaUserDetailsDto) {
		rtaService.captchaService(rtaUserDetailsDto);
		model.addAttribute("rtaUserDetailsDto", rtaUserDetailsDto);
		return "RtiPages/rti_register";
	}
	
	@PostMapping(path = "/register", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE,MediaType.TEXT_PLAIN_VALUE })
	public String saveUser(@ModelAttribute("rtaUserDetailsDto") RtaUserdetailsDto rtaUserDetailsDto,
			RedirectAttributes redirectAttributes) throws Exception {

		if (!rtaUserDetailsDto.getUserCaptcha_1().equals(rtaUserDetailsDto.getHiddenCaptcha_1())) {
			rtaUserDetailsDto.setCaptchaMessage_1("Invalid Captcha");
			redirectAttributes.addFlashAttribute("rtaUserDetailsDto", rtaUserDetailsDto);
			return "redirect:form";
		}
		rtaService.saveUser(rtaUserDetailsDto);
		return "login";
	}

	@PostMapping("/uploadimage")
	public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
		String uploadImage = imageStorageService.uplaodFile(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
	}

	@GetMapping("/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable String filename) {
		byte[] imageData = imageStorageService.dowmloadFile(filename);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/jpeg")).body(imageData);
	}
    
	@GetMapping("/sendotp")
	@ResponseBody
	public PasswordResetResponseDto sendOtp(@RequestBody PasswordResetRequestDto passwordResetRequestDto) {
		return twilioUtils.senOtpForMobNo(passwordResetRequestDto);
	}
	
	@GetMapping("/validateotp/{userIpOtp}/{userName}")
	@ResponseBody
	public String validateOtp(@PathVariable("userIpOtp")String userIpOtp, @PathVariable("userName")String userName) {
		return twilioUtils.validateOtp(userIpOtp, userName);
	}
	
}



