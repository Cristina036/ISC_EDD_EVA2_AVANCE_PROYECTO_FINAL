package eva2_proyecto_final_team_donut;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class EVA2_PROYECTO_FINAL_TEAM_DONUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Lista miLista = new Lista(); //LISTA VACÍA

        System.out.println("Nombre del alumno(a) a evaluar: ");
        String NombreA = teclado.next();
        validarString(NombreA); //Validamos que el usuario no introduzca numeros
        System.out.println("¿Cuantas unidades tiene la materia que imparte?");
        int NUni = teclado.nextInt();

        int i;

        int[] Califas = new int[NUni]; //Array con las calificaciones 
        for (i = 0; i < Califas.length; i++) { //Agregamos nodos a la lista 
            System.out.println("Introduzca la calificación del alumno(a) " + NombreA + " de la unidad " + (i + 1) + " : ");
            miLista.add(teclado.nextDouble());
        }
        miLista.printList();

        System.out.println("\n¿Desea editar alguna calificación?\nSi=0\nNo=1");
        int iEdit = teclado.nextInt();
        validarOpciones(iEdit); //Validamos que solo se ingrese 0 o 1
        if (iEdit == 0) {
            System.out.println("¿Que desea hacer?\nEditar cierta calificación=0\nEliminar todas las calificaciones=1");
            iEdit = teclado.nextInt();
            validarOpciones(iEdit);
            if (iEdit == 0) {
                System.out.println("Posición de la calificación que desea modificar (El primer elemento es la posicón 0)");
                int iPos = teclado.nextInt();
                miLista.deleteAt(iPos);
                System.out.println("Calificación eliminada");
                miLista.printList();
                System.out.println("\nIngrese la nueva calificación");
                Double NCalif = teclado.nextDouble();
                miLista.insertAt(iPos, NCalif);
                System.out.println("Calificación agregada");
                miLista.printList();
            } else {
                miLista.clear();
                System.out.println("[]");
                System.exit(0);
            }
        }
        //PROMEDIO

        Double Prom = (double) ((miLista.Suma()) / (miLista.length()));
        System.out.println("\nPromedio final: " + Prom);
    }

    public static boolean validarString(String NombreA) {
        for (int i = 0; i < NombreA.length(); i++) {
            char c = NombreA.charAt(i);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                System.out.println("Dato invalido, solo ingresar texto");
                System.exit(0);
            }
        }
        return true;
    }

    public static void validarOpciones(int iEdit) {
        if (iEdit < 0 | iEdit > 1) {
            System.out.println("Opción invalida");
            System.exit(0);
        }
    }
}
