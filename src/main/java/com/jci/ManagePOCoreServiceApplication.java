package com.jci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan
@EnableScheduling
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ManagePOCoreServiceApplication {
	
	public static void main(String[] args) {
		System.out.println("### Starting Ending ManagePOCoreServiceApplication.main ###");
        SpringApplication.run(ManagePOCoreServiceApplication.class, args);
    }
	
	@Autowired
	public void setEnvironment(Environment e) {
		System.out.println("####### Environment:"+e.getProperty("configuration.projectName"));
	}

}
