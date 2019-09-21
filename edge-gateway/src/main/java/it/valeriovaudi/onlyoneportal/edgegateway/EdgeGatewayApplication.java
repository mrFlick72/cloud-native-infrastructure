package it.valeriovaudi.onlyoneportal.edgegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EdgeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeGatewayApplication.class, args);

    }
}

@Controller
class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/app")
    public String app(){
        return "app/index";
    }
}

