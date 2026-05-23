package modelo;

public class Financiamento {

    private double valorImovel;
    private int prazoFinanciamentoAnos;
    private double taxaJurosAnual;



    /* Construtor da classe */ public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamentoAnos = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }


    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamentoAnos() {
        return this.prazoFinanciamentoAnos;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamentoAnos * 12)) * (1+ (this.taxaJurosAnual /12));
    }

    public double calcularTotalPagamento(){
        return calcularPagamentoMensal() * prazoFinanciamentoAnos *12;
    }

    public void exibirDadosFinanciamento(){
        System.out.println("INFORMAÇÕES SOBRE O FINANCIAMENTO: ");
        System.out.println("VALOR TOTAL: " + calcularTotalPagamento());
        System.out.println("VALOR DO IMOVEL: " + getValorImovel());
    }

}
