package patternsMysteres;
/*
 * https://www.dofactory.com/net/abstract-factory-design-pattern
 */

public class Animals {
	public static void main(String[] args) {		

			// Create and run the African animal world
			ContinentFactory africa = new AfricaFactory();
			AnimalWorld world = new AnimalWorld(africa);
			world.RunFoodChain();

			// Create and run the American animal world
			ContinentFactory america = new AmericaFactory();
			world = new AnimalWorld(america);
			world.RunFoodChain();
	}
}

class AnimalWorld{
	private Herbivore herbivore;
	private Carnivore carnivore;

	public AnimalWorld(ContinentFactory factory)	{
		carnivore = factory.CreateCarnivore();
		herbivore = factory.CreateHerbivore();
	}
	public void RunFoodChain()	{
		carnivore.eat(herbivore);
	}
}

interface  ContinentFactory {
	public abstract Herbivore CreateHerbivore();
	public abstract Carnivore CreateCarnivore();
}


class AfricaFactory implements ContinentFactory {

	public Herbivore CreateHerbivore()	{
		return new Wildebeest();
	}

	public Carnivore CreateCarnivore()	{
		return new Lion();
	}
}



class AmericaFactory implements ContinentFactory{

	public Herbivore CreateHerbivore()	{
		return new Bison();
	}

	public Carnivore CreateCarnivore()	{
		return new Wolf();
	}
}



interface Herbivore{
}


interface Carnivore{
	public abstract void eat(Herbivore h);
}


class Wildebeest implements Herbivore{
}


class Lion implements Carnivore{

	public void eat(Herbivore h)	{
		// eat Wildebeest
		System.out.println(this.getClass().getSimpleName() +
				" eats " + h.getClass().getSimpleName());
	}
}


class Bison implements Herbivore{
}


class Wolf implements Carnivore{

	public void eat(Herbivore h)	{
		// eat Bison
		System.out.println(this.getClass().getSimpleName() +
				" eats " + h.getClass().getSimpleName());
	}
}


//class AnimalWorld{
//
//	private Herbivore herbivore;
//	private Carnivore carnivore;
//
//	public AnimalWorld(ContinentFactory factory)	{
//		carnivore = factory.CreateCarnivore();
//		herbivore = factory.CreateHerbivore();
//	}
//
//	public void RunFoodChain()	{
//		carnivore.eat(herbivore);
//	}
//}


