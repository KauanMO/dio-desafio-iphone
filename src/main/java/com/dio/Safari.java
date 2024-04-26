package com.dio;

public class Safari implements NavegadorInternet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atuaizada");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina: x");
    }
}
