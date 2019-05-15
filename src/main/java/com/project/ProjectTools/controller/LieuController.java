package com.project.ProjectTools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/lieu")
public class LieuController {

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String list(Model model){
        return "lieu/list";
    }

    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public String form(Model model){
        return "lieu/form";
    }

    @RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
    public String detail(Model model){
        return "lieu/detail";
    }
}
