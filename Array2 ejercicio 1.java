public class Main {
    public static void main(String[] args) {
//Dado el array de Strings [“coche”, “casa”, “avión”, “tren”] 
//obtener un array de 
//otras cuatro posiciones 
//con la longitud de cada String. 
String a [] = {"coche","casa","avión","tren"};
int b [] = new int [a.length];
  int r2 = 0;//La longitud de la palabra
  //procesamos
  for(int i = 0; i<a.length;i++){
    //guardo la longitud en r2
    r2= a[i].length();
    //guardo en el array nuevo la palabra;
    b[i] = r2;
    System.out.println(b[i]);



  }
  System.out.println("");
  System.out.println("Fin Ejercicio1\n");

    }
}

