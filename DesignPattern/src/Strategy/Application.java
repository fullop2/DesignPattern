package Strategy;

public class Application {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		
		modelDuck.setFlyBehavior(new FlyWithWings());
		modelDuck.performFly();
	}
}
