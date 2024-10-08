package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
    private String nome, idSecreta;
    private ArrayList<String> poderes, fraquezas;

    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public ArrayList<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(ArrayList<String> fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listaHeroi(){
        String exibe = "Super Herói: " + nome + "Identidade Secreta: " + idSecreta;
        Collections.sort(poderes);
        Collections.sort(fraquezas);
        int cont = 1;
        for (String i : poderes ) {
            exibe += "\nIntegrante " + cont + ": " + i;
            cont++;
    }
}
