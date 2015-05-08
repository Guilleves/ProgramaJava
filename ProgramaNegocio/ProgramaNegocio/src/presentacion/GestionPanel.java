package presentacion;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class GestionPanel
{
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	private GestionBotones boton = new GestionBotones();
	private GestionCamposTexto texto = new GestionCamposTexto();
	private GestionEtiquetas etiqueta = new GestionEtiquetas();
	public void crearPanel1()
	{		
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		//Botonera arriba
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 11, 422, 172);
		panel3.setLayout(new GridLayout(1, 0, 0, 0));
		
		//Botones superiores
		panel3.add(boton.crearBoton1());
		
		panel3.add(boton.crearBoton2());
		
		//Botonera abajo
		JPanel panel4 = new JPanel();
		panel4.setBounds(10, 183, 422, 172);
		panel4.setLayout(new GridLayout(1, 0, 0, 0));
		
		//Botones inferiores
		panel4.add(boton.crearBoton3());
		
		panel4.add(boton.crearBoton4());
		
		panel1.add(panel3);
		panel1.add(panel4);
	}
	
	public void crearPanel2()
	{

		
		panel2 = new JPanel();
		panel2.setLayout(null);

		panel2.add(texto.crearNombre());

		panel2.add(texto.crearApellido());

		panel2.add(texto.crearDomicilio());

		panel2.add(texto.crearTelefono());

		panel2.add(etiqueta.crearNombre());

		panel2.add(etiqueta.crearApellido());

		panel2.add(etiqueta.crearTelefono());

		panel2.add(etiqueta.crearDomicilio());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton5());
		panel5.add(boton.crearBoton6());
		panel5.add(boton.crearBoton7());
		panel5.add(boton.crearBoton8());

		panel2.add(panel5);
		panel2.add(boton.crearBoton9());
		panel2.add(boton.crearBoton10());
		panel2.add(boton.crearBoton11());
		panel2.add(boton.crearBoton12());
		
		panel2.add(texto.buscar());
		panel2.add(etiqueta.buscar());
	}
	
	public void crearPanel3()
	{

		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.add(texto.crearNombre());
		panel3.add(texto.crearDescripcion());
		panel3.add(texto.crearDomicilio());

		panel3.add(etiqueta.crearNombre());
		panel3.add(etiqueta.crearPrecio());
		panel3.add(etiqueta.crearDescripcion());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton13());
		panel5.add(boton.crearBoton14());
		panel5.add(boton.crearBoton15());
		panel5.add(boton.crearBoton16());
		
		panel3.add(panel5);
		panel3.add(boton.crearBoton17());
		panel3.add(boton.crearBoton18());
		panel3.add(boton.crearBoton19());
		panel3.add(boton.crearBoton12());
		
		panel3.add(texto.buscar());
		panel3.add(etiqueta.buscar());
	}
	
	public void crearPanel4()
	{

		
		panel4 = new JPanel();
		panel4.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(211, 211, 211));
		panel2.setBounds(272, 11, 160, 245);
		panel2.setLayout(null);
		
		panel2.add(etiqueta.crearEntrega());
		panel2.add(etiqueta.crearTotal());
		panel2.add(texto.crearEntrega());
		panel2.add(texto.crearTotal());
		panel2.add(boton.crearBoton23());
		
		panel4.add(panel2);

		
		panel4.add(boton.crearBoton22());
		panel4.add(boton.crearBoton21());
		panel4.add(boton.crearBoton20());
		panel4.add(etiqueta.mostrarCliente());
		
		panel4.add(boton.crearBoton12());
		
		panel4.add(texto.crearLista());
	}
	
	public void crearPanel5()
	{

		
		panel5 = new JPanel();
		panel5.setLayout(null);

		panel5.add(texto.crearNombre());
		
		panel5.add(texto.crearApellido());

		panel5.add(texto.crearDomicilio());
		
		panel5.add(texto.crearTelefono());

		panel5.add(etiqueta.crearNombre());

		panel5.add(etiqueta.crearApellido());

		panel5.add(etiqueta.crearTelefono());

		panel5.add(etiqueta.crearDomicilio());
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(187, 160, 245, 38);
		panel1.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel1.add(boton.crearBoton5());
		panel1.add(boton.crearBoton6());
		panel1.add(boton.crearBoton7());
		panel1.add(boton.crearBoton8());

		panel5.add(panel1);
		panel5.add(boton.crearBoton9());
		panel5.add(boton.crearBoton10());
		panel5.add(boton.crearBoton11());
		panel5.add(boton.crearBoton12());
		panel5.add(boton.crearBoton24());
		panel5.add(boton.crearBoton25());
		
		panel5.add(texto.buscar());
		panel5.add(etiqueta.buscar());
	}
	
	public void crearPanel6()
	{

		
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.add(texto.crearNombre());
		panel6.add(texto.crearDescripcion());
		panel6.add(texto.crearDomicilio());

		panel6.add(etiqueta.crearNombre());
		panel6.add(etiqueta.crearPrecio());
		panel6.add(etiqueta.crearDescripcion());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton13());
		panel5.add(boton.crearBoton14());
		panel5.add(boton.crearBoton15());
		panel5.add(boton.crearBoton16());
		
		panel6.add(panel5);
		panel6.add(boton.crearBoton17());
		panel6.add(boton.crearBoton18());
		panel6.add(boton.crearBoton19());
		panel6.add(boton.crearBoton12());
		panel6.add(boton.crearBoton24());
		panel6.add(boton.crearBoton26());
		
		panel6.add(texto.buscar());
		panel6.add(etiqueta.buscar());
	}
	
	public JPanel getPanel1()
	{
		return panel1;
	}
	
	public JPanel getPanel2()
	{
		return panel2;
	}
	
	public JPanel getPanel3()
	{
		return panel3;
	}
	
	public JPanel getPanel4()
	{
		return panel4;
	}
	
	public JPanel getPanel5()
	{
		return panel5;
	}
	
	public JPanel getPanel6()
	{
		return panel6;
	}
}
