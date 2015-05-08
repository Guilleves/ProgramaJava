package negocio;
import datos.CatalogoClientes;
import datos.Clientes;
public class ControladorClientes {
	private int i;
	private Clientes c, c2;
	private CatalogoClientes cc = new CatalogoClientes();
	
	public void inicializari()
	{
		this.i=-1;
	}
	
	public Clientes buscarUltimoCliente()
	{
		this.c = new Clientes();
		this.i = this.cc.getTamanoLista()-1;
		this.c=this.cc.getListaClientes(this.i);
		return this.c;
	}
	
	public Clientes buscarPrimerCliente()
	{
		if (cc.getTamanoLista() != 0)
		{
			this.c = new Clientes();
			this.i = 0;
			this.c = this.cc.getListaClientes(this.i);
			return c;
		}
		else
		{
			this.c = new Clientes();
			this.i = 0;
			this.c.setNombre("No se encuentra");
			this.c.setApellido("el cliente");
			this.c.setTelefono("que se está");
			this.c.setDomicilio("buscando");
			return c;
		}
	}
	
	public int tamano()
	{
		return cc.getTamanoLista();
	}
	
	public Clientes buscarClienteAbajo()
	{
		this.i--;
		if (i<0) i++;
		this.c = new Clientes();
		this.c=this.cc.getListaClientes(this.i);
		return c;
	}
	public Clientes buscarClienteArriba()
	{
		if (this.cc.getTamanoLista() != 0)
			this.i++;
			if (i>this.cc.getTamanoLista()-1) i--;
			this.c = new Clientes();
			this.c=this.cc.getListaClientes(this.i);
			return c;

	}
	
	public Clientes devolverClientes(int k)
	{	
		this.c2 = cc.getListaClientes(k);
			return this.c2;
	}
	
	public String buscarNombreCliente()
	{
		return c.getNombre();
	}
	public String buscarApellidoCliente()
	{
		return c.getApellido();
	}
	public String buscarTelefonoCliente()
	{
		return c.getTelefono();
	}
	public String buscarDomicilioCliente()
	{
		return this.c.getDomicilio();
	}
	public int buscarID()
	{
		return this.c.getIdClientes();
	}

	public void crearNuevoCliente(String nombre, String apellido, String telefono, String domicilio)
	{
		Clientes C = new Clientes();
		C.setNombre(nombre);
		C.setApellido(apellido);
		C.setTelefono(telefono);
		C.setDomicilio(domicilio);
		this.cc.nuevoCliente(C);
	}
	
	public void filtrarLista(String filtro)
	{
		cc.cargarLista(filtro);
	}
	
	public void modificarCliente(String nombre, String apellido, String telefono, String domicilio, int idCliente)
	{
		Clientes C = new Clientes();
		C.setNombre(nombre);
		C.setApellido(apellido);
		C.setTelefono(telefono);
		C.setDomicilio(domicilio);
		C.setIdClientes(idCliente);
		this.cc.modificarCliente(C);
	}
}
