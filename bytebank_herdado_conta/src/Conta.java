

public  abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("o total das contas é " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	
	public  abstract void deposita(double  valor);
		//this.saldo = this.saldo + valor;   //pode utilizar o "this" para dixer que esta invocando essa conta expecifica.
                                  //exemplo(this.saldo=this.saldo + valor;		
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo =this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca (valor)) {
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
		public double  getSaldo() {
			return this.saldo;
		}
		public int getNumero() {
			return this.numero;
		}
		public  void setNumero(int novoNumero) {
			if(numero <= 0) {
				System.out.println("valor nao pode er menor do que igual 0");
				return;
		}
			this.numero = novoNumero;
		}
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			if(agencia <=0) {
				System.out.println("valor nao pode er menor do que igual 0");
				return;
				}
			this.agencia = agencia;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		public static int  gettotal(){
			return total;
		}
	
}


	
//O uso do this é obrigatório.


//Não é verdade, é justamente contrário. O uso do this é opcional, mas recomendamos o seu uso,
//principalmente para o iniciante na linguagem Java


//O que aprendemos sobre métodos?


//Um método define o comportamento ou a maneira de fazer algo.


//Correto, esse é o objetivo de métodos, definir o que um objeto sabe fazer. O comportamento é implementado dentro do método.

//Alternativa correta
//Um método não precisa definir a saída. Se não tiver um valor de retorno, basta escrever apenas o nome de método.

//Alternativa correta
//É possível que um método não tenha nenhum parâmetro.


//Alternativa correta
//Por convenção, o nome do método no mundo Java deve começar com letra minúscula.


//Correto, exemplo de nome dos métodos são:

//transfere
//transferePara
//transfereParaOutroTitularCOPIAR CÓDIGO
//Repare que todos os nomes começam com letra minúscula e depois usam "CamelCase".