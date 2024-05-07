package develhope.esercizio90DeployEnvironmentsVariables02.controllers;

import develhope.esercizio90DeployEnvironmentsVariables02.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private YAMLConfig yamlConfig;

    @GetMapping("/")
    public String welcome() {
        return yamlConfig.getWelcomeMsg();
    }
}
