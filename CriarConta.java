
public class CriarConta {
	
	public static void main (String[]agrs) {
		
		Conta conta1 = new Conta("1313","444");
		
		System.out.println(conta1.getagencia());
		System.out.println(conta1.getnumero());
		
		Conta conta2 = new Conta ("1414" , "333");
		
		System.out.println(Conta.getTotal());
	}

}
