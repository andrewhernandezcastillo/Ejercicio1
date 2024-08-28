package com.bank.transaction.service;

import org.springframework.stereotype.Service;

@Service
public class IServices {

    public String action(String option){
        if(option.equals("1")){
            return add(option);
        }else if(option.equals("2")){
            return delete(option);
        } else if(option.equals("3")){
            return update(option);
        }else if(option.equals("4")){
            return get(option);
        }else {
            return "No hay operacion disponible";
        }
    }

    private String add (String option){
        return "Se ejecuto metodo para agregar" + option;
    }

    private String get (String option){
        return "Se ejecuto metodo para agregar";
    }

    private String delete (String option){
        return "Se ejecuto metodo para agregar";
    }

    private String update (String option){
        return "Se ejecuto metodo para agregar";
    }

}
