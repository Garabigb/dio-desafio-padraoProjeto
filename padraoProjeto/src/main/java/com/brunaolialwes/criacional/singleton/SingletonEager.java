package com.brunaolialwes.criacional.singleton;

/**
 * Singleton apreçado
 * Inicializa a instancia sempre que chamado.
 * **/

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }

}
