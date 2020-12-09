package Principal;

import javax.swing.JOptionPane;

public class Vista {
	
	public Vista() {
		
	}
	public int solicitarNumero() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
		
		
		return n1;
	}
	public void MostarTabla(String tabla) {
		JOptionPane.showMessageDialog(null, tabla );
	}
}
