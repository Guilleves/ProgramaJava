package presentacion;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GestionEtiquetas 
{
	
	private JLabel mostrarCliente;

	public JLabel crearNombre()
	{
		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(187, 11, 75, 25);
		return nombre;
	}
	
	public JLabel crearApellido()
	{
		JLabel apellido = new JLabel("Apellido");
		apellido.setBounds(187, 47, 75, 25);
		return apellido;
	}
	
	public JLabel crearTelefono()
	{
		JLabel telefono = new JLabel("Tel\u00E9fono");
		telefono.setBounds(187, 83, 75, 25);
		return telefono;
	}
	
	public JLabel crearDomicilio()
	{
		JLabel domicilio = new JLabel("Domicilio");
		domicilio.setBounds(187, 119, 75, 25);
		return domicilio;
	}
	
	public JLabel buscar()
	{
		JLabel buscar = new JLabel("Buscar por Nombre");
		buscar.setHorizontalAlignment(SwingConstants.CENTER);
		buscar.setBounds(10, 11, 112, 25);
		return buscar;
	}
	
	public JLabel crearPrecio()
	{
		JLabel precio = new JLabel("Precio");
		precio.setBounds(187, 119, 75, 25);
		return precio;
	}
	
	public JLabel crearDescripcion()
	{
		JLabel descripcion = new JLabel("Descripci\u00F3n");
		descripcion.setBounds(187, 65, 75, 25);
		return descripcion;
	}
	
	public void crearMostrarCliente()
	{
		mostrarCliente = new JLabel("");
		mostrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarCliente.setBounds(10, 49, 216, 25);
	}
	
	public JLabel crearTotal()	
	{
		JLabel total = new JLabel("Total");
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setBounds(10, 11, 140, 14);
		return total;
	}
	
	public JLabel crearEntrega()
	{
		JLabel entrega = new JLabel("Entrega");
		entrega.setHorizontalAlignment(SwingConstants.CENTER);
		entrega.setBounds(10, 77, 140, 14);
		return entrega;
	}
	
	public JLabel getMostrarCliente()
	{
		return mostrarCliente;
	}
		
}
