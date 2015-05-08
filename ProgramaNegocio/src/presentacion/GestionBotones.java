package presentacion;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;


public class GestionBotones 
{

	public JButton crearBoton1()
	{
		JButton boton1 = new JButton("Clientes");
		boton1.setForeground(new Color(255, 255, 255));
		boton1.setBackground(new Color(0, 0, 0));
		boton1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();

				principal.getPanel().crearPanel2();
				principal.getFrame().getFrame().getContentPane().add(principal.getPanel().getPanel2());
				principal.getPanel().getPanel1().setVisible(false);
				principal.getPanel().getPanel2().setVisible(true);
			}
			
		});
	return boton1;
	}
	
	public JButton crearBoton2()
	{
		JButton boton2 = new JButton("Productos");
		boton2.setForeground(new Color(255, 255, 255));
		boton2.setBackground(new Color(0, 0, 0));
		boton2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				principal.getPanel().crearPanel3();
				principal.getFrame().getFrame().getContentPane().add(principal.getPanel().getPanel3());
				principal.getPanel().getPanel1().setVisible(false);
				principal.getPanel().getPanel3().setVisible(true);
			}
			
		});		
		return boton2;
	}

	public JButton crearBoton3()
	{
		JButton boton3 = new JButton("Venta");
		boton3.setForeground(new Color(255, 255, 255));
		boton3.setBackground(new Color(0, 0, 0));
		boton3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				principal.getPanel().crearPanel4();
				principal.getFrame().getFrame().getContentPane().add(principal.getPanel().getPanel4());
				principal.getPanel().getPanel1().setVisible(false);
				principal.getPanel().getPanel4().setVisible(true);
			}
			
		});		
		return boton3;
	}
	
	public JButton crearBoton4()
	{
		JButton boton4 = new JButton("???");
		boton4.setForeground(new Color(255, 255, 255));
		boton4.setBackground(new Color(0, 0, 0));
		return boton4;
	}
	
	public JButton crearBoton5()
	{
		JButton boton5 = new JButton("<<");
		boton5.setForeground(new Color(255, 255, 255));
		boton5.setBackground(new Color(0, 0, 0));
		return boton5;
	}
	
	public JButton crearBoton6()
	{
		JButton boton6 = new JButton("<");
		boton6.setForeground(new Color(255, 255, 255));
		boton6.setBackground(new Color(0, 0, 0));
		return boton6;
	}
	
	public JButton crearBoton7()
	{
		JButton boton7 = new JButton(">");
		boton7.setForeground(new Color(255, 255, 255));
		boton7.setBackground(new Color(0, 0, 0));
		return boton7;
	}
	
	public JButton crearBoton8()
	{
		JButton boton8 = new JButton(">>");
		boton8.setForeground(new Color(255, 255, 255));
		boton8.setBackground(new Color(0, 0, 0));
		return boton8;
	}
	
	public JButton crearBoton9()
	{
		JButton boton9 = new JButton("Agregar");
		boton9.setForeground(new Color(255, 255, 255));
		boton9.setBackground(new Color(0, 0, 0));
		boton9.setBounds(187, 209, 245, 38);
		boton9.setEnabled(false);
		return boton9;
	}
	
	public JButton crearBoton10()
	{
		JButton boton10 = new JButton("Modificar");
		boton10.setForeground(new Color(255, 255, 255));
		boton10.setBackground(new Color(0, 0, 0));
		boton10.setBounds(187, 258, 245, 38);
		boton10.setEnabled(false);
		return boton10;
	}
	
	public JButton crearBoton11()
	{
		JButton boton11 = new JButton("Eliminar");
		boton11.setForeground(new Color(255, 255, 255));
		boton11.setBackground(new Color(0, 0, 0));
		boton11.setBounds(187, 307, 245, 38);
		return boton11;
	}
	
	public JButton crearBoton12()
	{
		JButton boton12 = new JButton("Menú");
		boton12.setForeground(new Color(255, 255, 255));
		boton12.setBackground(new Color(0, 0, 0));
		boton12.setBounds(10, 307, 112, 33);
		boton12.addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				principal.getPanel().getPanel1().setVisible(true);
				if (principal.getPanel().getPanel2()!= null)
				{
					principal.getPanel().getPanel2().setVisible(false);
					principal.getPanel().setNullPanel2();
				}
				if (principal.getPanel().getPanel3()!= null)
				{
					principal.getPanel().getPanel3().setVisible(false);
					principal.getPanel().setNullPanel3();
				}
				if (principal.getPanel().getPanel4()!= null)
				{
					principal.getPanel().getPanel4().setVisible(false);
				}
				if (principal.getPanel().getPanel5()!= null)
				{
					principal.getPanel().getPanel1().setVisible(false);
					if (JOptionPane.showConfirmDialog(principal.getPanel().getPanel5(), "Si vuelve al menú ahora, se perderan los datos de la venta registrados hasta el momento \n"
							+ "¿Está seguro que deséa salir?") == 0)
					{	
						principal.getPanel().setNullPanel4();
						principal.getPanel().getPanel5().setVisible(false);
						principal.getPanel().setNullPanel5();
						principal.getPanel().getPanel1().setVisible(true);
					}
				}
				if (principal.getPanel().getPanel6()!= null)
				{
					principal.getPanel().getPanel1().setVisible(false);
					if (JOptionPane.showConfirmDialog(principal.getPanel().getPanel6(), "Si vuelve al menú ahora, se perderan los datos de la venta registrados hasta el momento \n"
							+ "¿Está seguro que deséa salir?") == 0)
					{	
						principal.getPanel().getPanel6().setVisible(false);
						principal.getPanel().setNullPanel6();
						principal.getPanel().getPanel1().setVisible(true);
					}
				}


			}
		});
	return boton12;
	}
	
	public JButton crearBoton20()
	{
		JButton boton20 = new JButton("Elegir Cliente");
		boton20.setForeground(new Color(255, 255, 255));
		boton20.setBackground(new Color(0, 0, 0));
		boton20.setBounds(10, 11, 206, 33);
		boton20.addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				principal.getPanel().crearPanel5();
				principal.getFrame().getFrame().getContentPane().add(principal.getPanel().getPanel5());
				principal.getPanel().getPanel4().setVisible(false);
				principal.getPanel().getPanel5().setVisible(true);
			}
		});
		return boton20;
	}
	public JButton crearBoton21()
	{
		JButton boton21 = new JButton("");
		boton21.setForeground(new Color(255, 255, 255));
		boton21.setBackground(new Color(0, 0, 0));
		boton21.setBounds(176, 113, 40, 40);
		boton21.addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				principal.getPanel().crearPanel6();
				principal.getFrame().getFrame().getContentPane().add(principal.getPanel().getPanel6());
				principal.getPanel().getPanel4().setVisible(false);
				principal.getPanel().getPanel6().setVisible(true);
			}
		});
		return boton21;
	}
	
	public JButton crearBoton22()
	{
		JButton boton22 = new JButton("");
		boton22.setForeground(new Color(255, 255, 255));
		boton22.setBackground(new Color(0, 0, 0));
		boton22.setBounds(176, 216, 40, 40);
		return boton22;
	}
	
	public JButton crearBoton23()
	{
		JButton boton23 = new JButton("Realizar Venta");
		boton23.setForeground(new Color(255, 255, 255));
		boton23.setBackground(new Color(0, 0, 0));
		boton23.setBounds(10, 204, 140, 30);
		return boton23;
	}
	
	public JButton crearBoton24()
	{
		JButton boton24 = new JButton("Volver");
		boton24.setForeground(new Color(255, 255, 255));
		boton24.setBackground(new Color(0, 0, 0));
		boton24.setBounds(10, 258, 112, 33);
		boton24.addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				if (principal.getPanel().getPanel6()!= null)
				{
					principal.getPanel().getPanel6().setVisible(false);
					principal.getPanel().setNullPanel6();
				}
				if (principal.getPanel().getPanel5()!= null)
				{
					principal.getPanel().getPanel5().setVisible(false);
					principal.getPanel().setNullPanel5();
				}
				principal.getPanel().getPanel4().setVisible(true);
			}
		});
		return boton24;
	}
	
	public JButton crearBoton25()
	{
		JButton boton25 = new JButton("Seleeccionar");
		boton25.setForeground(new Color(255, 255, 255));
		boton25.setBackground(new Color(0, 0, 0));
		boton25.setBounds(10, 209, 112, 33);
		boton25.addMouseListener(new MouseAdapter()
		{
			@Override 
			public void mouseReleased(MouseEvent arg0) 
			{
				Principal principal = new Principal();
				
				if (principal.getPanel().getPanel6()!= null)
				{
					principal.getPanel().getPanel6().setVisible(false);
					principal.getPanel().setNullPanel6();
				}
				if (principal.getPanel().getPanel5()!= null)
				{
					principal.getPanel().getPanel5().setVisible(false);
					principal.getPanel().setNullPanel5();
				}
				principal.getPanel().getPanel4().setVisible(true);
			}
		});
		return boton25;
	}
	
	
}

