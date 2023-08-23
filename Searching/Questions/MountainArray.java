public class MountainArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,3,2,1};
        System.out.println(search(a));
    }
    static int search(int a[]){
        int s=0,e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]>a[m+1]){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}
