public class metodos {

    //Llena una matriz de enteros con valores aleatorios entre 1 y 50.
    public int[][] LLenarMatrizEntera(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    //Imprime en la consola una matriz de enteros (es de tipo void porque no retorna nada solo recibe la matriz y la imprime).
    public void MostrarMatrizEntera(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" - " + m[i][j]);
            }
            System.out.println();
        }
    }

    //Llena una matriz de objetos ObjMatriz con valores aleatorios entre 1 y 50.
    public ObjMatriz[][] LlenarMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjMatriz o = new ObjMatriz();
                o.setDato((int) (Math.random() * 50 + 1));
                m[i][j] = o;
            }
        }
        return m;
    }

    //Imprimeen la consola los números almacenados dentro de la matriz de objetos.
    public void MostrarMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" - " + m[i][j].getDato());
            }
            System.out.println();
        }
    }
}