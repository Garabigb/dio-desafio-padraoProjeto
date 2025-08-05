package com.brunaolialwes.comportamental.strategy;

public class ComportamentoNomal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo normalmente");
    }
}
