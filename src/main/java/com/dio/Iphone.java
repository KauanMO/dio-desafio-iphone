package com.dio;

public class Iphone implements AparelhoTelefonico {

    @Override
    public void atender() {
        System.out.println("Ligação atendida");

    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void ligar() {
        System.out.println("Ligação executada");
    }
}
