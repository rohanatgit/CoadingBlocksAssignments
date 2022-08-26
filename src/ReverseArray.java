public class ReverseArray {
    public static void main(String[] args) {
          
    }

    public static void ReverseArrayy(int[] arr) {
        int i = 0;
        int n = arr.length - 1;
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
    }
}