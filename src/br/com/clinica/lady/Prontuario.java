package br.com.clinica.lady;
import br.com.clinica.lady.Paciente;

public class Prontuario extends Paciente {
    private int id_prontuario;
    private int id_paciente;
    private String diagnostico;


    public Prontuario(String cpf, String data_nascimento, String endereco, int id_paciente, String nome, String sexo, String diagnostico, int id_paciente1, int id_prontuario) {
        super(cpf, data_nascimento, endereco, id_paciente, nome, sexo);
        this.diagnostico = diagnostico;
        this.id_paciente = id_paciente1;
        this.id_prontuario = id_prontuario;
        this.getNome();

    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public int getId_paciente() {
        return id_paciente;
    }

    public int getId_prontuario() {

        return id_prontuario;
    }




    public void exibirProntuario() {
        System.out.println("\n");
        System.out.println("PRONTUARIO DO PACIENTE");
        System.out.println("Nome do paciente: " +getNome() );
        System.out.println("Diagnostico: " + diagnostico);
        System.out.println("Id paciente: " + id_paciente);
        System.out.println("Id prontuario: " + id_prontuario);


    }


}
