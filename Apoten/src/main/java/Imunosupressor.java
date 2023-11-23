//Lucio da Cruz de Moraes RA: 2476550
import java.time.LocalDate;
public class Imunosupressor extends Remedio implements Exibir {
    
    private int nivel_Supressao;
    private int freq_Infeccoes;
    private int duracao_Supressao;
    public Imunosupressor(String nome, int lote, LocalDate data_Validade, String principio_Ativo, String administracao,
        int quantidade, EfeitosAdversos efAD, int nivel_Supressao, int freq_Infeccoes,
        int duracao_Supressao) {
        super(nome, lote, data_Validade, principio_Ativo, administracao, quantidade,efAD);
        this.nivel_Supressao = nivel_Supressao;
        this.freq_Infeccoes = freq_Infeccoes;
        this.duracao_Supressao = duracao_Supressao;
    }
    //sobrecarga
    public Imunosupressor() {
        super(null, 0, null, null, null, 0, null);
        this.nivel_Supressao = 0;
        this.freq_Infeccoes = 0;
        this.duracao_Supressao = 0;
    }
    public int getNivel_Supressao() {
        return nivel_Supressao;
    }
    public int getFreq_Infeccoes() {
        return freq_Infeccoes;
    }
    public int getDuracao_Supressao() {
        return duracao_Supressao;
    }
    public void setNivel_Supressao(int nivel_Supressao) {
        this.nivel_Supressao = nivel_Supressao;
    }
    public void setFreq_Infeccoes(int freq_Infeccoes) {
        this.freq_Infeccoes = freq_Infeccoes;
    }
    public void setDuracao_Supressao(int duracao_Supressao) {
        this.duracao_Supressao = duracao_Supressao;
    }
	//sobrescrita
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Lote: " + getLote());
         System.out.println("Data de Validade: " + getData_Validade());
        System.out.println("Princípio Ativo: " + getPrincipio_Ativo());
        System.out.println("Administração: " + getAdministracao());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Efeito analgesico:" + getEFAD().getEf_Analgesico());
        System.out.println("Efeito anti-termico"+ getEFAD().getEf_Anti_Termico());
        System.out.println("Nível de Supressão: " + nivel_Supressao);
        System.out.println("Frequência de Infecções: " + freq_Infeccoes);
        System.out.println("Duração da Supressão: " + duracao_Supressao);
        System.out.println("---------------------------");
    }
    
}
