package com.LabourDekho.LabourDekho.JobController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JobController {

    @GetMapping("/hello")
    public String hello() {
        return "LabourDekho API is running! 🚀";
    }
}