//Lucio da Cruz de Morae RA 2476550
import java.time.LocalDate;

public class Anti_Alergico extends Remedio implements Exibir{

    private String alergeno;
    private int geracao;

    public Anti_Alergico(String nome, int lote, LocalDate data_Validade, String principio_Ativo, String administracao,
            int quantidade, String alergeno, int geracao,EfeitosAdversos efAD) {
        super(nome, lote, data_Validade, principio_Ativo, administracao, quantidade,efAD); 
        this.alergeno = alergeno;
        this.geracao = geracao;
    }
	//sobrecarga
    public Anti_Alergico() {
        super(null, 0, null, null, null,0,null);
        this.alergeno = null;
        this.geracao = 0;
        
    }

    public String getAlergeno() {
        return alergeno;
    }

    public int getGeracao() {
        return geracao;
    }

    public void setAlergeno(String alergeno) {
        this.alergeno = alergeno;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
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
        System.out.println("Efeito anti-termico"+ getEFAD().getEf_Anti_Termico());        
        System.out.println("Alergeno: " + alergeno);
        System.out.println("Geração: " + geracao);
        System.out.println("---------------------------");
    }
}

