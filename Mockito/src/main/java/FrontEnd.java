import java.util.Scanner;
public class FrontEnd {

	public static void main(String[] args) {
		String opcionS;
		int opcion;
		Scanner sc;
		boolean bandera=true;
		// TODO Auto-generated method stub
		System.out.println("Calculadora");
		System.out.println("Escoja una operación");
		System.out.println("1) Suma");
		System.out.println("2) Multiplicación");
		System.out.println("3) Resta");
		do {
			sc=new Scanner(System.in);
			opcionS=sc.nextLine();
			try {
	            opcion = Integer.parseInt(opcionS);
	            switch(opcion) {
	            	case 1:
	            		break;
	            	case 2:
	            		break;
	            	case 3:
	            		break;
	            	default:
	            		System.out.println("Ingrese una opción válida");
	            }
	            
	        } catch (NumberFormatException excepcion) {
	            bandera = true;
	            System.out.println("Ingrese un número");
	        }
		}while(bandera);
		
	}
	 

}
