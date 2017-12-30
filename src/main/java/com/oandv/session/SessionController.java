package com.oandv.session;

import com.oandv.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {

    @Autowired
    SessionService service;

    @RequestMapping(value = "/list-sessions", method = RequestMethod.GET)
    public String showListOfSessions(ModelMap model) {
        String user = getLoggedInUserName();
        model.addAttribute("sessions", service.findAllSessionsForUser(user));
        return "list-sessions";
    }

    private String getLoggedInUserName() {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails)
            return ((UserDetails) principal).getUsername();

        return principal.toString();
    }

}
