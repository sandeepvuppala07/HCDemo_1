package rc.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


  @Controller
  public class FormController {
  
		/*
		 * @GetMapping("/form") public ModelAndView registrationForm(){ ModelAndView
		 * modelAndView = new ModelAndView();
		 * modelAndView.setViewName("registrationform"); return modelAndView; }
		 */
	  
	  @GetMapping("/formtest")
		public String formtest(){
			
		 return "RtiPages/rti_register1";
		}
  
  }
 

