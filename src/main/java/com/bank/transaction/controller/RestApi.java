package com.bank.transaction.controller;

import com.bank.transaction.service.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RestApi {
    @Autowired
    private IServices action;

    @GetMapping("api/v1/{option}")
    private String action(@PathVariable String option) {
        return action.action(option);
    }

}
