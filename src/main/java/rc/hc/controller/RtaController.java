package rc.hc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.service.RtaService;

@Controller
public class RtaController {
	/*	
	@Autowired
	RtaService rtaService;
	
	//@RequestMapping(value = "/register", method = RequestMethod.POST)
	@PostMapping("/register")
	public  ResponseEntity<?> saveUser(@RequestBody RtaUserdetailsDto rtaUserDetailsDto) throws Exception {
		
		System.out.println("Controller called");
		return ResponseEntity.ok(rtaService.saveUser(rtaUserDetailsDto));
	}
@PostMapping("/use")
	public  ResponseEntity<?> demoUse() throws Exception {
		
		System.out.println("Controller called");
		return (ResponseEntity<?>) ResponseEntity.ok();
	}
	
	
	
	 * public String getCall() { return ""; }
	 */
	
}
