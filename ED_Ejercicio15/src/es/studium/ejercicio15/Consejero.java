package es.studium.ejercicio15;

public class Consejero extends Empleado
{
	private int numero_acciones;
	
	public Consejero()
	{
		super();
		numero_acciones = 0;
	}

	public Consejero(String nombre, String apellidos, String dni, String domicilio, String puesto, int telefono, int numero_acciones)
	{
		super(nombre, apellidos, dni, domicilio, puesto, telefono);
		this.numero_acciones = numero_acciones;
	}

	public int getNumero_acciones()
	{
		return numero_acciones;
	}

	public void setNumero_acciones(int numero_acciones)
	{
		this.numero_acciones = numero_acciones;
	}
	
	
	
	

}
