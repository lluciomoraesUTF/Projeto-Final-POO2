
//Lucio da Cruz de Moraes RA: 2476550
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class RemedioException extends Exception {
    Remedio rem = new Remedio();
    public LocalDate DataInvalidaException(LocalDate dataValidade) {
        try{
            LocalDate dataValidadeVerificada = rem.verif_Validade(dataValidade);
        }catch(RemedioException t){ 
            JOptionPane.showMessageDialog(
				null,
				"O remedio nao pode ser cadastrado pois está vencido");
            return null;
            
        }
        return rem.dataValidade;
    }
    
}