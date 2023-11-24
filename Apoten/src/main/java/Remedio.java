import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
    public class Remedio {
        private int codigo;
        private String nome;
        private int lote;
        public LocalDate dataValidade; 
        private int quantidade;
        public Remedio(int codigo,String nome, int lote, LocalDate dataValidade, int quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.lote = lote;
            this.dataValidade = dataValidade;
            this.quantidade = quantidade;
            
        }
        //sobrecarga
        public Remedio() {
            this.codigo = 0;
            this.nome = "";
            this.lote = 0;
            this.dataValidade = null;
            this.quantidade = 0;


        }
        public int getCodigo(){
            return codigo;
        }
        public String getNome() {
            return nome;
        }

        public int getLote() {
            return lote;
        }

        public LocalDate getData_Validade() {
            return dataValidade;
        }
        public int getQuantidade() {
            return quantidade;
        }
        public void setCodigo ( int codigo){
            this.codigo = codigo;
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
                this.dataValidade = t.DataInvalidaException(data_Validade);
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
            this.dataValidade = data_Validade;
            return this.dataValidade;
        }
}
