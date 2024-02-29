package rc.hc.service;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.model.RtaUserdetails;
import rc.hc.repo.RtaUserRepository;
import rc.hc.utils.ImageUtil;

@Service
public class RtaSeviceImpl implements RtaService {

	@Autowired
	RtaUserRepository rtaUserRepository;
	
	@Autowired
	ModelMapper modelmapper;

	@Override
	public RtaUserdetails saveUser(RtaUserdetailsDto rtaUserDetailsdto,MultipartFile file) {
		if(file!=null) {
			try {
				rtaUserDetailsdto.setBplCard(ImageUtil.compressImage(file.getBytes()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RtaUserdetails rtaUserdetails = modelmapper.map(rtaUserDetailsdto, RtaUserdetails.class);
		return rtaUserRepository.save(rtaUserdetails);
	}

}
