import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Receita {
    private int id;
    private Paciente pac;
    private String crm;
    private LocalDate dataPrescricao;
    private Remedio rem;
    private String observacoes;
    private int quantidade;

    // Construtores, getters e setters

    public Receita(int id,Paciente pac, LocalDate dataPrescricao, String observacoes, int quantidade) {
        this.id = id;
        this.crm = crm;
        this.dataPrescricao = dataPrescricao;
        this.rem = rem;
        this.observacoes = observacoes;
        this.pac = pac;
        this.rem = rem;
        this.quantidade = quantidade;
    }
    public Receita() {
    this.id = 0;
    this.crm = null;
    this.dataPrescricao = null;
    this.rem = null;
    this.observacoes = null;
    this.pac = null;
    this.quantidade = 0;
}

    
    public int getId() {
        return id;
    }
    public String getCrm() {
        return crm;
    }
    public LocalDate getDataPrescricao() {
        return dataPrescricao;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public Paciente getPaciente(){
        return pac;
    }
    public Remedio getRemedio(){
        return rem;
    }
    public int getQuantidade (){
        return quantidade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public void setDataPrescricao(LocalDate dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public void setPaciente (Paciente pac) {
        this.pac = pac;
    }
    public void setRemedio(Remedio rem) {
        this.rem = rem;
    }
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }
}

