package br.com.clinica.main;

import br.com.clinica.lady.Medico;
import br.com.clinica.lady.Paciente;
import br.com.clinica.lady.Pagamento;
import br.com.clinica.lady.Prontuario;

public class Main {

    public static void main(String[] args) {
        //instanciando a classe paciente
        Paciente paciente = new Paciente("0304343004","21/04/2005","qr 204 smb norte",90,"luan","M");
        paciente.visualizar_paciente();

        //instanciando a classe medico
        Medico medico = new Medico("123456789","Cardiologista",100,"Luiz");
        medico.Atender_paciente();

        //instanciando a classe pagamento
        Pagamento pagamento = new Pagamento(23,22);
        pagamento.processar_pagamento("Cartão de debito");
        pagamento.pagar_consulta(100);
        pagamento.consultar_status_pagamento(true);
        //instanciando a classe prontuario
        Prontuario pront = new Prontuario("23232323","21/04/2005","qr 103 smb norte",90,"luan","m","Falta de ar",90,22);
        pront.exibirProntuario();
    }
}
