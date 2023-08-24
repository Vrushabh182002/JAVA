import java.util.Arrays;

public class Selectiondes {
    public static void main(String[] args) {
        int a[]={5,3,1,4,2,0};
        selection(a);
        System.out.println(Arrays.toString(a));
    }
    static void selection(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int max =i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]>a[max]){
                    max=j;    
                }
            }
            int temp=a[max];
            a[max]=a[i];
            a[i]=temp;
        }
    }
}