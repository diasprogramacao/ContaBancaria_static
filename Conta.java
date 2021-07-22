
public class Conta {

	private String titular;
	private String numero;
	private String agencia;
	private static int total;
	
	public Conta (String numero, String agencia) {
		
		Conta.total ++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public String getagencia() {
		
		return agencia;
	}
	
	public String getnumero() {
		
		return numero;
	}
	
	public static int getTotal() {
		
		return Conta.total;
	}
}
