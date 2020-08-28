package aws.learning.lambdaDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class LambdaDemoApplicationController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }

}
