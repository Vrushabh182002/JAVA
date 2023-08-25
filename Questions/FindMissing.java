import java.util.ArrayList;
import java.util.List;

public class FindMissing {
    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        System.out.println(sort(a));
    }
    static List<Integer> sort(int a[]){
        int i=0;
        while(i<a.length){
            int pos=a[i]-1;
            if(a[i]!=a[pos]){
                int t=a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
            else{
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
