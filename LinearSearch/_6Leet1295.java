package LinearSearch;

public class _6Leet1295 {
    public static void main(String[] args) {
        int [] num = { 34 , 24 , 567, 9012 , 34578867};
        System.out.println(demo(num));
    }

    static int demo( int[] num){
        //count2 checks the count1 is even or not and includes only even cases into its count
        int count2=0;
        for (int j : num) {
            int number = j;
            //count1 will have the count of digits in a number
            int count1 = 0;
            //count the number of digits  in this specific number
            if (number < 0)
                number = number * -1;

            if (number == 0)
                count1 = 1;

            while (number > 0) {
                count1++;
                number = number / 10;
            }
            if (count1 % 2 == 0)
                count2++;

        }
        return count2;
    }
}
