public class Main {
    public static void main(String[] args) {
       int a []= {1,5,9,3,45,23,45,12,87,9,6,5};
       int nuevo [] = new int [a.length];
       int cnt = 0;
        for(int i = a.length-1; i>= 0;i--){
         nuevo[cnt] = a[i];
         cnt++;
        }
        for(int f = 0; f < a.length;f++){
            System.out.println("Array original:"+ a[f]);
        }
        for(int g = 0;g < a.length;g++){
            System.out.println("Array invertida:" + nuevo[g]);
        }
        System.out.println("\nPrograma terminado");
    }
}
