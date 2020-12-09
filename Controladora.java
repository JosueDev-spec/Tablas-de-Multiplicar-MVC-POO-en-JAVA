package Principal;

public class Controladora {
	public Controladora() {
		
	}
	public void Inciar() {
		Tabla tb = new Tabla();
		Vista vi = new Vista();
		 tb.setNumero(vi.solicitarNumero());
		 vi.MostarTabla(tb.getTabla());
		 
		 
	}

}
