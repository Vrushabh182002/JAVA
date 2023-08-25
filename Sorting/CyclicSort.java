import java.util.Arrays;
public class CyclicSort{
    public static void main(String[] args) {
        int a[]={3,5,4,1,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int a[]){
        int i=0;
        while(i<a.length){
            int pos=a[i]-1;
            if(a[i]!=a[pos]){
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
            }
            else{
                i++;
            }
        }
    }
}