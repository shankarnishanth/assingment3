public class largest {
    public static void main(String[] args) {
        int [] arr ={24, 3, 23 , 2 , 1};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element of array:"+max);
    }
}
