package com.brunaolialwes.comportamental.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Defende pela esquerda");
    }
}
