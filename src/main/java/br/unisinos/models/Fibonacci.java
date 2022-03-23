package br.unisinos.models;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> getFibonacciAteValorRecebido(int valor) {
        var listaFibonacci = new ArrayList<Integer>();

        listaFibonacci.add(1);
        var numAtual = 1;
        var proximoNum = 2;

        while (proximoNum <= valor) {
            int aux = proximoNum;
            listaFibonacci.add(proximoNum);
            proximoNum += numAtual;
            numAtual = aux;
        }

        return listaFibonacci;
    }
}
