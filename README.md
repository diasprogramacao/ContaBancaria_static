# ContaBancaria_static


Neese comando utilizei o static para somar a quantidade de objetos criados, conforme abaixo : 

Sempre que crio um objeto , exemplo : Conta conta1 = new Conta("1313","444");

O comando soma a quantidade de vez que a new conta foi adionado: 


O static faz o comando calcular a quantidade que foi adiciona .


  private String titular;
	private String numero;
	private String agencia;
	private static int total;
	
	public Conta (String numero, String agencia) {
		
		Conta.total ++;
		this.agencia = agencia;
		this.numero = numero;
	}


