package co.develhope.environment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {
    @Autowired
    private Environment environment;
    @GetMapping("/")
    public String code() {
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return devName + ", this is your generated code: " + authCode;
    }
}
