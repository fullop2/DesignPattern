package Singleton;

public class DCLSingleton {
	private static DCLSingleton uniqueInstance;
	
	private DCLSingleton() {}
	
	public static DCLSingleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (DCLSingleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new DCLSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}