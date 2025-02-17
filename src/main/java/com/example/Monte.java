package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte (){
        //Criar 52 cartas 
        for (int numero = 0; numero <= 13; numero++) {
            for (Naipe naipe : Naipe.values()) { //Se algum valor for adicionado aos naipes, não será necessário mexer aqui pois já irá puxar os valores atualizados
                cartas.add(new Carta(numero, naipe));
            }

        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
}
