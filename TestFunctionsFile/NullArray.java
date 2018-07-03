public class NullArray {
    public static void main(String[] args) {
        int[] arr = new int[1];
        if (arr[0] == 0) {
            System.out.println("int cannot be interpreted as null because i'm not a smart man.");
        }
        System.out.println(arr[0]);
    }
}
