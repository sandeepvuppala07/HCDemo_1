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

	String folderpath=System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+"static";
	String filepath;
	@Override
	public RtaUserdetails saveUser(RtaUserdetailsDto rtaUserDetailsdto,MultipartFile file) {
		if(file!=null) {
			try {
				//rtaUserDetailsdto.setBplCard(ImageUtil.compressImage(file.getBytes()));
				filepath = folderpath+file.getOriginalFilename();
				rtaUserDetailsdto.setFilepath(filepath);
				file.transferTo(new File(filepath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		RtaUserdetails rtaUserdetails = modelmapper.map(rtaUserDetailsdto, RtaUserdetails.class);
		return rtaUserRepository.save(rtaUserdetails);
	}
	
	public void captchaService(RtaUserdetailsDto rtaUserdetailsDto) {
		Captcha captcha = CaptchaUtils.createCaptcha(240, 70);
		rtaUserdetailsDto.setHiddenCaptcha(captcha.getAnswer());
		rtaUserdetailsDto.setUserCaptcha(""); // value entered by the User
		rtaUserdetailsDto.setRealCaptcha(CaptchaUtils.encodeCaptcha(captcha));
		
	}

}
