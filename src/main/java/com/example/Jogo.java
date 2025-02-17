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

    public String resultado(){
        if (JogadorEstourou() && ComputadorEstourou() || jogador.getPontos() == computador.getPontos()){
            return "Empatou";
        }

        if (ComputadorEstourou() || jogador.getPontos() > computador.getPontos()){
            return "Você ganhou!";
        }

        return "Você Perdeu";
    }

    public boolean acabou(){
        return JogadorEstourou() || ComputadorEstourou() || osDoisPararam()
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
