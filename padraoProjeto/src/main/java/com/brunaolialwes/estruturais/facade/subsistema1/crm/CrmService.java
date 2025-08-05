package com.brunaolialwes.estruturais.facade.subsistema1.crm;

import javax.annotation.processing.SupportedSourceVersion;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome){
        System.out.println("Cliente salvo: " + nome);
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo: " + nome);
    }

}
