// Pacote onde a classe está inserida
package br.com.clinica.main;

// Importação das classes contidas no pacote "br.com.clinica.lady"
import br.com.clinica.lady.Medico;
import br.com.clinica.lady.Paciente;
import br.com.clinica.lady.Pagamento;
import br.com.clinica.lady.Prontuario;

// Criação da classe "Main"
public class Main {

    public static void main(String[] args) {
        
        //Instância da classe "Paciente"
        Paciente paciente = new Paciente("0304343004","21/04/2005","qr 204 smb norte",90,"luan","M");
        paciente.visualizar_paciente();

          //Instância da classe "Medico"
        Medico medico = new Medico("123456789","Cardiologista",100,"Luiz");
        medico.Atender_paciente();

        //Instância da classe "Pagamento"
        Pagamento pagamento = new Pagamento(23,22);
        pagamento.processar_pagamento("Cartão de debito");
        pagamento.pagar_consulta(100);
        pagamento.consultar_status_pagamento(true);
        
          //Instância da classe "Prontuario"
        Prontuario pront = new Prontuario("23232323","21/04/2005","qr 103 smb norte",90,"luan","m","Falta de ar",90,22);
        pront.exibirProntuario();
    }
}
