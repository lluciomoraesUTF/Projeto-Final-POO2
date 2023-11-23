import java.util.Date;
public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa() {
        this.nome = null;
        this.cpf = null;
    }


    // Métodos de acesso (getters e setters) podem ser adicionados se necessário

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    
      }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}