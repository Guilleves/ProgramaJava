package datos;

public class Clientes 
{
	
	private int idClientes;
	private String nombre, apellido, telefono, domicilio;
	private float deuda;
	
	
	public int getIdClientes() 
	{
		return idClientes;
	}
	public void setIdClientes(int idClientes) 
	{
		this.idClientes = idClientes;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellido() 
	{
		return apellido;
	}
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	public String getTelefono() 
	{
		return telefono;
	}
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}
	public String getDomicilio() 
	{
		return domicilio;
	}
	public void setDomicilio(String domicilio) 
	{
		this.domicilio = domicilio;
	}
	public float getDeuda() 
	{
		return deuda;
	}
	public void setDeuda(float deuda) 
	{
		this.deuda = deuda;
	}
}