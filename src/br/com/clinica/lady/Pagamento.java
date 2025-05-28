package br.com.clinica.lady;

public class Pagamento {
    private int id_consulta;
    private int id_pagamento;
    private String metodoPagamento;
    private boolean status;

    public Pagamento(int id_consulta, int id_pagamento, String metodoPagamento, boolean status) {
        this.id_consulta = id_consulta;
        this.id_pagamento = id_pagamento;
        this.metodoPagamento = metodoPagamento;
        this.status = status;
        System.out.println("STATUS DO PAGAMENTO");
        System.out.println("Pagamento status: " + status);
        if (status == true) {
            this.status = true;
            System.out.println("Pagamento Valido");
        }else{
            this.status = false;
            System.out.println("Pagamento Invalido");
        }
        System.out.println("\n");
    }

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


}
