import java.util.Scanner;
    public class ventiuno{
    public static  int tiradado (){
    return (int) (Math.random()*6) + 1;
    public static void main ( String args []){
    Scanner sc = new Scanner(System.in);
    int puntuacion1 = 0;
    int puntuacion2 = 0;
    int dado1 = tiradado();
    int dado2 = tiradado();
    int puntos = dado1 + dado2;
    char respuesta ;
    //Turno del jugador1
    System.out.println("Turno del jugador1");
    System.out.println("Puntuacion del jugador1" + puntuacion1);
    do {
     dado1 = tiradado();
     dado2 = tiradado();
    System.out.println("Primer dado : " + dado1 );
    System.out.println("Segundo dado : " + dado2 );
    puntuacion1 = dado1 + dado2;
    System.out.println("Puntuación del jugador 1" + puntuacion1);
    if(puntuacion1 < 21){
    System.out.println("¿Quieres seguir jugando? (S\N)");
    respuesta = sc.next().charAt(0);
    }else{
    respuesta = 'N';
    }
    } while ((respuesta == 'S'|| respuesta == 's') && puntuacion1 < 21);
    //Código para lanzar los dados
    if(puntuacion1 > 21){
     System.out.println("El jugador 1 se ha pasado de 21.");
     System.out.println("Gana el jugador2");
    } else{
    //Turno del jugador2
    System.out.println("Turno del jugador2");
   
     System.out.println("Primer dado" + dado1);
     System.out.println("Segundo dado" + dado2);
     puntuacion2 = dado1 + dado2 + puntuacion2;
     System.out.println("Puntuacion del jugador2 :" + puntuacion2);
     if (puntuacion2 < 21){
     System.out.println("¿Quieres seguir juagando? (S\N)");
     respuesta = sc.next().charAt(0);
     }else{
     respuesta = 'N';
     }
    }
        } While(( respuesta == 'S' || respuesta ='s')&& puntuacion2 < 21);
    //Código para lanzar los dados
    if (puntuacion2 > 21){
    System.out.println("EL jugador 2 se ha pasado de 21");
    System.out.println("Gana el jugador 1");
    } 
    //Turno del jugador2
    System.out.println("Gana el jugador1");
    else if(puntuacion1 > puntuacion2){
    System.out.println("Ganar el jugador1 ");
    }else if(puntuacion2 > puntuacion1){
    System.out.println("Gana el jugador2 ");
    } else {
    System.out.println("Empate");
    }
    sc.close();
    System.out.println("Programa terminado");   
    }   
    }