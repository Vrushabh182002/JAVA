public class SearchInsertPosition {
    public static void main(String[] args) {
        int a[]={1,3,5,6};
        int target=7;
        System.out.println(search(a,target));
    }
    static int search(int a[],int target){
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a.length==0){
                return -1;
            }
            if(a[mid]==target){
                return mid;
            }
            if(target>a[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
}
