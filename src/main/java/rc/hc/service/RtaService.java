package rc.hc.service;

import org.springframework.web.multipart.MultipartFile;

import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.model.RtaUserdetails;

public interface RtaService {
	
	public RtaUserdetails saveUser( RtaUserdetailsDto rtaUserDetailsdto);
	public void captchaService(RtaUserdetailsDto rtaUserdetailsDto);
}
