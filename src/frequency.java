public class frequency {
    public static void main(String[] args) {
        int [] numbers = new int [] {1,2,3,1,2,2,2,3,4,3};
        int [] frequency = new int [numbers.length];
        int counted = -1;
        for(int i = 0; i < numbers.length; i++){
            int count = 1;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;
        }
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted)
                System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
        }
    }}