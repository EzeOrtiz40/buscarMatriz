
package buscarmatriz;

/**
  @author Exxe
 */
public class BuscarMatriz {

    public static void main(String[] args) {
        int [][] matriz1 = new int [10][10];
        int [][] matriz2 = new int [3][3];
        
        llenarMatriz(matriz1);
        llenarMatriz(matriz2);
    }
    
public static void llenarMatriz(int[][]matriz){
      int i, j;
      
      for(i = 0; i<matriz.length; i++){
          for(j = 0; j<matriz.length; j++){
             matriz[i][j] = (int) (Math.random()*2);
              System.out.print(matriz[i][j]);
          }System.out.println("");
      }System.out.println("");
  } 
public static void buscarMatriz(int[][]matrizUno,int[][]matrizDos){
     boolean aux;
    }
    
}
