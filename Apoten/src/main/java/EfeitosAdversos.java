//Lucio da Cruz de Morae RA 2476550
public class EfeitosAdversos{
    private boolean ef_Analgesico; 
    private boolean ef_Anti_Termico;
    public EfeitosAdversos(boolean ef_Analgesico,boolean ef_Anti_Termico){
            this.ef_Analgesico = ef_Analgesico;
            this.ef_Anti_Termico = ef_Anti_Termico;
    }
    //sobrecarga
    public EfeitosAdversos(){
        this.ef_Analgesico = false;
        this.ef_Anti_Termico = false;
    }
    public boolean getEf_Analgesico() {
        return ef_Analgesico;
    }
    public boolean getEf_Anti_Termico() {
        return ef_Anti_Termico;
    }
    public void setEf_Analgesico(boolean ef_Analgesico){
        this.ef_Analgesico = ef_Analgesico;
    }
    public void setEf_Anti_Termico(boolean ef_Anti_Termico){
        this.ef_Anti_Termico = ef_Anti_Termico;
    }
}