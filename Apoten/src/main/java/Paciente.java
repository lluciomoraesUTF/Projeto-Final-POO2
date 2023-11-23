import java.util.Date;
public class Paciente extends Pessoa {
    private Date dataNascimento;
    private String email;

    public Paciente(String nome, String cpf, Date dataNascimento, String email) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
    //sobrecarga
    public Paciente (){
        this.dataNascimento = null;
        this.email = null;    
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
}