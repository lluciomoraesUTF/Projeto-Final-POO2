import java.time.LocalDate;

public class Dispensa {
    private int dispensaId;
    private Receita receita;
    private Farmaceutico farmaceutico;
    private Remedio remedio;
    private LocalDate dataDispensa;

    public Dispensa(Receita receita, Farmaceutico farmaceutico, Remedio remedio, LocalDate dataDispensa) {
        if (receita == null) {
            throw new IllegalArgumentException("Uma dispensa deve ter uma receita associada.");
        }
        this.receita = receita;
        this.farmaceutico = farmaceutico;
        this.remedio = remedio;
        this.dataDispensa = dataDispensa;
    }

    public Dispensa() {
        this.receita = null;
        this.farmaceutico = null;
        this.remedio = null;
        this.dataDispensa = null;
    }
    public int getDispensaId() {
        return dispensaId;
    }
    public void setDispensaId(int dispensaId) {
        this.dispensaId = dispensaId;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public Remedio getRemedio() {
        return remedio;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public LocalDate getDataDispensa() {
        return dataDispensa;
    }
    public void setDataDispensa(LocalDate dataDispensa) {
        this.dataDispensa = dataDispensa;
    }
}
