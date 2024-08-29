package com.bank.transaction.service;

import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements IServices {

    @Override
    public String add (String option){
        return "Se ejecuto metodo para agregar " + option;
    }

    @Override
    public String get (String option){
        return "Se ejecuto metodo para obtener " + option;
    }

    @Override
    public String delete (String option){
        return "Se ejecuto metodo para eliminar " + option;
    }

    @Override
    public String update (String option){
        return "Se ejecuto metodo para actualizar " + option;
    }
}
