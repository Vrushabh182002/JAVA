public class FirstMissingPositive {
    public static void main(String[] args) {
        int a[]={0,1,5,3};
        System.out.println(Find(a));
    }
    static int Find(int a[]){
        int i=0;
        while(i<a.length){
            int pos=a[i]-1;
            if(a[i]>0 && a[i]<=a.length && a[i]!=a[pos]){
                int t =a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j+1){
                return j+1;
            }
        }
        return a.length+1;
    }
}
