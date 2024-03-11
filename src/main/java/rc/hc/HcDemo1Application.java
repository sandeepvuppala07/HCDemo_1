package rc.hc;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.twilio.Twilio;

import rc.hc.config.TwilioConfig;

@SpringBootApplication
public class HcDemo1Application {

	@Autowired
	TwilioConfig twilioConfig;
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(HcDemo1Application.class);
		springApplication.run(args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@PostConstruct
	public void initTwilio() {
		
		Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
	}
}
