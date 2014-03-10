import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame{
	
	public Fenetre(){
		
		JPanel pan = new JPanel();
		
		this.setTitle("Ton cul");
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		this.setContentPane(pan);
	}
}
