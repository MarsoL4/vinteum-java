package com.example;

import java.util.ArrayList;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte (){
        for (int numero = 0; numero <= 13; numero++) {
            cartas.add(new Carta(numero, Naipe.Hearts));
        }

        for (int numero = 0; numero <= 13; numero++) {
            cartas.add(new Carta(numero, Naipe.Clubs));
        }
        
        for (int numero = 0; numero <= 13; numero++) {
            cartas.add(new Carta(numero, Naipe.Diamonds));
        }

        for (int numero = 0; numero <= 13; numero++) {
            cartas.add(new Carta(numero, Naipe.Spades));
        }
    }
}
