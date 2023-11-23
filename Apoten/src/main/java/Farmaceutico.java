public class Farmaceutico extends Pessoa {
    private String crf; // Conselho Regional de Farmácia
    private String senha;

    public Farmaceutico(String nome, String cpf, String crf, String senha) {
        super(nome, cpf);
        this.crf = crf;
        this.senha = senha;
    }
    public Farmaceutico() {
           this.crf = null;
           this.senha = null;
       }

    public String getCrf() {
        return crf;
    }
    public String getSenha() {
        return senha;
    }
     public void setCrf(String crf) {
        this.crf = crf;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
