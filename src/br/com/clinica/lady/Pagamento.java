
// Pacote em que a classe está inserida
package br.com.clinica.lady;

// Importação da Interface que será implementada na classe
import br.com.clinica.lady.inteface_pag.Ipag;

// Criação da classe "Pagamento" e implementação da interface
public class Pagamento implements Ipag {
    
    //Atributos da classe "Pagamento"
    private int id_consulta;
    private int id_pagamento;
    private String metodoPagamento;
    private boolean status;
    private double valor;
    
    //Chamada do método utilizado para consultar a situação do pagamento
    @Override
    public boolean consultar_status_pagamento(boolean status) {
        System.out.println("Status do pagamento: " + status);
        if (!status) {
            System.out.println("Pagamento Pendente");
        } else {
            System.out.println("Pagamento Aprovado");
        }
        return status;
    }
    //Chamada do método utilizado para processar o pagamento
    @Override
    public String processar_pagamento(String metodoPagamento) {
        try {
            
            //Validação do valor informado, não sendo permitido o nulo
            if (metodoPagamento == null || metodoPagamento.trim().isEmpty()) {
                throw new IllegalArgumentException("Método de pagamento não pode ser vazio.");
            }
            
            //Caso o valor seja válido, o método seguirá normalmente
            this.metodoPagamento = metodoPagamento;
            System.out.println("Método do pagamento: " + metodoPagamento);
            
        } catch (IllegalArgumentException e) {
            
            //Tratamento de exceção, caso o valor seja nulo ou vazio
            System.out.println("Erro ao processar pagamento: " + e.getMessage());
        }
        return metodoPagamento;
    }
    //Chamada do método utilizado para pagar a consulta
    @Override
    public double pagar_consulta(double valor) {
        try {
            //Validação do valor
            if (valor <= 0) {
                throw new IllegalArgumentException("Valor da consulta deve ser maior que zero.");
            }
            this.valor = valor;
            System.out.println("Valor da consulta: R$" + valor);
        } catch (IllegalArgumentException e) {
            
             //Tratamento de exceção, caso o valor seja menor que zero
            System.out.println("Erro ao pagar consulta: " + e.getMessage());
        }
        return valor;
    }
    
    //Construtor da classe "Pagamento" que inicializa os atributos
    public Pagamento(int id_consulta, int id_pagamento) {
        try {
            //Validação dos ID's
            if (id_consulta <= 0 || id_pagamento <= 0) {
                throw new IllegalArgumentException("IDs devem ser maiores que zero.");
            }
            this.id_consulta = id_consulta;
            this.id_pagamento = id_pagamento;
            
            //Exibição das informaçoes do pagamento
            System.out.println("INFORMAÇÕES DO PAGAMENTO");
            System.out.println("ID PAGAMENTO: " + id_pagamento);
            System.out.println("ID Consulta: " + id_consulta);
        } catch (IllegalArgumentException e) {
             //Tratamento de exceção, caso o valor do ID seja menor ou igual a zero
            System.out.println("Erro na criação do pagamento: " + e.getMessage());
        }
    }

    // Método "get" utilizado para ler a variável
    public int getId_consulta() {
        return id_consulta;
    }
    
    // Método "set" utilizado para alterar a variável
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
