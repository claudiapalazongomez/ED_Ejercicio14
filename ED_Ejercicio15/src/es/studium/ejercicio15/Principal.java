package es.studium.ejercicio15;

public class Principal
{

	public static void main(String[] args)
	{
		Consejero consejero1 = new Consejero("Daniel", "López Tango", "89541237G", "C/Alejo Fernández, 16", "consejero", 654981256, 32);
		Consejero consejero2 = new Consejero("Juan José", "Jímenez Del Río", "78125637K", "C/Aire, 7", "consejero", 623894561, 5);
		
		System.out.println(consejero1.getNombre()+ " " + consejero1.getApellidos() + " con dni " + consejero1.getDni() + " vive en " + consejero1.getDomicilio() + ", trabaja como " + consejero1.getPuesto() + " y le pertenece este número de teléfono: " + consejero1.getTelefono() + ". Además, tiene " + consejero1.getNumero_acciones() + " acciones.");
		System.out.println(consejero2.getNombre()+ " " + consejero2.getApellidos() + " con dni " + consejero2.getDni() + " vive en " + consejero2.getDomicilio() + ", trabaja como " + consejero2.getPuesto() + " y le pertenece este número de teléfono: " + consejero2.getTelefono() + ". Además, tiene " + consejero2.getNumero_acciones() + " acciones.");
	}

}
