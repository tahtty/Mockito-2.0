
public class Resta implements OperacionResta{
	private int resultado;
	private OperacionSuma suma;
	public void setSuma(OperacionSuma sumar) {
		this.suma = sumar;
	}
	public Resta() {
		this.suma = new Suma();
	}
	public int restar (int 	a, int b)
	{
		b = b*-1;
		this.resultado=this.suma.sumar(a, b);
		return this.resultado;
	}
}
