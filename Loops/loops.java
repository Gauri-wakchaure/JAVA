public class Loops {

public static void main(String[] args) {
// Loops: We can use loops when we have to do some tasks repeatedly
        // For Loop
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        for(int j=20; j>=0; j--){
            System.out.println(j);
        }

        //While loop
        int s = 1;
        while(s<=25) {
            System.out.println(s);
            s++;
        }

        //Do while
        int k = 20;
        do{
            System.out.println(k);
            k++;
        }while(k<=20);
    }
}