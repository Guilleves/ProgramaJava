package presentacion;

import java.awt.List;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class GestionCamposTexto 
{
	
	public JTextField crearNombre()
	{
		JTextField nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(272, 11, 160, 25);
		return nombre;
	}
	
	public JTextField crearApellido()
	{
		JTextField apellido = new JTextField();
		apellido.setColumns(10);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		apellido.setBounds(272, 47, 160, 25);
		return apellido;
	}
	
	public JTextField crearTelefono()
	{
		JTextField telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setHorizontalAlignment(SwingConstants.CENTER);
		telefono.setBounds(272, 83, 160, 25);
		return telefono;
	}
	
	public JTextField crearDomicilio()
	{
		JTextField domicilio = new JTextField();
		domicilio.setColumns(10);
		domicilio.setHorizontalAlignment(SwingConstants.CENTER);
		domicilio.setBounds(272, 119, 160, 25);
		return domicilio;
	}
	
	public JTextField buscar()
	{
		JTextField buscar = new JTextField();
		buscar.setHorizontalAlignment(SwingConstants.CENTER);
		buscar.setColumns(10);
		buscar.setBounds(10, 49, 112, 25);
		return buscar;
	}
	
	public JTextPane crearDescripcion()
	{
		JTextPane descripcion = new JTextPane();
		descripcion.setBounds(272, 47, 160, 62);
		return descripcion;
	}
	
	public List crearLista()
	{
		List lista = new List();
		lista.setBounds(10, 113, 160, 143);
		return lista;
	}
	
	public JTextField crearEntrega()
	{
		JTextField entrega = new JTextField();
		entrega.setBounds(10, 102, 140, 30);
		entrega.setColumns(10);
		return entrega;
	}
	
	public JTextField crearTotal()
	{
		JTextField total = new JTextField();
		total.setEditable(false);
		total.setColumns(10);
		total.setBounds(10, 36, 140, 30);
		return total;
	}
}
