package com.example;

import java.util.ArrayList;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte (){
        for (int i = 0; i <= 13; i++) {
            cartas.add(new Carta(1, Naipe.Hearts));
        }
    }
}
