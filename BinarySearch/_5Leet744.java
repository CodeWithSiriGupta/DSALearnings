package BinarySearch;

public class _5Leet744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'k';
        System.out.println(ceilingForChar(letters,target));

    }

    private static char ceilingForChar(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target < letters[mid])
            {
                end=mid-1;

            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
