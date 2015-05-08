package presentacion;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import negocio.ControladorClientes;

import javax.swing.JPanel;

import negocio.ControladorProductos;

public class GestionPanel
{
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	private GestionBotones boton = new GestionBotones();
	private GestionCamposTexto texto = new GestionCamposTexto();
	private GestionEtiquetas etiqueta = new GestionEtiquetas();
	private float total = 0;
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

		ControladorClientes cc = new ControladorClientes();
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		texto.crearNombre();
		panel2.add(texto.getNombre());
		
		
		texto.crearApellido();
		panel2.add(texto.getApellido());
		texto.crearDomicilio();
		panel2.add(texto.getDomicilio());
		texto.crearTelefono();
		panel2.add(texto.getTelefono());
		texto.crearBuscar();
		
		panel2.add(texto.getBuscar());
		texto.getBuscar().getDocument().addDocumentListener(new DocumentListener() 
		{
                    public void changedUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                    public void insertUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                    public void removeUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                });

		panel2.add(etiqueta.crearNombre());

		panel2.add(etiqueta.crearApellido());

		panel2.add(etiqueta.crearTelefono());

		panel2.add(etiqueta.crearDomicilio());
		
		panel2.add(etiqueta.buscar());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton5()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cc.buscarPrimerCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
			}
		});;
		panel5.add(boton.crearBoton6()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarClienteAbajo();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel5.add(boton.crearBoton7()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarClienteArriba();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel5.add(boton.crearBoton8()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarUltimoCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
			}
		});

		panel2.add(panel5);
		
		
		panel2.add(boton.crearBoton9()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				if (panel2.getComponentAt(187, 209).isEnabled())
				{
				cc.crearNuevoCliente(texto.getNombre().getText(), texto.getApellido().getText(), texto.getTelefono().getText(), texto.getDomicilio().getText());
				cc.buscarUltimoCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
				}
			}
		});
		
		panel2.add(boton.crearBoton10()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.modificarCliente(texto.getNombre().getText(), texto.getApellido().getText(), texto.getTelefono().getText(), texto.getDomicilio().getText(), cc.buscarID());
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel2.add(boton.crearBoton11());
		panel2.add(boton.crearBoton12());
		
		texto.getNombre().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esCliente())
				{
				panel2.getComponentAt(187, 209).setEnabled(false);
				panel2.getComponentAt(187, 258).setEnabled(false);
				}

			else
				{
				panel2.getComponentAt(187, 209).setEnabled(true);	
				panel2.getComponentAt(187, 258).setEnabled(true);
				}	
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});
		
		texto.getApellido().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esCliente())
					{
					panel2.getComponentAt(187, 209).setEnabled(false);
					panel2.getComponentAt(187, 258).setEnabled(false);
					}

				else
					{
					panel2.getComponentAt(187, 209).setEnabled(true);	
					panel2.getComponentAt(187, 258).setEnabled(true);
					}
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});

	}
	
	public void crearPanel3()
	{

		ControladorProductos cp = new ControladorProductos();
		panel3 = new JPanel();
		panel3.setLayout(null);
		texto.crearNombre();
		panel3.add(texto.getNombre());
		texto.crearDescripcion();
		panel3.add(texto.getDescripcion());
		texto.crearDomicilio();
		panel3.add(texto.getDomicilio());

		panel3.add(etiqueta.crearNombre());
		panel3.add(etiqueta.crearPrecio());
		panel3.add(etiqueta.crearDescripcion());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton5()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarPrimerProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel5.add(boton.crearBoton6()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarProductoAbajo();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel5.add(boton.crearBoton7()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarProductoArriba();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel5.add(boton.crearBoton8()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarUltimoProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel3.add(panel5);
		panel3.add(boton.crearBoton9()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cp.crearNuevoProducto(texto.getNombre().getText(), texto.getDescripcion().getText(), Float.parseFloat(texto.getDomicilio().getText()));
				cp.buscarUltimoProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
				
		panel3.add(boton.crearBoton10()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cp.modificarProducto(texto.getNombre().getText(), texto.getDescripcion().getText(), Float.parseFloat(texto.getDomicilio().getText()), cp.buscarID());
				panel3.getComponentAt(187, 209).setEnabled(false);
				panel3.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel3.add(boton.crearBoton11());
		panel3.add(boton.crearBoton12());
		
		
		texto.getNombre().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esProducto())
					{
						panel3.getComponentAt(187, 209).setEnabled(false);
						panel3.getComponentAt(187, 258).setEnabled(false);
					}

				else
					{
						panel3.getComponentAt(187, 209).setEnabled(true);
						panel3.getComponentAt(187, 258).setEnabled(true);
					}
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});		
		
		texto.getDescripcion().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esProducto())
					{
						panel3.getComponentAt(187, 209).setEnabled(false);
						panel3.getComponentAt(187, 258).setEnabled(false);

					}

				else
					{
						panel3.getComponentAt(187, 209).setEnabled(true);
						panel3.getComponentAt(187, 258).setEnabled(true);
					}
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});		
		
		texto.getDomicilio().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esProducto())
					{
						panel3.getComponentAt(187, 209).setEnabled(false);
						if (cambioPrecio())
							panel3.getComponentAt(187, 258).setEnabled(false);
						else
							panel3.getComponentAt(187, 258).setEnabled(true);
					}

				else
					{
						panel3.getComponentAt(187, 209).setEnabled(true);
						panel3.getComponentAt(187, 258).setEnabled(true);
					}
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});		
		
		texto.crearBuscar();
		panel3.add(texto.getBuscar());
		
		texto.getBuscar().getDocument().addDocumentListener(new DocumentListener() 
		{
                    public void changedUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
        				cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                    public void insertUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
                    	cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                    public void removeUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
                    	cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                });
		
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
		texto.crearTotal();
		panel2.add(texto.getTotal());
		panel2.add(boton.crearBoton23());
		
		panel4.add(panel2);

		texto.crearLista();
		panel4.add(texto.getLista());
		
		panel4.add(boton.crearBoton22());
		panel4.add(boton.crearBoton21());
		panel4.add(boton.crearBoton20());

		
		panel4.add(boton.crearBoton12());
		

	}
	
	public void crearPanel5()
	{
		panel5 = new JPanel();
		panel5.setLayout(null);
		
		ControladorClientes cc = new ControladorClientes();
		
		texto.crearNombre();
		panel5.add(texto.getNombre());
		texto.crearApellido();
		panel5.add(texto.getApellido());
		texto.crearDomicilio();
		panel5.add(texto.getDomicilio());
		texto.crearTelefono();
		panel5.add(texto.getTelefono());

		panel5.add(etiqueta.crearNombre());

		panel5.add(etiqueta.crearApellido());

		panel5.add(etiqueta.crearTelefono());

		panel5.add(etiqueta.crearDomicilio());
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(187, 160, 245, 38);
		panel1.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel1.add(boton.crearBoton5()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cc.buscarPrimerCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel1.add(boton.crearBoton6()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarClienteAbajo();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel1.add(boton.crearBoton7()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarClienteArriba();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});
		panel1.add(boton.crearBoton8()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.buscarUltimoCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});

		panel5.add(panel1);
		
		panel5.add(boton.crearBoton9()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.crearNuevoCliente(texto.getNombre().getText(), texto.getApellido().getText(), texto.getTelefono().getText(), texto.getDomicilio().getText());
				cc.buscarUltimoCliente();
				texto.getNombre().setText(cc.buscarNombreCliente());
				texto.getApellido().setText(cc.buscarApellidoCliente());
				texto.getTelefono().setText(cc.buscarTelefonoCliente());
				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel5.add(boton.crearBoton10()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				cc.modificarCliente(texto.getNombre().getText(), texto.getApellido().getText(), texto.getTelefono().getText(), texto.getDomicilio().getText(), cc.buscarID());
				panel5.getComponentAt(187, 209).setEnabled(false);
				panel5.getComponentAt(187, 258).setEnabled(false);
			}
		});
		
		panel5.add(boton.crearBoton11());
		panel5.add(boton.crearBoton12());
		
		texto.getNombre().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esCliente())
				{
					panel5.getComponentAt(187, 209).setEnabled(false);
					panel5.getComponentAt(187, 258).setEnabled(false);
				}

			else
				{
					panel5.getComponentAt(187, 209).setEnabled(true);
					panel5.getComponentAt(187, 258).setEnabled(true);
				}	
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});
		
		texto.getApellido().addKeyListener(new KeyAdapter()
		{
			public void	keyPressed(KeyEvent e)
			{

			}
			public void	keyReleased(KeyEvent e)
			{
				if (esCliente())
					{
						panel5.getComponentAt(187, 209).setEnabled(false);
						panel5.getComponentAt(187, 258).setEnabled(false);
					}

				else
					{
						panel5.getComponentAt(187, 209).setEnabled(true);
						panel5.getComponentAt(187, 258).setEnabled(true);
					}
			}
			public void	keyTyped(KeyEvent e)
			{
				
			}
		});		
		
		
		panel5.add(boton.crearBoton24());

		
		panel5.add(boton.crearBoton25()).addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				etiqueta.crearMostrarCliente();
				etiqueta.getMostrarCliente().setText(cc.buscarApellidoCliente() + " " + cc.buscarNombreCliente());
				panel4.add(etiqueta.getMostrarCliente());
			}
		});
		texto.crearBuscar();
		panel5.add(texto.getBuscar());
		
		texto.getBuscar().getDocument().addDocumentListener(new DocumentListener() 
		{
                    public void changedUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                    public void insertUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                    public void removeUpdate(DocumentEvent e) 
                    {
                    	cc.filtrarLista(texto.getBuscar().getText());
        				cc.buscarPrimerCliente();
        				texto.getNombre().setText(cc.buscarNombreCliente());
        				texto.getApellido().setText(cc.buscarApellidoCliente());
        				texto.getTelefono().setText(cc.buscarTelefonoCliente());
        				texto.getDomicilio().setText(cc.buscarDomicilioCliente());
                    }
                });
		
		panel5.add(etiqueta.buscar());
	}
	
	public void crearPanel6()
	{
		ControladorProductos cp = new ControladorProductos();
		panel6 = new JPanel();
		panel6.setLayout(null);
		texto.crearNombre();
		panel6.add(texto.getNombre());
		texto.crearDescripcion();
		panel6.add(texto.getDescripcion());
		texto.crearDomicilio();
		panel6.add(texto.getDomicilio());

		panel6.add(etiqueta.crearNombre());
		panel6.add(etiqueta.crearPrecio());
		panel6.add(etiqueta.crearDescripcion());
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(187, 160, 245, 38);
		panel5.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel5.add(boton.crearBoton5()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarPrimerProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
			}
		});
		panel5.add(boton.crearBoton6()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarProductoAbajo();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
			}
		});
		panel5.add(boton.crearBoton7()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarProductoArriba();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
			}
		});
		panel5.add(boton.crearBoton8()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.buscarUltimoProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
			}
		});
		
		panel6.add(panel5);
		panel6.add(boton.crearBoton9()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.crearNuevoProducto(texto.getNombre().getText(), texto.getDescripcion().getText(), Float.parseFloat(texto.getDomicilio().getText()));
				cp.buscarUltimoProducto();
				texto.getNombre().setText(cp.buscarNombreProducto());
				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
			}
		});
		panel6.add(boton.crearBoton10()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				cp.modificarProducto(texto.getNombre().getText(), texto.getDescripcion().getText(), Float.parseFloat(texto.getDomicilio().getText()), cp.buscarID());
			}
		});
		panel6.add(boton.crearBoton11());
		panel6.add(boton.crearBoton12());
		panel6.add(boton.crearBoton24());
		panel6.add(boton.crearBoton25()).addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				texto.getLista().add(cp.buscarNombreProducto() + " " + cp.buscarPrecioProducto().toString());
				total = total + cp.buscarPrecioProducto();
				texto.getTotal().setText(Float.toString(total));
				
			}
		});
		
		texto.crearBuscar();
		panel6.add(texto.getBuscar());
		
		texto.getBuscar().getDocument().addDocumentListener(new DocumentListener() 
		{
                    public void changedUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
        				cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                    public void insertUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
                    	cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                    public void removeUpdate(DocumentEvent e) 
                    {
                    	cp.filtrarLista(texto.getBuscar().getText());
                    	cp.buscarPrimerProducto();
        				texto.getNombre().setText(cp.buscarNombreProducto());
        				texto.getDescripcion().setText(cp.buscarDescripcionProducto());
        				texto.getDomicilio().setText(cp.buscarPrecioProducto().toString());
                    }
                });
		
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
	
	public void setNullPanel1()
	{
		panel1 = null;
	}
	
	public void setNullPanel2()
	{
		panel2 = null;
	}
	
	public void setNullPanel3()
	{
		panel3 = null;
	}
	
	public void setNullPanel4()
	{
		panel4 = null;
	}
	
	public void setNullPanel5()
	{
		panel5 = null;
	}
	
	public void setNullPanel6()
	{
		panel6 = null;
	}
	
	public boolean esCliente()
	{
		boolean bandera = false;
		ControladorClientes cc = new ControladorClientes();
		for (int k=0; k < cc.tamano(); k++)
    	{
				if ((cc.devolverClientes(k).getNombre().equals(texto.getNombre().getText())) && (cc.devolverClientes(k).getApellido().equals(texto.getApellido().getText())))
				{
					bandera = true;
					return (bandera);
				}
				

    	}
		
		return (bandera);
	}
	
	public boolean esProducto()
	{
		boolean bandera = false;
		ControladorProductos cp = new ControladorProductos();
		for (int k=0; k < cp.tamano(); k++)
    	{
				if ((cp.devolverProductos(k).getNombre().equals(texto.getNombre().getText())) && (cp.devolverProductos(k).getDescripcion().equals(texto.getDescripcion().getText())))
				{
					bandera = true;
					return (bandera);
				}

    	}
		
		return (bandera);
	}
	
	public boolean cambioPrecio()
	{
		boolean bandera = false;
		ControladorProductos cp = new ControladorProductos();
		for (int k=0; k < cp.tamano(); k++)
    	{
				if (cp.devolverProductos(k).getPrecio() == Float.parseFloat(texto.getDomicilio().getText()))
				{
					bandera = true;
					return (bandera);
				}
				
			}

		
		return (bandera);
	}
	
}
