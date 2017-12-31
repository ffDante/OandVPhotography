package com.oandv.session;

import com.oandv.model.Session;
import com.oandv.service.SecurityService;
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
    SessionService sessionService;
    @Autowired
    SecurityService securityService;


    @RequestMapping(value = "/list-sessions", method = RequestMethod.GET)
    public String showListOfSessions(ModelMap model) {
        String user = securityService.getLoggedInUserName();
        model.addAttribute("sessions", sessionService.findAllSessionsForUser(user));
        return "list-sessions";
    }

    @RequestMapping(value = "/add-session", method = RequestMethod.GET)
    public String showAddSessionPage(ModelMap model) {
        model.addAttribute("session", new Session());
        return "session";
    }

}
