package patternState_bonbonetat;


public class EtatAPiece implements Etat {
	DistributeurAvecState distributeurAvecState;
 
	public EtatAPiece(DistributeurAvecState distributeurAvecState) {
		this.distributeurAvecState = distributeurAvecState;
	}
  
	public void insererPiece() {
		System.out.println("Vous ne pouvez pas insérer d'autre pièce");
	}
 
	public void ejecterPiece() {
		System.out.println("Pièce retournée");
		distributeurAvecState.setEtat(distributeurAvecState.getEtatSansPiece());
	}
 
	public void tournerPoignee() {
		System.out.println("Vous avez tourné....");
		distributeurAvecState.setEtat(distributeurAvecState.getEtatVendu());
	}

    public void delivrer() {
        System.out.println("Pas de bonbon délivré");
    }
 
	public String toString() {
		return "attend que la poignée soit tournée";
	}
}
