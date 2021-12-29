public class ArrayReversed{
    static void reverse(int a[], int n){
        int[] b=new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        System.out.println("\nReversed array is: ");
        for(int k=0;k<n;k++){
            System.out.print(b[k]+", ");
        }
        System.out.println();
    }
    static void display(int a[], int n){
        System.out.println("Original array is: ");
        for(int k=0;k<n;k++){
            System.out.print(a[k]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        display(arr,arr.length);
        reverse(arr,arr.length);
    }
}