import java.util.*;
public class fibanoci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n;i++){
        System.out.print(a+" ");
            c=a+b;
          
            a=b;
            b=c;
        }
    }
}