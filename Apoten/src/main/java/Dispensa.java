/*Lucio da Cruz de Moraes RA:2476550 */
public class Dispensa {
    public class Dispensa {
        private Preescricao preesc;
        private Paciente paciente;
        private int quantidade;
        
        public Dispensa(Preescricao preesc, Paciente paciente, int quantidade) {
            this.preesc = preesc;
            this.paciente = paciente;
            this.quantidade = quantidade;
        }
        public Dispensa() {
            this.preesc = null;
            this.paciente = null;
            this.quantidade = 0;
        }

        public Preescricao getPrescricao() {
            return preesc;
        }
         public Paciente getPaciente() {
            return paciente;
        }
         public int getQuantidade() {
            return quantidade;
        }
        public void setPrescricao(Preescricao preesc) {
            this.preesc = preesc;
        }
        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

}
