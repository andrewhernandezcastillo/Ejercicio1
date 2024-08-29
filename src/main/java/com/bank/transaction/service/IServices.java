package com.bank.transaction.service;

import org.springframework.stereotype.Service;

@Service
public class IServices implements Services{


    @Override
    public String add(String option) {
        return "Agregar dato: " + option;
    }

    @Override
    public String get(String option) {
        return "Solicitar dato: " + option;
    }

    @Override
    public String delete(String option) {
        return "Eliminar dato: " + option;
    }

    @Override
    public String update(String option) {
        return "Modificar dato: " + option;
    }
}
