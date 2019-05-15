package com.project.ProjectTools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/magie")
public class MagieController {

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String list(Model model) {
        return "magie/list";
    }

    @RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
    public String detail(Model model) {
        return "magie/detail";
    }

    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public String form(Model model) {
        return "magie/form";
    }

    @RequestMapping(value = {"/attaqueForm"}, method = RequestMethod.GET)
    public String attaqueForm(Model model) {
        return "magie/attaqueForm";
    }
}