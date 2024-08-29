package com.bank.transaction.service;

import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@Service
public class IServices implements Services {

    @Override
    public String add(String option){
        return "Se ejecuto metodo para agregar" + option;
    }
    @Override
    public String get(String option){
        return "Se ejecuto metodo para agregar";
    }
    @Override
    public String delete(String option){
        return "Se ejecuto metodo para agregar";
    }
    @Override
    public String update(String option){
        return "Se ejecuto metodo para agregar";
    }
}
