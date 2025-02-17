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
    
        if (jogador.getPontos() > 21 || computador.getPontos() > 21){
            return true;
        }

        if (jogador.parou() && computador.parou()){
            return true;
        }

        return false;
    }
}
