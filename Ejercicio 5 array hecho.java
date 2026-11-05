import java.util.*;

public class Main {
    public static void main(String[] args) {
      int array1 [] = {2,3,4,7,8,10,11};
        for(int i = 0; i < array1.length; i++){
          if( array1[i] > 6){
              System.out.println("Los elemento son mayores a 6:"+ array1[i]);

          } else {
            System.out.println("Los elementos son menores a 6 :" + array1[i]);
          }
        }
        System.out.println("\nPrograma terminado");
      }

    }
