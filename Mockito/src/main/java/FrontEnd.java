import java.util.Scanner;
//import static org.mockito.Mockito.*;
//Suma mockedSuma = mock(Suma.class);
public class FrontEnd {
        static OperacionSuma suma ;
        static OperacionMultiplicacion multiplicacion;
        static OperacionResta resta;

        public static void setSuma(OperacionSuma suma) {
            FrontEnd.suma = suma;
        }

        public static void setMultiplicacion(OperacionMultiplicacion multiplicacion) {
            FrontEnd.multiplicacion = multiplicacion;
        }

        public static void setResta(OperacionResta resta) {
            FrontEnd.resta = resta;
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
                    sc = new Scanner(System.in);
                    opS = sc.nextLine();
                    v1= FrontEnd.isNumeric(opS);
                }while(!v1);
                v1=true;
                op=Integer.parseInt(opS);
                v1=isInRange(op,0,4);
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
            int resultado=FrontEnd.calcular(op, num1, num2);
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

        public static int calcular(int op, int num1, int num2){
            int resultado =0;
            switch (op){
                case 1:
                    resultado = suma.sumar(num1, num2);
                    break;
                case 2:
                    resultado = multiplicacion.multiplicar(num1, num2);
                    break;
                case 3:
                    resultado = resta.restar(num1, num2);
                    break;
                default:
                	resultado = -1;
                    break;
            }
            return resultado;
        }
}
