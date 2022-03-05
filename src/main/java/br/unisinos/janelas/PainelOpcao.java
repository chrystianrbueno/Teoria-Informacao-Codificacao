package br.unisinos.janelas;

import javax.swing.*;

public class PainelOpcao {
    public Object paneCodificaDecodifica() {
        Object[] codificaDecodifica = {"Codifica", "Decodifica"};
        var mensagem = "Codifica/Decofica";
        return optionPane(codificaDecodifica, mensagem);
    }

    public Object paneListaCodificadores() {
        Object[] listaCodificadores = {"Golomb", "Elias-Gamma", "Fibonacci", "Unária", "Delta"};
        var mensagem = "Codificadores";
        return optionPane(listaCodificadores, mensagem);
    }

    private Object optionPane(Object [] listaOpcoes, String message) {
        return JOptionPane.showInputDialog(
                                 null,
                                        "Escolha um item",
                                                message,
                                                JOptionPane.PLAIN_MESSAGE,
                                           null,
                                                listaOpcoes,
                                ""
        );
    }
}