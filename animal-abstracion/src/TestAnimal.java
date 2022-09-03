
public class TestAnimal {

	public static void main(String[] args) {
		
		//Objetos instanciados 
		Caballo Spirit = new Caballo();
		Delfin Squeaky = new Delfin();
		Murcielago Cosmo = new Murcielago();
		Serpiente Kaa = new Serpiente();
		Zorro Fantastico = new Zorro();
		
		//Llamada a metodos abstractos de cada objeto
		System.out.println("Caballo");
		Spirit.desplazamiento();
		Spirit.sonido();
		System.out.println();
		System.out.println("Delfin");
		Squeaky.desplazamiento();
		Squeaky.sonido();
		System.out.println();
		System.out.println("Murcielago");
		Cosmo.desplazamiento();
		Cosmo.sonido();
		System.out.println();
		System.out.println("Serpiente");
		Kaa.desplazamiento();
		Kaa.sonido();
		System.out.println();
		System.out.println("Zorro");
		Fantastico.desplazamiento();
		Fantastico.sonido();
		System.out.println();
	}

}
