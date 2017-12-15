import java.util.Scanner;
public class FrontEnd {

	public static void main(String[] args) {
		String opcionS;
		int opcion;
		int resultado;
		Scanner sc;
		boolean bandera=true;
		// TODO Auto-generated method stub
		System.out.println("Calculadora");
		System.out.println("Escoja una operaci�n");
		System.out.println("1) Suma");
		System.out.println("2) Multiplicaci�n");
		System.out.println("3) Resta");
		do {
			sc= new Scanner(System.in);
			opcionS = sc.nextLine();
			bandera = FrontEnd.menu(opcionS);
			
		}while(bandera);
		
	}
	
	private static boolean menu(String opcionS, numero1, numer) {
		int opcion;
		int resultado;
		boolean bandera;
		if(FrontEnd.isNumeric(opcionS)) {
			opcion= Integer.parseInt(opcionS);
			switch(opcion) {
			case 1:
				resultado =0;//Igualo a la suma
				System.out.println("El resultado es: "+String.valueOf(resultado));
				bandera=false;
				break;
			case 2:
				resultado =0;//Igualo a la multiplicaci�n
				System.out.println("El resultado es: "+String.valueOf(resultado));
				bandera=false;
				break;
			case 3:
				resultado =0;//Igualo a la resta
				System.out.println("El resultado es: "+String.valueOf(resultado));
				bandera=false;
				break;
			default:
				System.out.println("Ingrese una opci�n v�lida");
				bandera = true;
				break;
			}
			return bandera;
		}else {
			return true;
		}
		
		
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

}