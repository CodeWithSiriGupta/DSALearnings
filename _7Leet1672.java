package LinearSearch;

public class _7Leet1672 {

    public static void main(String[] args) {
      int[][]  accounts ={{1,2,3},{4,5,6},{45,23,10}};
      System.out.println(maximumWealth(accounts));
    }
        public static int maximumWealth(int[][] accounts) {
            int sum =0;
            for(int row =0 ; row < accounts.length ; row++)
            {
                int customerWealth =0;
                for(int col =0 ; col < accounts[row].length ; col++)
                {
                    customerWealth += accounts[row][col];
                }
                if(customerWealth >sum)
                {
                    sum=customerWealth;
                }
            }
            return sum;
        }
    }

