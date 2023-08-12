public class Ceilingofanumber {
    public static void main(String[] args) {
        int a[]={2,3,5,8,9,10,14,19,20,29};
        int target=16;
        System.out.println(ceiling(a,target));
    }
    // returning the index of the number
    static int ceiling(int a[],int target){
        int s=0,e=a.length-1;
        if(target>a[a.length-1]){
            return -1;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if(a.length==0){
                return -1;
            }
            if(target==a[m]){
                return m;
            }
            else if(target>a[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return s;
    }
}
