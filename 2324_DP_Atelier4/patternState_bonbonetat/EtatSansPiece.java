package patternState_bonbonetat;

public class EtatSansPiece implements Etat {
    DistributeurAvecState distributeurAvecState;
 
    public EtatSansPiece(DistributeurAvecState distributeurAvecState) {
        this.distributeurAvecState = distributeurAvecState;
    }
 
	public void insererPiece() {
		System.out.println("Vous avez inséré une pièce");
		distributeurAvecState.setEtat(distributeurAvecState.getEtatAPiece());
	}
 
	public void ejecterPiece() {
		System.out.println("Vous n'avez pas inséré de pièce");
	}
 
	public void tournerPoignee() {
		System.out.println("Vous avez tourné, mais il n'y a pas de pièce");
	 }
 
	public void delivrer() {
		System.out.println("Il faut payer d'abord");
	} 
 
	public String toString() {
		return "attend une pièce";
	}
}
