import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicacion Calculadora ****");
        Scanner consola = new Scanner(System.in); //leo consola con IN (lo que se ingresa)

        while(true) {

            // ------- MENU --------
            mostrarMenu();

            try{
                var decision = Integer.parseInt(consola.nextLine()); // PARSEO INPUT

                // REVISAR QUE ESTÉ DENTRO DE LAS OPCIONES
                if (decision >= 1 && decision <= 4) {
                    ejecutarDecision(decision, consola);
                } else if (decision == 5) { // SALIR --------------------
                    System.out.println("""
                            ¡¡Hasta Pronto!!
                            Saliendo . . .
                            """);
                    break;
                } else { // OPCION INCORRECTA ---------------------
                    System.out.println("OPCION ERRONEA: " + decision);
                }

                // SALTO PARA QUE NO SE JUNTE EL CICLO
                System.out.println();

            }// FIN TRY
            catch (Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }// FIN CATCH
        }// FIN WHILE
    }
    private static void mostrarMenu(){
        // ---------------- MENU ---------------------
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);

        System.out.print("Operacion a realizar: ");
    }

    private static void ejecutarDecision(int decision, Scanner consola) {
        // ------------- OPERANDO 1
        System.out.print("Proporciona valor Operando1: ");

        var operando1 = Double.parseDouble(consola.nextLine());

        //------------ OPERANDO 2
        System.out.print("Proporciona valor Operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (decision) {
            case 1 -> { // ---------- SUMA ------------
                resultado = operando1 + operando2;
                System.out.println("Resultado SUMA: " + resultado);
            }
            case 2 -> { // ---------------- RESTA -------------
                resultado = operando1 - operando2;
                System.out.println("Resultado RESTA: " + resultado);
            }
            case 3 -> { //--------------- MULTIPLICACION -------------
                resultado = operando1 * operando2;
                System.out.println("Resultado MULTIPLICACION: " + resultado);
            }
            case 4 -> { // ------------- DIVISION -------------
                resultado = operando1 / operando2;
                System.out.println("Resultado DIVISION: " + resultado);
            }
            default -> {
                System.out.println("OPCION ERRONEA: " + decision);
            }
        }
    }
}
