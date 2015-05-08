package negocio;
import datos.CatalogoProductos;
import datos.Productos;
public class ControladorProductos {
	private int i;
	private Productos p, p2;
	private CatalogoProductos cp = new CatalogoProductos();
	
	public void inicializari()
	{
		this.i=-1;
	}
	
	public Productos buscarUltimoProducto()
	{
		this.p = new Productos();
		this.i = this.cp.getTamanoLista()-1;
		this.p=this.cp.getListaProductos(this.i);
		return this.p;
	}
	
	public Productos buscarPrimerProducto()
	{
		if (cp.getTamanoLista() != 0)
		{
			this.p = new Productos();
			this.i = 0;
			this.p = this.cp.getListaProductos(this.i);
			return p;
		}
		else
		{
			this.p = new Productos();
			this.i = 0;
			this.p.setNombre("No se encuentra");
			this.p.setDescripcion("el producto");
			this.p.setPrecio(0);
			return p;
		}
	}
	
	public Productos buscarProductoAbajo()
	{
		this.i--;
		if (i<0) i++;
		this.p = new Productos();
		this.p=this.cp.getListaProductos(this.i);
		return p;
	}
	public Productos buscarProductoArriba()
	{
		if (this.cp.getTamanoLista() != 0)
			this.i++;
			if (i>this.cp.getTamanoLista()-1) i--;
			this.p = new Productos();
			this.p=this.cp.getListaProductos(this.i);
			return p;

	}
	
	public Productos devolverProductos(int k)
	{	
		this.p2 = cp.getListaProductos(k);
			return this.p2;
	}
	
	public int tamano()
	{
		return cp.getTamanoLista();
	}
	
	public String buscarNombreProducto()
	{
		return p.getNombre();
	}
	public String buscarDescripcionProducto()
	{
		return p.getDescripcion();
	}
	public Float buscarPrecioProducto()
	{
		return p.getPrecio();
	}
	public int buscarID()
	{
		return this.p.getIdProductos();
	}

	public void crearNuevoProducto(String nombre, String descripcion, float precio)
	{
		Productos P = new Productos();
		P.setNombre(nombre);
		P.setDescripcion(descripcion);
		P.setPrecio(precio);
		this.cp.nuevoProducto(P);
	}
	
	public void filtrarLista(String filtro)
	{
		cp.cargarLista(filtro);
	}
	
	public void modificarProducto(String nombre, String descripcion, float precio, int idproducto)
	{
		Productos P = new Productos();
		P.setNombre(nombre);
		P.setDescripcion(descripcion);
		P.setPrecio(precio);
		P.setIdProductos(idproducto);
		this.cp.modificarProductos(P);
	}
}
