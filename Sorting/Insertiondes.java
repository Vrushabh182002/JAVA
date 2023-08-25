import java.util.Arrays;
public class Insertiondes {
    public static void main(String[] args) {
        int a[]={10,2,4,-1,0,3};
        insertion(a);
        System.out.println(Arrays.toString(a));
    }
    static void insertion(int a[]){
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j >0 ; j--){
                if(a[j]>a[j-1]){
                    int temp =a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
