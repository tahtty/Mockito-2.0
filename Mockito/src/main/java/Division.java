
public class Division implements OperacionDivision{
	static OperacionSuma suma ;
    static OperacionResta resta;
    
    public void Divison() {
    	this.suma= new Suma();
    	this.resta= new Resta();
    }
    
    public String dividir(int dividendo, int divisor) {
    	if(divisor==0) {
    		return "-1";
    	}
    	int cociente=0;
    	while(dividendo > divisor) {
    		cociente = suma.sumar(cociente, 1);
    		dividendo = resta.restar(dividendo, divisor);
    	}
    	String c = new Integer(cociente).toString();
    	String r = new Integer(dividendo).toString();
    	
    	return c+"/"+r;
    }

}
