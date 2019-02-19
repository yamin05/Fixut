package Fixut.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;

@Controller
public class IndexController {

    @Value("${app.name}")
    private String appName;

    @GetMapping({"/", "home"})
    public String getHomePage(ModelMap modelMap) {
//        this.addAttributes(modelMap);
//        modelMap.addAttribute("pageTitle", services.applicationService.getEnv().getProperty("app.name"));
        return "home";
    }

    @RequestMapping(value = {"/login", "/signin"}, method = RequestMethod.GET)
    public String getLoginPage() {
        return "login2";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }

    //Set the values here that always needs to be present in the jsp page
    @ModelAttribute
    public void addAttributes(ModelMap model) {
        model.addAttribute("pageTitle", appName);
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
    }
}
