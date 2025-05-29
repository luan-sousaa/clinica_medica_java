package br.com.clinica.lady.inteface_pag;

// Declaração da interface Ipag, que define um contrato para qualquer classe que quiser implementar métodos de pagamento
public interface Ipag {
    //metodo usado para processar o metodo de pagamento
    public String processar_pagamento(String metodoPagamento);
    //Metodo abstrato que representa o ato de pagar a consulta
    public double pagar_consulta(double valor);
    //permite consultar o status do pagamento se esta pago ou nao
    public boolean consultar_status_pagamento(boolean status);

}
