package com.sagar.projection.controller.web;


import com.sagar.projection.common.annotation.CustomWebController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@CustomWebController
@RequiredArgsConstructor
public class DashboardWebController {

    @GetMapping("/home")
    public String dashboard(Model model) {
        return "dashboard";
    }
}
