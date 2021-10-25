package TD2_PF.td2_universite;

import java.util.Map;

public class Etudiant {
    private String numero;
    private String prenom;
    private String nom;
    private Map<Matiere,Double> notes;

    public Etudiant(String parNum,String parPre,String parNom,Map<Matiere,Double> parNotes){
        this.numero=parNum;
        this.nom=parNom;
        this.prenom=parPre;
        this.notes=parNotes;

    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public Map<Matiere, Double> getNotes() {
        return notes;
    }

    public void noter(Matiere matiere, Double note){
        this.notes.put(matiere,note);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }
}
