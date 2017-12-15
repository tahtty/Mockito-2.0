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
		System.out.println("Escoja una operación");
		System.out.println("1) Suma");
		System.out.println("2) Multiplicación");
		System.out.println("3) Resta");
		do {
			sc= new Scanner(System.in);
			opcionS = sc.nextLine();
			if(FrontEnd.isNumeric(opcionS)) {
				opcion= Integer.parseInt(opcionS);
				switch(opcion) {
				case 1:
					resultado =0;//Igualo a la suma
					System.out.println("El resultado es: "+String.valueOf(resultado));
					break;
				case 2:
					resultado =0;//Igualo a la multiplicación
					System.out.println("El resultado es: "+String.valueOf(resultado));
					break;
				case 3:
					resultado =0;//Igualo a la resta
					System.out.println("El resultado es: "+String.valueOf(resultado));
					break;
				default:
					System.out.println("Ingrese una opción válida");
					break;
				}
			}
		}while(bandera);
		
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
