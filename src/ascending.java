public class ascending {
    public static void main(String[] args) {
        int [] arr = new int [] {6, 8, 5, 3, 7};
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    d = arr[i];
                    arr[i] = arr[j];
                    arr[j] = d;
                }}}
        System.out.println("Elements  in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }}}

