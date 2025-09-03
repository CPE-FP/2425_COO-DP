package patternState_bonbonetat;

public class TestDistributeurAvecState {

	public static void main(String[] args) {
		DistributeurAvecState distributeurAvecState = new DistributeurAvecState(5);

		System.out.println(distributeurAvecState);

		distributeurAvecState.insererPiece();
		distributeurAvecState.tournerPoignee();

		System.out.println(distributeurAvecState);

		distributeurAvecState.insererPiece();
		distributeurAvecState.tournerPoignee();
		distributeurAvecState.insererPiece();
		distributeurAvecState.tournerPoignee();

		System.out.println(distributeurAvecState);
	}
}
