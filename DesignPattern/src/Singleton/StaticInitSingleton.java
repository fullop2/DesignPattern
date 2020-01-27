package Singleton;

public class StaticInitSingleton {
		private static StaticInitSingleton uniqueInstance = new StaticInitSingleton();
		
		private StaticInitSingleton() {}
		
		public static StaticInitSingleton getInstance() {
			return uniqueInstance;
		}
	}