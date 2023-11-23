//Lucio da Cruz de Morae RA 2476550
import java.time.LocalDate;

public class Anti_Hipertensivo extends Remedio implements Exibir {

    private String classe_Terapeutica;
    private int pressao_Alvo;

    public Anti_Hipertensivo(String nome, int lote, LocalDate data_Validade, String principio_Ativo, String administracao,
            int quantidade, EfeitosAdversos efAD, String classe_Terapeutica, int pressao_Alvo) {
        super(nome, lote, data_Validade, principio_Ativo, administracao, quantidade, efAD);
        this.classe_Terapeutica = classe_Terapeutica;
        this.pressao_Alvo = pressao_Alvo;
    }
//Sobrecarga
    public Anti_Hipertensivo() {
        super(null, 0, null, null, null, 0, null);
        this.classe_Terapeutica = null;
        this.pressao_Alvo = 0;
    }

    public String getClasse_Terapeutica() {
        return classe_Terapeutica;
    }

    public int getPressao_Alvo() {
        return pressao_Alvo;
    }

    public void setClasse_Terapeutica(String classe_Terapeutica) {
        this.classe_Terapeutica = classe_Terapeutica;
    }

    public void setPressao_Alvo(int pressao_Alvo) {
        this.pressao_Alvo = pressao_Alvo;
    }
	//sobreescrita
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Lote: " + getLote());
         System.out.println("Data de Validade: " + getData_Validade());
        System.out.println("Princípio Ativo: " + getPrincipio_Ativo());
        System.out.println("Administração: " + getAdministracao());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Efeito analgesico:" + getEFAD().getEf_Analgesico());
        System.out.println("Efeito anti-termico"+ getEFAD().getEf_Anti_Termico());        System.out.println("Classe Terapêutica: " + classe_Terapeutica);
        System.out.println("Pressão Alvo: " + pressao_Alvo);
        System.out.println("---------------------------");
    }
}
