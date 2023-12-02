public class Laberinto {

    private String[][] laberinto;

    public Laberinto() {
        this.laberinto = new String[20][20];
    }

    public void crearLaberinto() {

        for (int i = 0; i < this.laberinto.length; i++) {
            for (int j = 0; j < this.laberinto[i].length; j++) {
                this.laberinto[i][j] = " "; // CAMINO
            }
        }

        for (int x = 0; x < 20; x++) {
            laberinto[0][x] = "X";
            laberinto[x][0] = "X";
            laberinto[19][x] = "X";
            laberinto[x][19] = "X";
        }

        this.laberinto[0][1] = " "; // ENTRADA
        this.laberinto[19][18] = " "; // SALIDA

        this.pares();
    }

    public void mostrarLaberinto() {

        for (int i = 0; i < this.laberinto.length; i++) {
            System.out.println();
            for (int j = 0; j < this.laberinto[i].length; j++) {
                System.out.print(this.laberinto[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void pares() {
        for (int i = 2; i < 18; i++) {
            for (int j = 0; j < 18; j++) {
                if (i % 2 == 0) {
                    if (i == 2) {
                        if(j != 18){
                            laberinto[i][j] = "X";
                        }else{
                            laberinto[i][j] = " ";
                        }
                    } else {
                        if (j == 1) {
                            laberinto[i][j] = " ";
                        } else {
                            laberinto[i][j] = "X";
                        }
                    }

                } else {

                }
            }
        }
    }

    public void impares() {
        for (int i = 19; i > 1; i--) {
            for (int j = 19; j > 19; j--) {
                if (i % 2 != 0) {
                    laberinto[i][j] = "X";
                } else {

                }
            }
        }
    }
}
