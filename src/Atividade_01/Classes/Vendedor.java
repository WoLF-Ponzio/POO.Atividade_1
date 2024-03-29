package src.Atividade_01.Classes;

import src.Atividade_01.interfaces.calcularSalario;

public class Vendedor extends Empregado implements calcularSalario{
    private double totalDeVendas;
    private double comissao;

    public Vendedor(String matricula, String nome, String cpf, double totalDeVendas, double comissao) {
        super(matricula, nome, cpf);

        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
    public Vendedor(){
        super();
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double salario() {
        return this.getTotalDeVendas() * this.getComissao();
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Registro do funcionário: " + getMatricula() + "\n";
        aux += "Nome: " + getNome() + "\n";
        aux += "CPF: " + getCpf() + "\n";
        aux += "Cargo: Vendedor " +  "\n";
        aux += "Total de Vendas do funcionário: " + getTotalDeVendas() + "\n";
        aux += "Comissão po Venda: " + String.format("%.2f", getComissao()) + "%\n";
        aux += "Salário: R$ " + String.format("%.2f", salario()) + "\n";
        aux += "\n";
        return aux;
    }

}