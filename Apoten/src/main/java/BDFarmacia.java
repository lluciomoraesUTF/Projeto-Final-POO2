//Lucio da Cruz de Moraes RA2476550
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDFarmacia {
    private static BDFarmacia estoque;
    private List<Anti_Alergico> bdAntiAler;
    private List<Anti_Hipertensivo> bdAntiHiper;
    private List<Imunosupressor> bdImuno;
    private List <Paciente> bdPaciente;
    private BDFarmacia() {
        bdAntiAler = new ArrayList<Anti_Alergico>();
        bdAntiHiper = new ArrayList<Anti_Hipertensivo>();
        bdImuno = new ArrayList<Imunosupressor>();
        bdPaciente = new ArrayList <Paciente>();
    }

    public static BDFarmacia getBDFarmacia() {
        if (estoque == null) {
            estoque = new BDFarmacia();
        }
        return estoque;
    }
    public Anti_Alergico addAnti_Alergico(Anti_Alergico AntiAler){
        if (AntiAler != null){
            bdAntiAler.add(AntiAler);
            return AntiAler;
        }
        else{
            return null;
        }
    }
    public Anti_Hipertensivo addAnti_Htensao(Anti_Hipertensivo AntiHtensao){
        if (AntiHtensao != null){
            bdAntiHiper.add(AntiHtensao);
            return AntiHtensao;
        }
        else{
            return null;
        }
    } 
    public Imunosupressor addImunosupressor(Imunosupressor imunosup){
        if (imunosup != null){
            bdImuno.add(imunosup);
            return imunosup;
        }
        else{
            return null;
        }
    } 
    public Paciente addPaciente (Paciente pac){
        if (pac != null){
            bdPaciente.add(pac);
            return pac;
        }
        else{
            return null;
        }
    }
     public boolean removeAntiAlergico(Anti_Alergico AntiAler) {
        for (Anti_Alergico antiAler : bdAntiAler) {
            if (antiAler.getNome().equalsIgnoreCase(antiAler.getNome())) {
                bdAntiAler.remove(antiAler);
                return true;
            }         
        }
        return false;
     }
     public boolean removeAntiHipertensivo(Anti_Hipertensivo AntiHtensao) {
    for (Anti_Hipertensivo antiHipertensivo : bdAntiHiper) {
        if (antiHipertensivo.getNome().equalsIgnoreCase(AntiHtensao.getNome())) {
            bdAntiHiper.remove(antiHipertensivo);
            return true;
        }
    }
    return false;
}

    public boolean removeImunosupressor(Imunosupressor imunosup) {
        for (Imunosupressor imunossupressor : bdImuno) {
            if (imunossupressor.getNome().equalsIgnoreCase(imunosup.getNome())) {
                bdImuno.remove(imunossupressor);
                return true;
            }
        }
        return false;
    }
    public boolean removePaciente(Paciente pac) {
        for (Paciente paciente : bdPaciente) {
            if (pac.getNomePes().equalsIgnoreCase(pac.getNomePes())) {
                bdPaciente.remove(paciente);
                return true;
            }
        }
        return false;
    }
    public Anti_Alergico updateAnti_Alergico(Anti_Alergico newAntialer) {
            String antialer = newAntialer.getNome();
            for (Anti_Alergico AntiAler : bdAntiAler) {
                if (newAntialer.getNome().equals(antialer)) {
                    int index = bdAntiAler.indexOf(AntiAler);
                    bdAntiAler.set(index, newAntialer);
                    return newAntialer;
                }
            }
            return null;
        }
    public Anti_Hipertensivo updateAntiHipertensivo(Anti_Hipertensivo newAntiHTensao) {
        String antiHiper = newAntiHTensao.getNome();
        for (Anti_Hipertensivo antiHipertensivo : bdAntiHiper) {
            if (newAntiHTensao.getNome().equals(antiHiper)) {
                int index = bdAntiHiper.indexOf(antiHipertensivo);
                bdAntiHiper.set(index, newAntiHTensao);
                return newAntiHTensao;
            }
        }
        return null;
    }

    public Imunosupressor updateImunosupressor(Imunosupressor newImunoup) {
        String imuno = newImunoup.getNome();
        for (Imunosupressor imunossupressor : bdImuno) {
            if (newImunoup.getNome().equals(imuno)) {
                int index = bdImuno.indexOf(imunossupressor);
                bdImuno.set(index, newImunoup);
                return newImunoup;
            }
        }
        return null;
    }
     public Paciente updatePaciente(Paciente newPac) {
        String nomePac = newPac.getNomePes();
        for (Paciente paciente : bdPaciente) {
            if (newPac.getNomePes().equals(nomePac)) {
                int index = bdPaciente.indexOf(paciente);
                bdPaciente.set(index, newPac);
                return newPac;
            }
        }
        return null;
    }
    public Anti_Alergico consultaAntiAler( String nome,List<Anti_Alergico> bdAntiAler){
        for (Anti_Alergico AntiAler : bdAntiAler) {
        if (AntiAler.getNome().equalsIgnoreCase(nome)) {
            return AntiAler;
        }
    }
    return null;
    }
     public Anti_Hipertensivo consultaAntiHtensao(String nome, List<Anti_Hipertensivo> bdAntiHiper) {
        for (Anti_Hipertensivo antiHtensao : bdAntiHiper) {
            if (antiHtensao.getNome().equalsIgnoreCase(nome)) {
                return antiHtensao;
            }
        }
    return null;
}

    public Imunosupressor consultaImunosup(String nome, List<Imunosupressor> bdImuno) {
        for (Imunosupressor imunosup : bdImuno) {
            if (imunosup.getNome().equalsIgnoreCase(nome)) {
                return imunosup;
            }
        }
        return null;
    }

       public Paciente consultaPac( String codigoSaude, ArrayList <Paciente> bdPaciente){
            for (Paciente paciente : bdPaciente) {
                 if (paciente.getSaudCod().equalsIgnoreCase(codigoSaude)) {
                    return paciente;
            }
        }
        return null; 
        }

}
