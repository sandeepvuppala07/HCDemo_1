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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import rc.hc.dto.RtaUserdetailsDto;
import rc.hc.service.ImageStorageService;
import rc.hc.service.RtaService;

@Controller
public class AdminController {

	@Autowired
	RtaService rtaService;
	
	@Autowired
	ImageStorageService imageStorageService;

	/*
	 * @GetMapping("/form") public ModelAndView registrationForm(){ ModelAndView
	 * modelAndView = new ModelAndView(); RtaUserdetailsDto rtaUserDetailsDto = new
	 * RtaUserdetailsDto(); modelAndView.setViewName("regform");
	 * modelAndView.addObject("rtaUserDetailsDto", rtaUserDetailsDto); return
	 * modelAndView; }
	 */	
	
	
	@GetMapping("/form")
	public String registrationForm(Model model){
		RtaUserdetailsDto rtaUserDetailsDto = new RtaUserdetailsDto();
		model.addAttribute("rtaUserDetailsDto", rtaUserDetailsDto);
		return "regform";
	}

	/*
	 * @PostMapping("/register") public ModelAndView saveUser(@Valid @ModelAttribute
	 * RtaUserdetailsDto rtaUserDetailsDto, BindingResult bindingResult,
	 * 
	 * @RequestParam(value="bplcard", required = false) MultipartFile file) throws
	 * Exception { //String uploadImage = imageStorageService.uplaodFile(file);
	 * ModelAndView modelAndView = new ModelAndView(); if
	 * (bindingResult.hasErrors()) { modelAndView.setViewName("regform");
	 * modelAndView.addObject("rtaUserDetailsDto", rtaUserDetailsDto); return
	 * modelAndView; } return new ModelAndView(); }
	 */
	
	
	@PostMapping("/register")
	public String saveUser(@Valid @ModelAttribute("rtaUserDetailsDto") RtaUserdetailsDto rtaUserDetailsDto,
			BindingResult bindingResult,
			@RequestParam(value="bplcard", required = false) MultipartFile file,
			Model model) throws Exception {
				//String uploadImage = imageStorageService.uplaodFile(file);
				
				if (bindingResult.hasErrors()) {
					bindingResult.getAllErrors().stream().map(msg->msg.getDefaultMessage()).forEach(System.out::println);
					model.addAttribute("rtaUserDetailsDto", rtaUserDetailsDto);
					return "regform";
		        }
				return "login";
	}
	
	@PostMapping("/uploadimage")
	public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException{
		String uploadImage = imageStorageService.uplaodFile(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
		
	}
	@GetMapping("/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable String filename){
		byte[] imageData =imageStorageService.dowmloadFile(filename);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/jpeg"))
				.body(imageData);
	}


}



