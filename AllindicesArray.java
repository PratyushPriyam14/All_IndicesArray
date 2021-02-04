import java.io.*;
import java.util.*;
public class AllindicesArray {
    public static void main(String []args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int x=Integer.parseInt(br.readLine());
        int []iarr=allindicesarr(arr,x,0,0);
        if(iarr.length==0){
            System.out.println();
            return;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(iarr[i]);
        }
    }
    public static int[] allindicesarr(int []arr,int x,int index,int fsf){
        if(index==arr.length){
            return new int[fsf];
        }
        if(arr[index]==x){
            int []iarr=allindicesarr(arr,x,index+1,fsf+1);
            iarr[fsf]=index;
            return iarr;
        }
        else{
            int []iarr=allindicesarr(arr,x,index+1,fsf);
            return iarr;
        }
    }
}
