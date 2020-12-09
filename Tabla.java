package Principal;

public class Tabla {
	private int numero;
	public Tabla() {
		
	}

	public Tabla(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String  getTabla() {
		String tabla= "TABLA DEL 	 "+numero+" \n";
		
		for(int i = 0 ; i <= 10;i++)
		{
			tabla = tabla +i+" * "+numero+" = "+numero*i+"\n";
		}
		return tabla;
	}
	

}
