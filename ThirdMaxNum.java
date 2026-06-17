import java.util.*;
public class ThirdMaxNum {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int count=1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                count++;
            }
            if(count==3){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("There is no third maximum number.");
    }
}