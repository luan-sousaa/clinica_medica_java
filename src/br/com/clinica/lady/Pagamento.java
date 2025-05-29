package br.com.clinica.lady;

import br.com.clinica.lady.inteface_pag.Ipag;

//usando a interface Ipag para definir o contrato de pagamento
public class Pagamento implements Ipag {
    //atributos da clsse pagamento
    private int id_consulta;
    private int id_pagamento;
    private String metodoPagamento;
    private boolean status;
    private double valor;
    //metodo da interface de consultar o pagamento
    @Override
    public boolean consultar_status_pagamento(boolean status) {
        System.out.println("Status do pagamento: " + status);
        if (!status) {//se for false
            System.out.println("Pagamento Pendente");
        } else {
            System.out.println("Pagamento Aprovado");
        }
        return status;
    }
    //metodo da interface de processar o pagamento
    @Override
    public String processar_pagamento(String metodoPagamento) {
        try {
            //verifica se é nulo ou vazio
            if (metodoPagamento == null || metodoPagamento.trim().isEmpty()) {
                throw new IllegalArgumentException("Método de pagamento não pode ser vazio.");
            }
            //se for valido atribui o valor ao atributo metodoPagamento e imprimi
            this.metodoPagamento = metodoPagamento;
            System.out.println("Método do pagamento: " + metodoPagamento);
        } catch (IllegalArgumentException e) {
            //tratamento de execao caso o valor seja nulo ou vazio
            System.out.println("Erro ao processar pagamento: " + e.getMessage());
        }
        return metodoPagamento;
    }
    //metodo da interface de pagar a consulta
    @Override
    public double pagar_consulta(double valor) {
        try {
            //verifica se o valor é vailido
            if (valor <= 0) {
                throw new IllegalArgumentException("Valor da consulta deve ser maior que zero.");
            }
            this.valor = valor;
            System.out.println("Valor da consulta: R$" + valor);
        } catch (IllegalArgumentException e) {
            //tratamento de execao caso o valor seja menor que zero
            System.out.println("Erro ao pagar consulta: " + e.getMessage());
        }
        return valor;
    }
    //metodo construtor da classe pagamento
    public Pagamento(int id_consulta, int id_pagamento) {
        try {
            //verifica se os id sao validos
            if (id_consulta <= 0 || id_pagamento <= 0) {
                throw new IllegalArgumentException("IDs devem ser maiores que zero.");
            }
            this.id_consulta = id_consulta;
            this.id_pagamento = id_pagamento;
            //exibe informaçoes do pagamento
            System.out.println("INFORMAÇÕES DO PAGAMENTO");
            System.out.println("ID PAGAMENTO: " + id_pagamento);
            System.out.println("ID Consulta: " + id_consulta);
        } catch (IllegalArgumentException e) {
            //tratamento de execao caso o id seja menor que zero
            System.out.println("Erro na criação do pagamento: " + e.getMessage());
        }
    }

    // Getters e Setters

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
