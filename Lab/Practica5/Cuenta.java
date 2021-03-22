
public class Cuenta {
	private String nombre;
	private int saldo;
	private int pin;
	
	public Cuenta(String nombre, int saldo, int pin) {
		this.nombre=nombre;
		this.saldo=saldo;
		this.pin=pin;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public int getPin() {
		return pin;
	}
	
}
