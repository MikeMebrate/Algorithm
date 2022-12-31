package SearchingAlgorithm;

public class BinarySearch {
    public static int binarySearch(int[] list, int item){
        int high = list.length-1;
        int low = 0;
        int mid;

        while(low<=high){
            mid = high+low/2;
            if(list[mid]==item) return mid;
            else if(list[mid]>item) high=mid-1;
            else if(list[mid]<item) low=mid+1;
         }
     return -1;
    }

    public static int binaryRecursive(int[] list, int item, int high, int low){
       if(low <= high){
           int mid= (high+low)/2;
           if(list[mid] == item) return mid;
           else if(list[mid] > item) return binaryRecursive(list,item,mid-1,low);
           else return binaryRecursive(list,item,high,mid+1);
       }
       return -1;
    }
    public static void main(String[] args) {
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},14));
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},4));
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},17));

      System.out.println("Recursive");
        System.out.println(binaryRecursive(new int[] {1,4,5,6,7,9,11,14,15},7, 8,0));
    }
}
