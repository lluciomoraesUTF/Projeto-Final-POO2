//Lucio da Cruz de Moraes RA:2476550
public class Paciente {
    private String cpf;
    private String nomePes;
    private String saudCod;
    private String alergiaMedic;

    public Paciente (String cpf, String nomePes, String saudCod, String alergiaMedic){
        this.cpf=cpf;
        this.nomePes = nomePes; 
        this.saudCod = saudCod;
        this.alergiaMedic = alergiaMedic;    
    }
    //sobrecarga
    public Paciente (){
        this.cpf=null;
        this.nomePes = null; 
        this.saudCod = null;
        this.alergiaMedic = null;    
    }
    public String getCpf(){
        return  cpf;
    }
    public String getNomePes(){
        return nomePes;
    }
    public String getSaudCod(){
        return saudCod;
    }
    public String getAlergiaMedic(){
        return alergiaMedic;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNomePes(String nomePes){
        this.nomePes = nomePes;
    }
    public void setSaudCod(String saudCod){
        this.saudCod = saudCod;
    }
    public void setAlergiaMedic(String alergiaMedic){
        this.alergiaMedic = alergiaMedic;
    }
    
}   