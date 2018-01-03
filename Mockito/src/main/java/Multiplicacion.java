

public class Multiplicacion implements OperacionMultiplicacion{
	
	private int resultado;
	private OperacionSuma suma;
	private OperacionResta resta;
	
	public OperacionSuma getSuma() {
        return suma;
    }

    public  void setSuma(OperacionSuma suma) {
        this.suma = suma;
    }

    public OperacionResta getResta() {
        return resta;
    }

    public void setResta(OperacionResta resta) {
        this.resta = resta;
    }
	
	public Multiplicacion() {
		this.resultado=0;
	}
	
	public int multiplicar(int multiplicando, int multiplicador) {
		
		boolean bandera;
		int i;
		
		bandera=false;
		
		if(multiplicador<0) {
			bandera=true;
			multiplicador=resta.restar(0, multiplicador);
		}
		for(i=0;i<multiplicador;i++) {
			this.resultado=suma.sumar(this.resultado, multiplicando);
		}
		if(bandera) {
			this.resultado=resta.restar(0, this.resultado);
		}
		return this.resultado;
	}
	
}
