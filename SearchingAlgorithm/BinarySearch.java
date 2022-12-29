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
    public static void main(String[] args) {
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},14));
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},4));
            System.out.println(binarySearch(new int[] {1,4,5,6,7,9,11,14,15},17));

    }
}
