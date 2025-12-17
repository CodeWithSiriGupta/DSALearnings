package LinearSearch;

public class _2SearchInStrings {

    public static void main(String[] args) {
        String str = "coding";
        char target = 'l';
        boolean ans = search(str,target);
        boolean ans2 = search2(str , target);
        System.out.println(ans2);
    }

    //searching using for Each loop
    static boolean search2(String str ,char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for( char i : str.toCharArray())
        {
            if(i==target)
            {
                return true;
            }
        }
        return false;

    }

    static boolean search(String str ,char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for ( int i=0 ; i<str.length();i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;

    }
}
