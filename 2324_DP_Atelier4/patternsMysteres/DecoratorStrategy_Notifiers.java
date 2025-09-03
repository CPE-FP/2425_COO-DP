package patternsMysteres;

public class DecoratorStrategy_Notifiers {
	
	  public static void main(String[] args) {
		  String message = "Je suis un message";
		  System.out.println("*********** Test Strategy seules **********");
		  NotifyStrategy mail = new Mail();
		  mail.send(message);
		  NotifyStrategy sms = new Sms();
		  sms.send(message);
		  System.out.println("\n*********** Test Notifier concret seul **********");
		  Notify concreteNotify = new ConcreteNotify(mail) ;
		  concreteNotify.sendMessage(message);
		  System.out.println("\n*********** Test Decorator **********");
		  Notify decoratorNotify = new DecoratorNotify(concreteNotify, sms);
		  decoratorNotify.sendMessage(message);
		  System.out.println("\n*********** Test Decorator avec enchainement new **********");
		  Notify decoratorNotify2 = new DecoratorNotify(new ConcreteNotify(sms), mail);
		  decoratorNotify2.sendMessage(message);
	  }
}

interface NotifyStrategy{
	public void send(String message);
}

class Mail implements NotifyStrategy{
	public void send(String message){
		System.out.println("Mail "+message+" ");
	}
}

class Sms implements NotifyStrategy{
	public void send(String message){
		System.out.println("SMS "+message+" ");
	}
}


interface Notify{
	public void sendMessage(String message);
}

class ConcreteNotify implements Notify{
	
	NotifyStrategy strategy;
	
	public  ConcreteNotify(NotifyStrategy strategy){
		this.strategy=strategy;
	}

	public void sendMessage(String message) {
		strategy.send( message);
	}
}

class DecoratorNotify implements Notify{
	
	NotifyStrategy strategy;
	Notify wrappredNotify;
	
	public  DecoratorNotify(Notify wrappredNotify, NotifyStrategy strategy){
		this.strategy=strategy;
		this.wrappredNotify=wrappredNotify;
	}

	public void sendMessage(String message) {
		strategy.send( message);
		wrappredNotify.sendMessage(message);
	}
}