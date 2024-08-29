package com.bank.transaction.controller;

import com.bank.transaction.service.ServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RestApi {

    private final ServicesImpl action;

    @PostMapping("add/{option}")
    private String add(@PathVariable String option) {
        return action.add(option);
    }

    @GetMapping("get/{option}")
    private String get(@PathVariable String option) {
        return action.get(option);
    }

    @PatchMapping("patch/{option}")
    private String patch(@PathVariable String option) {
        return action.update(option);
    }

    @DeleteMapping("delete/{option}")
    private String delete(@PathVariable String option) {
        return action.delete(option);
    }

}
