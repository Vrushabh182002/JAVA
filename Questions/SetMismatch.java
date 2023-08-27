public class SetMismatch {
    public static void main(String[] args) {
        int a[]={1,4,2,2};
        int res[]=Find(a);
        System.out.println(res[0]+" "+res[1]);
    }
    static int[] Find(int a[]){
        int i=0;
        while(i<a.length){
            int pos =a[i]-1;
            if(a[i]!=a[pos]){
                int temp =a[i];
                a[i]=a[pos];
                a[pos]=temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < a.length; index++) {
            if(a[index]!=index+1){
                return new int[]{a[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
