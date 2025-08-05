package com.brunaolialwes.criacional.singleton;

/**
 * Singleton com um mantedor
 * Existe uma classe para encapisular a instancia do singleton
 * Essa opção é thread safe
 * **/

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }



    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }

}
