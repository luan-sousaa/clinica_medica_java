package br.com.clinica.main;

import br.com.clinica.lady.Paciente;
import br.com.clinica.lady.Pagamento;

public class Main {

    public static void main(String[] args) {
        //instanciando a classe paciente
        Paciente paciente = new Paciente("0304343004","21/04/2005","qr 204 smb norte",90,"luan","m");
        paciente.visualizar_paciente();

        //instanciando a classe pagamento
        Pagamento pagamento = new Pagamento(23,22,"pix",true);
    }
}
