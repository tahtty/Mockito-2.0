

public class Multiplicacion {
	
	private int resultado;
	
	public Multiplicacion() {
		this.resultado=0;
	}
	
	public int multiplicar(int multiplicando, int multiplicador) {
		int temp;
		if(multiplicador==0) {
			this.resultado=0;
			return this.resultado=0;
		}
		if(multiplicador<0) {
			//suma.new Suma();
			//resta=new Resta();
			//multiplicador=resta.restar(0,multplicador);
			for(int i=0;i<multiplicador;i++) {
				//this.resultado=suma.sumar(this.resultado,multiplicando);
			}
			//this.resultado=resta.restar(0,this.resultado);

		}
		else {
			for(int i=0;i<multiplicador;i++) {
				//this.resultado=suma.sumar(this.resultado,multiplicando);
			}
		}
		
		return this.resultado;
	}
	
}
