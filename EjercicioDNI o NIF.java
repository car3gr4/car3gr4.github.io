import java.util.Scanner;    
    public class Main{
    public static void main (String args []){
    Scanner teclado = new Scanner(System.in);
    String fila ;
    String numeroinicial;
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    int numero;
    int resto;
    char letra;
    boolean correcto;
    System.out.println("Bienvenido al cálculo de letra para NIF/NIE");
    System.out.println("Introduce el NIF o NIE :");
    fila = teclado.nextLine().toUpperCase();
    if (fila.length() == 8){
        if (fila.charAt(0) >= '0' && fila.charAt(9) <= '9'){
            correcto = true;
        //Comporbar que todos los caracteres de NIF sean cifras
        for(int i=0; i < fila.length(); i++){
            if(fila.charAt(i) < '0' | fila.charAt(i) > '9'){
            correcto = false;
            }
        }  
        if(correcto){
            numero = Integer.parseInt(fila);
            resto = numero % 23;
            letra = letras.charAt(resto);
            System.out.println("El documento teclado es NIF y su letra de control es :"+ letra);
        } else {
           System.out.println("ERROR:El documento tecleado no es válido");
           }
    } if (fila.charAt(0)=='X'|| fila.charAt(0) =='Y'|| fila.charAt(0) == 'Z'){
            //Obtiene los siete numeros del NIE 
            numeroinicial = fila.substring(1);
            if(fila.charAt(0) == 'X'){
            numeroinicial = "0" + numeroinicial;
            }else if (fila.charAt(0)== 'Y'){
              numeroinicial="1" + numeroinicial ;
            }else{
             numeroinicial= "2" + numeroinicial ;
            } numero = Integer.parseInt(numeroinicial);
              resto = numero % 23;
              letra = numeroinicial.charAt(resto);
              System.out.println("El documento tecleado es NIE y su letra de control es :"+ letra);
            } else{
            System.out.println("ERROR:El documento tecleado no es válido");
            }
        }
    teclado.close();
  }
}