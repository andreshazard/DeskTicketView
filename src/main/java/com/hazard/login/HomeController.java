package com.hazard.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * First page of the web app.
 * SpringSecurity will control the login
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        return "home";
    }

    @RequestMapping(value = "/ticket", method = RequestMethod.GET)
    public String showTicketPage() {
        return "redirect:/";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String showCustomerPage() {

        return "customer";
    }

    @RequestMapping(value = "/home_error", method = RequestMethod.GET)
    public String showHomeErrorPage() {
        return "home_error";
    }

}
