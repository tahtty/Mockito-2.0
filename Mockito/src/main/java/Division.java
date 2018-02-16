
public class Division implements OperacionDivision{
	public OperacionSuma suma ;
    public OperacionResta resta;
    
    public Division() {
    	this.suma= new Suma();
    	this.resta= new Resta();
    }
    public void setSuma(OperacionSuma suma) {
    	this.suma = suma;
    }
    
    public void setResta(OperacionResta resta) {
    	this.resta = resta;
    }
    
    public String dividir(int dividendo, int divisor) {
    	
    	if(divisor==0) {
    		return "-1";
    	}
    	int cociente=0;
    	while(dividendo >= divisor) {
    		cociente = suma.sumar(cociente, 1);
    		dividendo = resta.restar(dividendo, divisor);
    	}
    	String c = new Integer(cociente).toString();
    	String r = new Integer(dividendo).toString();
    	
    	return c+"/"+r;
    }

}
