package com.brunaolialwes.comportamental.strategy;

public class Robo {
    private Comportamento comportamento;

    public void changeStrategy(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
