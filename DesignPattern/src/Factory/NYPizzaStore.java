package Factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYCheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new NYPepperoniPizza();
		}
		else if(type.equals("clam")) {
			pizza = new NYClamPizza();
		}
		//else if()
		
		return pizza;
	}

}
