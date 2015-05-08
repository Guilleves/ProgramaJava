package presentacion;

import java.awt.List;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class GestionCamposTexto 
{
	
	private JTextField nombre, apellido, telefono, domicilio, buscar, total;
	private JTextPane descripcion;
	private List lista;
	
	public void crearNombre()
	{
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(272, 11, 160, 25);
	}
	
	public void crearApellido()
	{
		apellido = new JTextField();
		apellido.setColumns(10);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		apellido.setBounds(272, 47, 160, 25);
	}
	

	public void crearTelefono()
	{
		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setHorizontalAlignment(SwingConstants.CENTER);
		telefono.setBounds(272, 83, 160, 25);
	}
	
	public void crearDomicilio()
	{
		domicilio = new JTextField();
		domicilio.setColumns(10);
		domicilio.setHorizontalAlignment(SwingConstants.CENTER);
		domicilio.setBounds(272, 119, 160, 25);
	}
	
	public void crearBuscar()
	{
		buscar = new JTextField();
		buscar.setHorizontalAlignment(SwingConstants.CENTER);
		buscar.setColumns(10);
		buscar.setBounds(10, 49, 112, 25);
	}
	
	public void crearDescripcion()
	{
		descripcion = new JTextPane();
		descripcion.setBounds(272, 47, 160, 62);
	}
	
	public void crearLista()
	{
		lista = new List();
		lista.setBounds(10, 113, 160, 143);
	}
	
	public JTextField crearEntrega()
	{
		JTextField entrega = new JTextField();
		entrega.setBounds(10, 102, 140, 30);
		entrega.setColumns(10);
		return entrega;
	}
	
	public void crearTotal()
	{
		total = new JTextField();
		total.setEditable(false);
		total.setColumns(10);
		total.setBounds(10, 36, 140, 30);
	}

	public JTextField getNombre()
	{
		return nombre;
	}
	
	public JTextField getApellido() 
	{
		return apellido;
	}

	public JTextField getTelefono() 
	{
		return telefono;
	}

	public JTextField getDomicilio() 
	{
		return domicilio;
	}
	
	public JTextField getBuscar() 
	{
		return buscar;
	}
	
	public JTextPane getDescripcion()
	{
		return descripcion;
	}
	
	public List getLista()
	{
		return lista;
	}
	
	public JTextField getTotal()
	{
		return total;
	}

}
