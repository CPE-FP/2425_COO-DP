package patternState_bonbon;

public class TestDistributeurSansState{

	public static void main(String[] args) {
		DistributeurSansState distributeurSansState = new DistributeurSansState(5);

		System.out.println(distributeurSansState);

		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();

		System.out.println(distributeurSansState);

		distributeurSansState.insererPiece();
		distributeurSansState.ejecterPiece();
		distributeurSansState.tournerPoignee();

		System.out.println(distributeurSansState);

		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();
		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();
		distributeurSansState.ejecterPiece();

		System.out.println(distributeurSansState);

		distributeurSansState.insererPiece();
		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();
		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();
		distributeurSansState.insererPiece();
		distributeurSansState.tournerPoignee();

		System.out.println(distributeurSansState);
	}
}
