package br.com.clinica.lady;

public class Medico {
    private String nome_medico;
    private int id_medico;
    private String crm;
    private String especialidade;

    public String getCrm() {
        return crm;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId_medico() {
        return id_medico;
    }


    public String getNome_medico() {
        return nome_medico;
    }



    public Medico(String crm, String especialidade, int id_medico, String nome_medico) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.id_medico = id_medico;
        this.nome_medico = nome_medico;
    }
    public void Atender_paciente(){
        System.out.println("Atendendo paciente");
    }
}
