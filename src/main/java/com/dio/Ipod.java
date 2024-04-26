package com.dio;

public class Ipod implements ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Reprodutor ligado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música x selecionada");

    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }
}