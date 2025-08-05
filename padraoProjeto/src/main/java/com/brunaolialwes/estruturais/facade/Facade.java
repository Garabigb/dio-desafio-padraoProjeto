package com.brunaolialwes.estruturais.facade;

import com.brunaolialwes.estruturais.facade.subsistema1.crm.CrmService;
import com.brunaolialwes.estruturais.facade.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        CrmService.gravarCliente(nome, cep, CepApi.getInstance().recuperarCidade(cep), CepApi.getInstance().recuperarEstado(cep));

    }
}
