package br.com.clinica.lady;

public class Paciente {
    private int id_paciente;
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String data_nascimento;

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Paciente(String cpf, String data_nascimento, String endereco, int id_paciente, String nome, String sexo) {
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.id_paciente = id_paciente;
        this.nome = nome;
        this.sexo = sexo;
    }

    public void visualizar_paciente() {
        System.out.println("INFORMAÇÕES DO PACIENTE");
        System.out.println("Visualizando Nome do Paciente: " +nome);
        System.out.println("Endereço Paciente: " +endereco);
        System.out.println("Cpf Paciente: " +cpf);
        System.out.println("Sexo Paciente: " +sexo);
        System.out.println("Data de Nascimento Paciente: " +data_nascimento);
        System.out.println("\n");

    }

}
