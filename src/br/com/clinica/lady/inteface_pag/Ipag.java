package br.com.clinica.lady.inteface_pag;

public interface Ipag {
    public String processar_pagamento(String metodoPagamento);
    public double pagar_consulta(double valor);
    public boolean consultar_status_pagamento(boolean status);

}
