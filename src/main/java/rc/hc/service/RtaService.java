package rc.hc.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.dto.UserDistrictDto;
import rc.hc.dto.UserStateDto;
import rc.hc.model.RtaUserdetails;

public interface RtaService {
	
	public RtaUserdetails saveUser( RtaUserdetailsDto rtaUserDetailsdto);
	public void captchaService(RtaUserdetailsDto rtaUserdetailsDto);
	public List<UserStateDto> getStates();
	public List<UserDistrictDto> getDistrictByStateId(Integer stateId);
}
