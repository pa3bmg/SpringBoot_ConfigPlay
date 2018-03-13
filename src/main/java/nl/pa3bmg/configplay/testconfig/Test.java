package nl.pa3bmg.configplay.testconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;
import nl.pa3bmg.configplay.configuration.GatewayProperties;



@Controller
public class Test {
	private GatewayProperties gatewayProperties;
	
	@Autowired
    public void setApp(GatewayProperties gatewayProperties) {
        this.gatewayProperties = gatewayProperties;
    }
	
	private Test() {
		System.out.println("Test");
		System.out.println(gatewayProperties);
	}
	
}
