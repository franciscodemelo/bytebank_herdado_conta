
public class TestaContas {
	public static void main(String[] args) {
		 contaCorrente cc = new contaCorrente(111, 1112);
		 cc.deposita(100.0);
		 
		 
		 contaPoupaca cp = new contaPoupaca(2333, 1220);
		 cp.deposita(200.0);
		 
		 
		 cc.transfere(10.0, cp);
		 
		 System.out.println("cc  " + cc.getSaldo());
		 System.out.println("cp :"  + cp.getSaldo());
	}

}
