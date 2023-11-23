import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class Paciente extends Pessoa {
    private LocalDate dataNascimento;
    private String email;

    public Paciente(String nome, String cpf, LocalDate dataNascimento, String email) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
    //sobrecarga
    public Paciente (){
        this.dataNascimento = null;
        this.email = null;    
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
}