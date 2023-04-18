package com.portal.sundryshop.web.app.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.portal.sundryshop.web.constant.AppConstants.APP_NAME;
import static com.portal.sundryshop.web.constant.CommonsValues.KEY_TITLE;
import static com.portal.sundryshop.web.constant.CommonsValues.TEMPLATE_MAIN;

/**
 * @author GchengC.
 * @since abr.2023
 **/
@Controller
public class SundryShopControl {

    @GetMapping(path = {"", "/"})
    public String mainView(Model model) {
        model.addAttribute(KEY_TITLE, APP_NAME);
        return TEMPLATE_MAIN;
    }
}
