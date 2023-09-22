public class BinaryRecrusion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int target=10;
        System.out.println(search(a,target,0,a.length-1));
    }
    static int search(int a[],int target,int s,int e){
        if(s>e || a.length==0){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==target){
            return m;
        }
        if(target>a[m]){
            return search(a, target, m+1, e);
        }
        else{
            return search(a, target, s, m-1);
        }
    }
}
