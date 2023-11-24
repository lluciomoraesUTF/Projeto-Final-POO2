import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Receita {
    private int id;
    private Paciente paciente;
    private String crm;
    private LocalDate dataPrescricao;
    private Remedio remedio;
    private String observacoes;
    private int quantidade;


    public Receita(int id, Paciente paciente, String crm, LocalDate dataPrescricao, Remedio remedio, String observacoes, int quantidade) {
        this.id = id;
        this.paciente = paciente;
        this.crm = crm;
        this.dataPrescricao = dataPrescricao;
        this.remedio = remedio;
        this.observacoes = observacoes;
        this.quantidade = quantidade;
    }

    public Receita() {
        this.id = 0;
        this.paciente = null;
        this.crm = null;
        this.dataPrescricao = null;
        this.remedio = null;
        this.observacoes = null;
        this.quantidade = 0;
    }
    public int getId() {
        return id;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public String getCrm() {
        return crm;
    }
    public LocalDate getDataPrescricao() {
        return dataPrescricao;
    }
    public Remedio getRemedio() {
        return remedio;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setDataPrescricao(LocalDate dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

