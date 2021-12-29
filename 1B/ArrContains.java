import java.util.Arrays;
class ArrContains{
    private static void check(Integer[] arr, int toCheckValue){
        boolean test=Arrays.asList(arr).contains(toCheckValue);
        System.out.println("Is "+toCheckValue+" present in the array: "+test);
    }
    public static void main(String[] args){
        Integer arr[]={5,1,1,9,7,2,6,10};
        int toCheckValue=7;
        System.out.println("Array: "+Arrays.toString(arr));
        check(arr, toCheckValue);
    }
}