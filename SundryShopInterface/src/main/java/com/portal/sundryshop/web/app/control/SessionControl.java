package com.portal.sundryshop.web.app.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.portal.sundryshop.web.constant.AppConstants.APP_NAME;
import static com.portal.sundryshop.web.constant.CommonsValues.*;

/**
 * @author GchengC.
 * @since mar.2023
 **/
@Controller
@RequestMapping(path = "/session")
public class SessionControl {

    @GetMapping(path = "/sign-in")
    public String signIn(Model model) {
        model.addAttribute(KEY_TITLE, APP_NAME.concat(" - Login"));
        return TEMPLATE_SESSION_SIGN_IN;
    }

    @GetMapping(path = "/sign-up")
    public String signUp(Model model) {
        model.addAttribute(KEY_TITLE, APP_NAME.concat(" - Register"));
        return TEMPLATE_SESSION_SIGN_UP;
    }
}
