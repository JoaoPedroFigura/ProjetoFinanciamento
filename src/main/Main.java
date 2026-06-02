package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    static void main() {
        InterfaceUsuario interfaceDoUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        for (int i = 0; i <=3; i++) {


            System.out.println("==========");
            double valorImovel = interfaceDoUsuario.pedirValorImovel();
            System.out.println("==========");
            int prazoFinanciamentoAnos = interfaceDoUsuario.pedirPrazoFinanciamento();
            System.out.println("==========");
            double taxaJurosAnual = interfaceDoUsuario.pedirTaxaJurosAnual();
            System.out.println("==========");

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual);

            System.out.printf("O financiamento %d foi criado \n", i+1);

            financiamentos.add(financiamento);
        }

        for (Financiamento f : financiamentos) {
            System.out.println(f.toString());
        }

        double valorTotaldosImoveis = 0;
        double valorTotalDosFinanciamentos = 0;


        for (Financiamento f : financiamentos) {
            valorTotaldosImoveis+= f.getValorImovel();
            valorTotalDosFinanciamentos+= f.calcularTotalPagamento();
        }

        System.out.println("Total de todos os imóveis: R$" + String.format("%.2f", valorTotaldosImoveis));
        System.out.println("Total de todos os Financiamentos R$:" + String.format("%.2f", valorTotalDosFinanciamentos));



    }
}
