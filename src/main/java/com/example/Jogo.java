package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador){
        if (jogador.parou()){
            return null;
        }

        var carta = monte.virar();
        jogador.receberCarta(carta);

        return carta;
    }

    public boolean acabou(){
        //alguém estourou
        //ou
        //os dois pararam
    
        if (JogadorEstourou() || ComputadorEstourou() || osDoisPararam()){
            return true;
        }

        return false;
    }

    private boolean JogadorEstourou(){
        return jogador.getPontos() > 21; //false se não estourou
    }

    private boolean ComputadorEstourou(){
        return computador.getPontos() > 21;
    }

    private boolean osDoisPararam(){
        return jogador.parou() && computador.parou();
    }
}
