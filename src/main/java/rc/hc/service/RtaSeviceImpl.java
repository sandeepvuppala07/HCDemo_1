package rc.hc.service;

import java.io.File;
import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.apiclub.captcha.Captcha;
import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.model.RtaUserdetails;
import rc.hc.repo.RtaUserRepository;
import rc.hc.utils.CaptchaUtils;
import rc.hc.utils.ImageUtil;

@Service
public class RtaSeviceImpl implements RtaService {

	@Autowired
	private RtaUserRepository rtaUserRepository;
	
	@Autowired
	private ModelMapper modelmapper;

	@Autowired
	private RtaUserdetailsDto rtaUserdetailsDto;

	String folderpath=System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"+File.separator+"bpl_storarage"+File.separator;///HCDemo_1/src/main/resources/static/bpl_storarage
	String filepath;
	@Override
	public RtaUserdetails saveUser(RtaUserdetailsDto rtaUserDetailsdto) {
		if(rtaUserDetailsdto.getBplfile()!=null) {
			try {
				//rtaUserDetailsdto.setBplCard(ImageUtil.compressImage(file.getBytes()));
				filepath = folderpath+rtaUserDetailsdto.getBplfile().getOriginalFilename();
				rtaUserDetailsdto.setFilepath(filepath);
				rtaUserDetailsdto.getBplfile().transferTo(new File(filepath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		RtaUserdetails rtaUserdetails = modelmapper.map(rtaUserDetailsdto, RtaUserdetails.class);
		return rtaUserRepository.save(rtaUserdetails);
	}
	
	public void captchaService(RtaUserdetailsDto rtaUserdetailsDto) {
		Captcha captcha1 = CaptchaUtils.createCaptcha(200,45);
		rtaUserdetailsDto.setHiddenCaptcha_1(captcha1.getAnswer());
		rtaUserdetailsDto.setUserCaptcha_1(""); // value entered by the User
		rtaUserdetailsDto.setRealCaptcha_1(CaptchaUtils.encodeCaptcha(captcha1));
		
		Captcha captcha2 = CaptchaUtils.createCaptcha(200,45);
		rtaUserdetailsDto.setHiddenCaptcha_2(captcha2.getAnswer());
		rtaUserdetailsDto.setUserCaptcha_2(""); // value entered by the User
		rtaUserdetailsDto.setRealCaptcha_2(CaptchaUtils.encodeCaptcha(captcha2));
		
	}

}
