import java.util.Scanner;
package zoologico;

public class App {
    public static void main(String[] args) {
            System.out.println("BIENVENIDOS AL ZOOLÓGICO");
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("¿Eres trabajador o visitante? (T/V): ");
            String opcion = scanner.nextLine();
            
            if (opcion.equalsIgnoreCase("T")) {
                System.out.println("Mantenimiento");
            } else if (opcion.equalsIgnoreCase("V")) {
                System.out.print("¿Quieres un tour personalizado? (S/N): ");
                String respuesta = scanner.nextLine();
                
                if (respuesta.equalsIgnoreCase("S")) {
                    System.out.println("Tour personalizado");
                } else if (respuesta.equalsIgnoreCase("N")) {
                    System.out.println("Lista de animales del zoológico");
                } else {
                    System.out.println("Opción inválida");
                }
            } else {
                System.out.println("Opción inválida");
            }
            
            scanner.close();
        }

        @Override
        public String toString() {
            return "App []";
        }
    }
}
