package Singleton;

public final class singletonPD {
	
	private final singletonPD singletonpd = new singletonPD();
	
	//al crear un constructor privado no se permite llamar desde otra clase.
	
	private singletonPD(){
		
	}
}
