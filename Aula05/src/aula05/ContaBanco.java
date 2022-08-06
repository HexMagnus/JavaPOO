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

	}
	
	
	public void fecharConta() {
		if (this.getSaldo() > 0 ) {
			System.out.println("Conta nao pode ser fhcada porque ainda tem dinheiro");
		}else if (this.getSaldo() < 0 ){
			System.out.println("Conta nao pode ser fechada pois tem débito");
		}
		
	}
	
	
	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	public void pagarMensal() {
		
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	
	
	
}
