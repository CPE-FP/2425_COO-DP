package atelier3.dp.Factories;


import atelier3.dp.Adapter.IOrderProduct;
import atelier3.dp.Adapter.ProductAdapter;
import atelier3.model.IOrder;
import atelier3.model.IProduct;
import atelier3.model.ProductFactory;
import atelier3.view.IView;
import atelier3.view.ViewConsole;


public abstract class AbstractFactory implements IFactory{

	
	ProductFactory productFactory;
	
	protected AbstractFactory() {
		productFactory = new ProductFactory();
	}
	
	@Override
	public abstract IOrder createOrder();
	public abstract void addObserver(IOrder order, IView consoleView);

	@Override
	public final IOrderProduct createProduct(int id) {
		IProduct product = null;
		product = (IProduct) productFactory.createProduct(id) ;
		return new ProductAdapter(product);
	}

	@Override
	public IView createView() {
		IView view = new ViewConsole();
		return view;
	}
	
}