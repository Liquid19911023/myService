package mySpringBoot.myService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
/*@ComponentScan(basePackages = {"org.test.server.action"})*/
@SpringBootApplication
public class ServiceStart {
    public static void main( String[] args ){
        SpringApplication.run(ServiceStart.class, args);
    }
}
