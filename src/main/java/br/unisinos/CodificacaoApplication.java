package br.unisinos;

import br.unisinos.janelas.PainelOpcao;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.util.Objects;

public class CodificacaoApplication {
    private static PainelOpcao painelOpcao = new PainelOpcao();
    private static final int SELECIONOU = 1;

    public static void main(String[] args) {
        loopAplicacao();
    }

    public static void loopAplicacao() {
        var opcaoSelecionada = painelOpcao.paneCodificaDecodifica();

        if (Objects.isNull(opcaoSelecionada)) {
            System.exit(0);
        }

        if (opcaoSelecionada == "Decodifica") {
            System.out.println("Decodifica Arquivo");
        }

        var codificacaoSelecionada = painelOpcao.paneListaCodificadores();

        if (Objects.isNull(codificacaoSelecionada)) {
            System.exit(0);
        }

        var jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("./files"));
        jFileChooser.setMultiSelectionEnabled(false);

        var filtro = new FileNameExtensionFilter("*.cod", "cod");
        jFileChooser.setFileFilter(filtro);
        jFileChooser.addChoosableFileFilter(filtro);
        jFileChooser.showOpenDialog(null);

        var arqSelecionado = jFileChooser.getSelectedFile();

        switch (codificacaoSelecionada.toString()) {
            case "Golomb":
                System.out.println("Golomb");
                break;
            case "Elias-Gamma":
                System.out.println("Elias-Gamma");
                break;
            case "Fibonacci":
                System.out.println("Fibonacci");
                break;
            case "Unária":
                System.out.println("Unária");
                break;
            case "Delta":
                System.out.println("Delta");
                break;
            default:
                System.out.println("Opção Inesperada");
                System.exit(0);
        }
    }
}