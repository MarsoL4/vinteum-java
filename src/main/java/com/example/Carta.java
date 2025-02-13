package com.example;

public class Carta {
    private int numero;
    private Naipe naipe = Naipe.Clubs; //Aqui só serão aceitos os valores criados no enum "Naipe" criado no naipe.java
    
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath(){
        return "classic-cards/" + numero + naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    

}