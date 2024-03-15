package com.test.test1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class IndexController {
    @GetMapping(value = {"/index.html", "/"})
    public String index(Model model) throws UnknownHostException {
        InetAddress ipAddress = InetAddress.getLocalHost();

        model.addAttribute("ip", ipAddress.getAddress());
        return "index";
    }
}
