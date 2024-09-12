

class search{
    int arr[];
    int target;
    int n = arr.length;
    public static void linearsearch(int arr[],int target){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            System.out.println(i);
            return;
        }
        
    }
    }

    public  void mergesort(int arr[],int target,int n){
        int l= 0;
        int r = n-1;
       int mid = (1+(l+r))/2;
       while(l<r){
       if(arr[mid]==target){
        System.out.println(mid);
       }
       else if (arr[mid]<target) {
           l = mid+1;
       }
       else{
        r = mid - 1;
       }
       }
       System.out.println("Element not found");
    }
}
@SuppressWarnings("unused")
public class Searching{
    public static void main(String[] args) {
       //search sc = new search();
       int arr[]={13,343,3242};
      int  target = 13;
      int n =arr.length;
        search.linearsearch(arr, target);     //static=> don't make the object for the class if use static keyword

    //   sc.mergesort(arr,target,n);
    }
}


