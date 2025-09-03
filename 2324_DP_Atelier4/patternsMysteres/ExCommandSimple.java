package patternsMysteres;

interface ICommandSimple { 
	void executer(); 
}

//L'objet Commande encapsule l'ORDRE.
class CommandeOuvrirPortail implements ICommandSimple{
	private IPortail lePortail; //récepteur de l'Ordre

	CommandeOuvrirPortail(IPortail lePortail) {//Constructeur  
		this.lePortail=lePortail; } //Initialise le membre récepteur de l'Ordre.

	//--- Implémentation de ICommandSimple:

	//Execution de la commande: l'appel à cette méthode-ci fera
	//que le récepteur (this.lePortail) se verra ordonner une certaine tâche:
	//ici open() .
	public void executer() { 
		this.lePortail.open(); //Lance l'ORDRE encapsulé.
	} 
}

//--------------------
//Le récepteur peut-être n'importe quel objet on s'en fiche.
//Il faut juste qu'il implémente une interface pour l'objet Commande.
interface IPortail { 
	void open(); 
} //RECEPTEUR, DESTINATAIRE DE L'ORDRE

//Récepteur concret
class PortailDeDroite implements IPortail {
	public void open() {
		System.out.println("Je suis le portail de droite et je m'ouvre"); 
	}
}
//---------------------

//L'INVOCATEUR: celui qui fait this.objetCommande.executer() .
//L'invocateur est comme une télécommande programmable.
class Invocateur {

	//L'appel de cette méthode va appeler la méthode executer() de l'objet
	//commande encapsulé: this.commande.
	void clicSurBoutonX(ICommandSimple commande){ 
		commande.executer(); 
	}
}



//----- LE CODE CLIENT: -----------------------------
/*Ne sait pas quelle méthode du IPortail va être appelée
lorsque la méthode executer() de la ICommand sera invoquée par l'invocateur.
L'invocateur ne sait même pas le contenu de l'opération, l'ordre dont il 
demande l'exécution par son telecommande.clicSurBoutonX().
 */
public  class ExCommandSimple {

	public static void main(String[] args) {
		ExCommandSimple ex = new ExCommandSimple();
		ex.go();
	}
	private void go(){

		IPortail monPortail =new PortailDeDroite(); //Le futur récepteur
		ICommandSimple monORDRE=new CommandeOuvrirPortail( monPortail );

		//Association du lancement de l'ORDRE avec le BoutonX de la télécommande.
		Invocateur telecommande=new Invocateur(  );

		//L'invocateur lance l'ORDRE que son objet commande encapsule.
		telecommande.clicSurBoutonX(monORDRE);


		//Résultat: affichera "Je suis le portail de droite et je m'ouvre" .

		//------------------
		//Remarque: un invocateur peut très bien encapsuler plusieurs objets commandes.

	}
}
