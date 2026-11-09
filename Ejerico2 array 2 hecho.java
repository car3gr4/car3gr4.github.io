public class Main {
  public static void main(String args[]) {
    //Declarar los dos array
    int a[] = {3,2,4,4,5,6,7,9};
    int b[] = new int [a.length/2];
    int c[] = new int [a.length/2];
    //uno con los primeros 4 elementos y otro con los segundos 4 elementos.
        for(int i = 0; i< a.length/2;i++){
            b[i] = a[i];
        }
        int cnt = 0;
            for(int i = a.length/2; i < a.length;i++){
                c[cnt] = a[i];
                cnt++;
            } for(x =0; x < b.length;x++){
                System.out.println(b);
                System.out.println(c);
            }
            System.out.println("Programa terminado\n");
    }
}