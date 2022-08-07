package aula05;

public class ContaBanco {

	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	private int setSaldo;
	private boolean setStatus;
	
	//Metodos Personalizados
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo = 50;
		} else if  (t =="CP"){
			this.setSaldo =150;
		}
		
		System.out.println("Conta aberta com sucesso");

	}
	
	
	public void fecharConta() {
		if (this.getSaldo() > 0 ) {
			System.out.println("Conta nao pode ser fhcada porque ainda tem dinheiro");
		}else if (this.getSaldo() < 0 ){
			System.out.println("Conta nao pode ser fechada pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
		
	}
	
	
	public void depositar(float v) {
		if (this.getStatus()) {
		this.saldo = this.saldo +v;	 // trabalhando com atributos
		this.setSaldo (this.getSaldo()+v); //trabando com métodos especiais
		System.out.println("Depósito realizado com sucesso na conta" +this.getDono());
		}else {
		System.out.println("Impossível depositar em uma conta fechada");	
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
		if (this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v );
			System.out.println("Saque realizado na conta de  "+ this.getDono());
			
		}else {
			System.out.println("Saldo insuficiente para saque");
		}
			
		}else {
			System.out.println("Impossível sacar de uma conta fechada");
	}
}
	public void pagarMensal() {
		int v;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;

		}	
		
	}
	
	//Metodos Especiais
	
	public ContaBanco() {
		this.setSaldo = (0);
		this.setStatus = false;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public String getDono() {
		return this.dono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	
	
	
}
