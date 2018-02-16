import java.util.Scanner;
//import static org.mockito.Mockito.*;
//Suma mockedSuma = mock(Suma.class);
public class FrontEnd {
        static OperacionSuma suma ;
        static OperacionMultiplicacion multiplicacion;
        static OperacionResta resta;
        static OperacionDivision division;

        public static void setSuma(OperacionSuma suma) {
            FrontEnd.suma = suma;
        }

        public static void setMultiplicacion(OperacionMultiplicacion multiplicacion) {
            FrontEnd.multiplicacion = multiplicacion;
        }

        public static void setResta(OperacionResta resta) {
            FrontEnd.resta = resta;
        }
        
        public static void setDivision(OperacionDivision divi) {
            FrontEnd.division = divi;
        }

	public static void main(String[] args) {
            Scanner sc;
            boolean v1;
            String opS;
            int op;
            int num1;
            int num2;
            System.out.println("Calculadora");
            do{
                do{
                    System.out.println("Ingrese la operación que desea realizar");
                    System.out.println("1) Suma");
                    System.out.println("2) Multiplicación");
                    System.out.println("3) Resta");
                    System.out.println("4) División");
                    sc = new Scanner(System.in);
                    opS = sc.nextLine();
                    v1= FrontEnd.isNumeric(opS);
                }while(!v1);
                v1=true;
                op=Integer.parseInt(opS);
                v1=isInRange(op,0,5);
            }while(!v1);
            do{
                System.out.println("Ingrese el primer número:");
                sc = new Scanner(System.in);
                opS = sc.nextLine();
                v1= FrontEnd.isNumeric(opS);
                num1=Integer.parseInt(opS);
            }while(!v1);
            do{
                System.out.println("Ingrese el segundo número:");
                sc = new Scanner(System.in);
                opS = sc.nextLine();
                v1= FrontEnd.isNumeric(opS);
                num2=Integer.parseInt(opS);
            }while(!v1);
            String resultado=FrontEnd.calcular(op, num1, num2);
            if(resultado.contains(":")) {
            	String[]division= resultado.split("/");
            	resultado = "Cociente: "+division[0]+" Residuo: "+division[1];
            }
            System.out.println("El resultado es: "+resultado);
        }
		
	
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
        public static boolean isInRange(int num, int inicio, int fin){
            return(num>inicio&&num<fin);
        }

        public static String calcular(int op, int num1, int num2){
            String resultado ="";
            switch (op){
                case 1:
                    resultado = new Integer(suma.sumar(num1, num2)).toString();
                    break;
                case 2:
                    resultado = new Integer(multiplicacion.multiplicar(num1, num2)).toString();
                    break;
                case 3:
                    resultado = new Integer(resta.restar(num1, num2)).toString();
                    break;
                case 4:
                    resultado = division.dividir(num1, num2);
                    break;
                default:
                	resultado = "-1";
                    break;
            }
            return resultado;
        }
}
