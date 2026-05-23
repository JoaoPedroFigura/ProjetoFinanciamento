package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    static void main() {
        InterfaceUsuario i = new InterfaceUsuario();

        double valorImovel = i.pedirValorImovel();
        int prazoFinanciamentoAnos = i.pedirPrazoFinanciamento();
        double taxaJurosAnual = i.pedirTaxaJurosAnual();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual);


    }
}
