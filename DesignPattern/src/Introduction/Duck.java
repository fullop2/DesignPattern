package Introduction;

public abstract class Duck {
	FlyBehavior flyBehavior;		// 행동을 정의하는 클래스
	QuackBehavior quackBehavior;	// Composition - Strategy Pattern
	
	public Duck() {}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim() {
		System.out.println("swimming");
	}
}