package br.com.clinica.lady;

public class Consulta {
    private int id_consulta;
    private int id_medico;
    private String categoria;
    private double valor;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId_consulta() {
        return id_consulta;
    }


    public int getId_medico() {
        return id_medico;
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Consulta(String categoria, int id_consulta, int id_medico, double valor) {
        this.categoria = categoria;
        this.id_consulta = id_consulta;
        this.id_medico = id_medico;
        this.valor = valor;
    }
    public void marcar_consulta(){
        System.out.println("Consulta cadastrada com sucesso!");
    }

    public void pagar_consulta(){
        System.out.println("Consulta paga com sucesso!");
    }
}
