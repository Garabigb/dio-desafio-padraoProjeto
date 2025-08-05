package com.brunaolialwes.criacional.singleton;

/**
 * Singleton preguiçoso
 * Verifica se a instancia existe e em caso negativo inicializa.
 * **/

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
