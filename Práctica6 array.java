public class Main {
    public static void main(String[] args) {
      int array1 [] = {2,3,4,7,8,10,11};
        int par [] = new int [array1.length] ;
        int impar [] = new int [array1.length] ;
        int  indexpar = 0;
        int indeximpar = 0;
        for(int i = 0 ; i < array1.length; i++){
          if(array1[i]% 2== 0){
            par[indexpar] = array1[i];
            indexpar = indexpar + 1;
          } else if(array1[i]%2 != 0) {
            impar[indeximpar] = array1[i];
            indeximpar = indeximpar + 1;
          }
        }
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
        System.out.prinltn("\nPrograma terminado.");
      }

    }
