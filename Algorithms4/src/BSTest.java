public class BSTest {
    public static void main(String[] args) {
        System.out.println("Hw");
        int[] a=new int[]{0, 1, 2, 3, 4};
        //System.out.println(search(a,1));

        ExtendeBinarySearch BS=new ExtendeBinarySearch();
        int arr[] = new int[] {1,
                2, 2, 5, 5, 5,
                5, 5, 5, 5, 5,
                5, 5, 6, 6, 7};
        System.out.println("First Equal           :"+BS.searchFirstEqual(arr, 5));
        System.out.println("Last Equal            :"+BS.searchLastEqual(arr, 5));
        System.out.println("First Equal or Larger :"+BS.searchFirstEqualorLarger(arr,  5));
        System.out.println("First Larger          :"+BS.searchFirstLarger(arr,  5));
        System.out.println("Last Equal or Smaller :"+BS.searchLastEqualorSmaller(arr,  5));
        System.out.println("Last Smaller          :"+BS.searchLastSmaller(arr,  5));



    }
}
