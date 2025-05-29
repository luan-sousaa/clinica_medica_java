// Pacote onde a classe está inserida
package br.com.clinica.lady;

// Criação da classe "Medico" com seus atributos

public class Medico {
    private String nome_medico;
    private int id_medico;
    private String crm;
    private String especialidade;

// Método "get" para ler a variável
    public String getCrm() {
        return crm;
    }


    public String getEspecialidade() {
        return especialidade;
    }
// Método "set" para alterar a variável

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId_medico() {
        return id_medico;
    }


    public String getNome_medico() {
        return nome_medico;
    }


// Construtor da classe criada, utilizado para inicializar os atributos
    
    public Medico(String crm, String especialidade, int id_medico, String nome_medico) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.id_medico = id_medico;
        this.nome_medico = nome_medico;
    }

// Método que printa as informações do médico ao longo do atendimento
    public void Atender_paciente(){
        System.out.println("INFORMAÇÕES DO MÉDICO");
        System.out.println("Atendendo paciente");
        System.out.println("Nome do medico: " +nome_medico);
        System.out.println("Especialidade do medico: " +especialidade);
        System.out.println("Crm do medico: " +crm);
        System.out.println("Id do medico: " +id_medico);
        System.out.println("\n");
    }
}
