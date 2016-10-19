package space.strategia.chron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by satalin on 10/18/16.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage() {
        return "home";
    }
}
