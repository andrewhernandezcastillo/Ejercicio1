package com.bank.transaction.controller;

import com.bank.transaction.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RestApi {
    @Autowired
    private Services action;

    @PostMapping ("api/v1/{option}")
    private String add(@PathVariable String option) {
        return action.add(option);
    }

    @GetMapping("api/v1/{option}")
    private String get(@PathVariable String option) {
        return action.get(option);
    }

    @DeleteMapping("api/v1/{option}")
    private String delete(@PathVariable String option) {return action.delete(option);
    }

    @PatchMapping("api/v1/{option}")
    private String action(@PathVariable String option) {return action.update(option);
    }

}
