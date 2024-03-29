package springbootocp4s2ihello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
@Configuration
public class SpringbootOcp4S2iHelloApplication {
    
	@Value("${test.msg}")
        String msg;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootOcp4S2iHelloApplication.class, args);
		System.out.println("Test1=======================");
	}
	
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String getHello() {
		return msg;
	}

}
