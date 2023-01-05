
public class contaPoupaca extends Conta {

	public contaPoupaca(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
