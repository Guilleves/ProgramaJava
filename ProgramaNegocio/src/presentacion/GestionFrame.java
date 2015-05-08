package presentacion;
import javax.swing.JFrame;
import java.awt.CardLayout;

public class GestionFrame
{
	private JFrame frame;
	
	public void crearFrame()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
}
