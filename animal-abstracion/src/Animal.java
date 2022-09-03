
public abstract class Animal {
	
	//Atributos
	String tamanio;
	String tipoReproduccion;
	boolean esCarnivoro;
	
	//Constructor
	public Animal() {
		this.tamanio = "";
		this.tipoReproduccion = "";
		this.esCarnivoro = false;
	}

	//Metodos
	
	public abstract void desplazamiento();
	
	public abstract void sonido();
	
}

class Serpiente extends Animal {
	
	@Override
	public void desplazamiento() {
		System.out.println("Las serpientes se impulsan con fuerza hacia arriba planeando.");
	}

	@Override
	public void sonido() {
		System.out.println("Las serpientes hacen un sonido de \"siseo\", lo cual hace que parezca que pronunciaran la letra s arrastrando esta ultima.");
	}
	
}

class Zorro extends Animal {

	@Override
	public void desplazamiento() {
		System.out.println("Los zorros se desplazan al trote y con las huellas en posición oblicua a la dirección en que se desplazan.");
	}

	@Override
	public void sonido() {
		System.out.println("Los zorros hacen un sonido de gañido, parecido al llanto o llamada de dolor.");
	}
	
}

class Caballo extends Animal {

	@Override
	public void desplazamiento() {
		System.out.println("Los caballos se desplazan de tres formas diferentes: al paso, al trote y al galope.");
	}

	@Override
	public void sonido() {
		System.out.println("Los caballos hacen sonido de relincho.");
	}
	
}

class Delfin extends Animal {

	@Override
	public void desplazamiento() {
		System.out.println("Los delfines se desplazan hidroplaneando con sus colas.");
	}

	@Override
	public void sonido() {
		System.out.println("Los delfines hacen dos tipos de sonidos: los silbidos y los chasquidos.");
	}
	
}

class Murcielago extends Animal {

	@Override
	public void desplazamiento() {
		System.out.println("Los murcielagos se pueden desplazar por las paredes de los refugios, los árboles, e incluso por el suelo con las alas plegadas y apoyándose sobre sus pulgares, ayudados por las uñas, y sobre los pies.");
	}

	@Override
	public void sonido() {
		System.out.println("Los murcielagos hacen sonidos que se puedne describir como clicks.");
	}
	
}


