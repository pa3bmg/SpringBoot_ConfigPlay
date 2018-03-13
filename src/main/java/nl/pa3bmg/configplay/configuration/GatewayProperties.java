package nl.pa3bmg.configplay.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("config")
public class GatewayProperties {
private @Getter @Setter  List<Gateway> gateways = new ArrayList<Gateway>();
	
	public static class Gateway
    {
        @Getter @Setter private String id;
        @Getter @Setter private int t1;
        @Getter @Setter private int t2;
    }
}
