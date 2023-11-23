//Lucio da Cruz de MOraes RA: 2476550
public class Preescricao{
    private String nomeMed;
    private String crm;
	private int quantPreesc;
	private int tempTrat;
    private String dataPreesc;
   
    public Preescricao (String nomeMed, String crm, String dataPreesc,int quantPreesc,int tempTrat){
        this.nomeMed = nomeMed;
        this.crm = crm;
        this.dataPreesc = dataPreesc;
        this.quantPreesc = quantPreesc;
		this.tempTrat = tempTrat;
    }
    //Sobrecarga
    public Preescricao (){
        this.nomeMed = null;
        this.crm = null;
        this.dataPreesc = null;
        this.quantPreesc = 0;
		tempTrat = 0;
    }
    public String getNomeMed(){
        return nomeMed;
    }
    public String getCrm(){
        return crm;
    }
	public int getQuantPreesc(){
		return quantPreesc;
	}
	public int getTempTrat(){
		return tempTrat;
	}
    public String getdataPreesc(){
        return dataPreesc;
    }
    public void setNomeMed(String nomeMed){
        this.nomeMed = nomeMed;
    }
    public void setCrm(String crm){
        this.crm = crm;
    }
	public void setQuantPreesc(int quantPreesc){
		this.quantPreesc = quantPreesc;
	}
	public void setTempTrat(int tempTrat){
		this.tempTrat = tempTrat;
	}
    public void setData_Preesc(String data_Preesc){
        this.dataPreesc = data_Preesc;
    }
}