package com.example;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        return this.getPontos() > 16; //O 'this.' é opcional nesse caso
        
    }
    
    
}
