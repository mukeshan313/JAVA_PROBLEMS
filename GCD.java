import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];    
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int gcd=0;
        for(int i=1;i<=min;i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+max+" and "+min+" is: "+gcd);
        sc.close();
    }
}

      

 