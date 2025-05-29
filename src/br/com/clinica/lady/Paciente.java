// Pacote onde a classe está inserida
package br.com.clinica.lady;

// Criação da classe "Paciente" e seus atributos
public class Paciente {
    private int id_paciente;
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String data_nascimento;

    // Método "get" utilizado para ler a variável
    public String getData_nascimento() {
        return data_nascimento;
    }

    // Método "set" utilizado para alterar a variável
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
    
    // Construtor da classe criada, utilizado para inicializar os atributos
    public Paciente(String cpf, String data_nascimento, String endereco, int id_paciente, String nome, String sexo) {
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.id_paciente = id_paciente;
        this.nome = nome;
        this.sexo = sexo;
    }
    // Método da classe que printa as informações do paciente
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
