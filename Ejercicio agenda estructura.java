//Programa por Carlos Andrés de 1DAM
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String agenda[] = {"Ana","Andrés","Antonio","Antonio ies","Anastasia","Anacleto", "Ángel", "Anselmo", "David", "Daniel","Darío", "Damián", "Dámaso", "Delia", "Duarte", "Javier", "Jesús", "José Antonio", "José ies","José L.", "José María", "José vecino", "Juan","Juanjo", "María", "Mario", "Marta", "Mar", "Marcos", "Marcos vecino","Marina", "Manfred", "Max", "Mara", "Marga", "Martín", "Víctor", "Víctor ies", "Virginia", "Virtudes", "Visi", "Victoria", "Vidal"};
        int palabraselec = 0;
        int cont = 0;
        int version = 0;
            //Primero seleccionamos las palabras que coinciden sus primeras letras.
                 //Hacemos la primera version
                 Scanner sc = new Scanner(System.in);
                 boolean salirPrograma = false;
                    while(!salidaPrograma){
                        System.out.println("----Buscador de contactos---------------");
                        System.out.println("Versión de búsqueda a utilizar (1-4): ");
                        String coincidence = sc.nextInt();
                        System.out.println("Teclee el contacto a buscar :");
                        String palabraselec = sc.nextInt();
                        //Comprobamos que quiere salir si pone de diferentes maneras salir.
                        switch(coincidence){
                            case Salir:
                                System.out.println("Cerramos el programa");
                                break;
                            default:
                                salidaPrograma = true;
                        }
                        if(salidaPrograma){
                            return true;
                        }
                        //Pedimos el nombre o las letras que queremos buscar
                            System.out.println("Introduce la autoridad a buscar : ");
                            String esc = sc.nextInt();
                        //También permitimos salir desde la introducción del patrón
                            switch(esc){
                                case 4:
                                    System.out.println("") = Salir;
                                    break;
                                default:
                                    salidaPorgrama = true;
                                //Por defecto se selecciona la busqueda numero1
                                    int version1 = 1;
                                    //Comprobamos que la opción introducida sea un número del 1 al 4
                                        if(opcion.length == 1 && opcion.charAt(0) >='1' && opcion.charAt(0)<='4'){
                                            //Convertimos el caracter en un numero entero
                                                } else{
                                                    //Si la opción no es válida , utilizamos la busqueda 1
                                                    System.out.println("Opción no válida.Se aplicará la búsqueda 1.");
                                                    
                                                }
                                                //Contador de contactos encontrados
                                                int encontrado = 0;
                                                boolean ra = false;
                                                //Recorremos todos los contactos del array
                                                for(int i = 0; i<agenda.length;i++){
                                                    switch(version1){
                                                        case 1:
                                                            //Busca los contactos que empiecen exactamente por el patron
                                                                ra = true;
                                                                encontrado = agenda[i].startswith(esc);
                                                        case 2:
                                                            //Convierte a ambos texto en minúsculas y busca coincidencias  al principio del contacto 
                                                            ra =true;
                                                            encontrado = agenda [i].toLowerCase().startswith(esc.toLowerCase());
                                                        case 3:
                                                            //Se comprueba que el patron no se mas largo que el contacto.
                                                            if(esc.length <= agenda.length){
                                                                //Recorremos todas las posiciones dle contacto
                                                                for(int j=0; j <= esc.length;j++){
                                                                    //Suponemos que incialmente las letras coinciden
                                                                    boolean acierto = true;
                                                                    //Comparamos cada letra del patron.
                                                                    for(int k = 0; k< esc.length;k++){
                                                                        //Comparamos las letras conviertiendolas a minusculas.
                                                                        if(agenda[i].charAt(0) != esc.charAt(k)){
                                                                            //Si alguna letra es diferente no coincide.
                                                                                acierto = false;
                                                                        }
                                                                        
                                                                    }
                                                                }
                                                                    //Si todas la letras coinciden,encontramos el contacto
                                                                    if(acierto){
                                                                        ra=true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //Si hemos encontrado el contacto, mostramos su numero y su nombre.
                                                            int seleccionado= 0;
                                                            if(seleccionado){
                                                                encontrado++;
                                                                System.out.println(encontrado + "."+ agenda[i]);
                                                                
                                                            }
                                                            //Preguntamos si quiere continuar o no el programa
                                                             System.out.println("\nPulsa Enter para continuar o escribe salir para terminar");
                                                                salida = sc.nextInt();
                                                             //Comprobamos si se ha escrito algunas de las formas  de salir.
                                                              switch(Salida){
                                                                  case 1 :
                                                                      salida = Salir;
                                                                      break;
                                                                    case 2:
                                                                        salida = SALIR;
                                                                        break;
                                                                    case 3:
                                                                        salida = salir;
                                                                        break;
                                                                    default:
                                                                        salidaPrograma = true;
                                                                        
                                                              }
                                                                        
                                                                    }
                                                                    System.out.println("Programa terminado.");
                                                                        }
                                                                    }
                                                                }
                                                                //Cerramos el scanner.
                                                                 sc.close();
                                                            }
                                        }
                
                 