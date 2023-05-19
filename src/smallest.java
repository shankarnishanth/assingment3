public class smallest {
    public static void main(String[] args) {
        int [] arr ={24, 3, 23 , 2 , 1};
        int min = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Largest element of array:"+min);
    }
}
