public class MyClass {
  public static void main(String args[]) {
    // Dado el array de Strings [“coche”, “casa”, “avión”, “tren”] 
    // obtener un array de otras cuatro posiciones con la longitud de cada String.
        String frase [] = {"coche","casa","avión","tren"};
        String aux = "";
        //obtener un array de las otras cuatro posiciones
        int nuevo [] = new int [frase.length];
        
        for (int i = 0; i< frase.length; i++){
           nuevo[i]= frase[i].length();
            
        }
    
  }
}