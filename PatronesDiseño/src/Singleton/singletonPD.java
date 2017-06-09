package Singleton;

public final class singletonPD {
	
	private final static singletonPD singletonpd = new singletonPD();
	
	//al crear un constructor privado no se permite llamar desde otra clase.
	
	private singletonPD(){
		System.out.println("Patron de diseño singleton a sifo creado.");
	}
	
	public static singletonPD obtenerSingleton(){
		return singletonpd;
	}
}
