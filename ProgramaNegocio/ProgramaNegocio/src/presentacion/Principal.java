package presentacion;

import java.awt.EventQueue;


public class Principal {
	private static GestionPanel paneles;
	public static GestionFrame frame;
	
	public GestionPanel getPanel()
	{
		return paneles;
	}
	
	public GestionFrame getFrame()
	{
		return frame;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Inicializar
					frame = new GestionFrame();
					paneles = new GestionPanel();
					
					//Crear frame
					frame.crearFrame();
					
					//Mostrar frame
					frame.getFrame().setVisible(true);
					
					//Crear panel
					paneles.crearPanel1();
					
					//Agregar panel al frame
					frame.getFrame().getContentPane().add(paneles.getPanel1());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
