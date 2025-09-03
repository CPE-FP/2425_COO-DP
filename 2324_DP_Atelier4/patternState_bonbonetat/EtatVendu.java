package patternState_bonbonetat;

public class EtatVendu implements Etat {
 
    DistributeurAvecState distributeurAvecState;
 
    public EtatVendu(DistributeurAvecState distributeurAvecState) {
        this.distributeurAvecState = distributeurAvecState;
    }
       
	public void insererPiece() {
		System.out.println("Veuillez patienter, le bonbon va tomber");
	}
 
	public void ejecterPiece() {
		System.out.println("Vous avez déjÃ  tourné la poignée");
	}
 
	public void tournerPoignee() {
		System.out.println("Inutile de tourner deux fois !");
	}
 
	public void delivrer() {
		distributeurAvecState.liberer();
		if (distributeurAvecState.getNombre() > 0) {
			distributeurAvecState.setEtat(distributeurAvecState.getEtatSansPiece());
		} else {
			System.out.println("Aïe, plus de bonbons !");
			distributeurAvecState.setEtat(distributeurAvecState.getEtatEpuise());
		}
	}
 
	public String toString() {
		return "délivre un bonbon";
	}
}


