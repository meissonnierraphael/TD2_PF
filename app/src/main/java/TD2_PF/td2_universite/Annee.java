package TD2_PF.td2_universite;

import java.util.HashSet;
import java.util.Set;

public class Annee {

    private Set<UE> ues;
    private Set<Etudiant> etudiants;

    public Annee(Set<UE> ues){
        this.etudiants = new HashSet<>();
        this.ues=ues;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public Set<UE> getUes() {
        return ues;
    }

    public void inscrire(Etudiant e){
        this.etudiants.add(e);
    }
}
