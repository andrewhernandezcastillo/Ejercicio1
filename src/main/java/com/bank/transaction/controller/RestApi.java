package com.bank.transaction.controller;

import com.bank.transaction.service.IServices;
import com.bank.transaction.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class RestApi {
    @Autowired
    private Services action;

    @GetMapping("api/v1/{option}")
    private String actionGet(@PathVariable String option) {
        return action.get(option);
    }

    @PostMapping("api/v1/")
    private String actionPost(String option){
        return action.add(option);
    }

    @DeleteMapping("api/v1/{option}")
    private String actionDelete(@PathVariable String option){
        return action.delete(option);
    }

    @PutMapping("api/v1/{option}")
    private String actionPut(@PathVariable String option){
        return action.update(option);
    }

}
