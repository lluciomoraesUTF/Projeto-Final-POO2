import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
    public class Remedio {
        private String nome;
        private int lote;
        public LocalDate data_Validade; 
        private int quantidade;
        public Remedio(String nome, int lote, LocalDate data_Validade, int quantidade) {
            this.nome = nome;
            this.lote = lote;
            this.data_Validade = data_Validade;
            this.quantidade = quantidade;
            
        }
        //sobrecarga
        public Remedio() {
            this.nome = "";
            this.lote = 0;
            this.data_Validade = null;
            this.quantidade = 0;


        }
        public String getNome() {
            return nome;
        }

        public int getLote() {
            return lote;
        }

        public LocalDate getData_Validade() {
            return data_Validade;
        }

   

        public int getQuantidade() {
            return quantidade;
        }
      
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setLote(int lote) {
            this.lote = lote;
        }
        public void setData_Validade(LocalDate data_Validade){
            try{
                LocalDate dataValidadeVerificada = verif_Validade(data_Validade);
            }catch(RemedioException t){   
                this.data_Validade = t.DataInvalidaException(data_Validade);
            }
        }
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        public LocalDate verif_Validade(LocalDate data_Validade) throws RemedioException {
            LocalDate data_Cadastro = LocalDate.now();
            LocalDate dataValidade = data_Validade;
        
            if (data_Validade != null && data_Cadastro.compareTo(dataValidade) >= 0) {
                throw new RemedioException();
            }
            this.data_Validade = data_Validade;
            return this.data_Validade;
        }
}
