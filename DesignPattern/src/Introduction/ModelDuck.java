package Introduction;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I'm ModelDuck");
	}
}
