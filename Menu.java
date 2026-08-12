import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("Ingrese la dimensiÓn de la matriz:");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];
        while (continuar) {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1 - Llenar matriz de enteros");
            System.out.println("2 - Mostrar matriz de enteros");
            System.out.println("3 - Llenar matriz de objetos");
            System.out.println("4 - Mostrar matriz de objetos");
            System.out.println("5 - Salir");
            System.out.println("Elige una opción:");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    ME = m.LLenarMatrizEntera(ME);
                    break;
                case 2:
                    m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.LlenarMatrizObjetual(MO);
                    break;
                case 4:
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 5:
                    System.out.println("Hasta lueguito");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esa opción no existe, por favor validar...");
                    break;
                }
            }
        sc.close();
        }
    }