import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class Dispensa {
    private int dispensaId;
    private Receita receita;
    private Farmaceutico farmaceutico;
    private Remedio remedio;
    private int quantidadeDispensada;
    private LocalDate dataDispensa;

    // Construtor
    public Dispensa(Receita receita, Farmaceutico farmaceutico, Remedio remedio, int quantidadeDispensada, LocalDate dataDispensa) {
        this.receita = receita;
        this.farmaceutico = farmaceutico;
        this.remedio = remedio;
        if (quantidadeDispensada <= receita.getQuantidade()) {
            this.quantidadeDispensada = quantidadeDispensada;
        } else {
            this.quantidadeDispensada = receita.getQuantidade();
        }

        this.dataDispensa = dataDispensa;
    }
    public Dispensa() {
        this.receita = null;
        this.farmaceutico = null;
        this.remedio = null;
        this.quantidadeDispensada = 0;
        this.dataDispensa = null;
    }

    public int getDispensaId() {
        return dispensaId;
    }
    public Receita getReceita() {
        return receita;
    }
    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }
    public Remedio getRemedio() {
        return remedio;
    }
    public int getQuantidadeDispensada() {
        return quantidadeDispensada;
    }
    public LocalDate getDataDispensa() {
        return dataDispensa;
    }
    public void setDispensaId(int dispensaId) {
        this.dispensaId = dispensaId;
    }
    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }
    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

     public void setQuantidadeDispensada(int quantidadeDispensada) {
        this.quantidadeDispensada = quantidadeDispensada;
    }
    public void setDataDispensa(LocalDate dataDispensa) {
        this.dataDispensa = dataDispensa;
    }
}
