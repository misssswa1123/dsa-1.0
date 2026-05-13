/*📅 DAY 1 – Basics (no pressure)
🔹 Q1: Find Maximum in Array-done
🔹 Q2: Count Frequency of Elements-done
🔹 Q3: Check Palindrome (String)  DAY 2 – Slightly better logic
🔹 Q1: Reverse an Array
🔹 Q2: Second Largest Element
🔹 Q3: Linear Search   📅 DAY 3 – Pattern exposure (light)
🔹 Q1: Move all zeros to end
🔹 Q2: Remove duplicates from array
🔹 Q3: Check if array is sorted------so what approac shouldi follow to solve this? like as a beginner*/
public class arraybasics1{
    public static int maxfind(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void findfreqloop(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==-1)
                continue;
            int cnt=1;
            for(int j=i+1;j<a.length;j++)
            {
               if(a[i]==a[j])
               {
                cnt++;
                a[j]=-1;
               }
            }
            System.out.println(a[i]+"="+cnt);
       
        }
    }
    public static void palistr(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev+=str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
        {
            System.out.println("palidrome");
        }
        else{
            System.out.println("Not plaindrome");
        }
    }
    public static void revarr(int ar[])
    {
       
            for(int j=ar.length-1;j>=0;j--)
            {
        
            System.out.println(ar[j]);
        }
    }
public static void findseclarge(int[] a)
{
    int large=a[0];
    int secl=0;
    for(int i=0;i<a.length;i++)
    {
        if(large<a[i])
        {
            secl=large;
            large=a[i];
        }
        else if(secl<a[i] && a[i]!=large)
        {
            secl=a[i];
        }
    }
    System.out.println("Second large="+secl);

}
public static void main(String args[])
    {
        int a[]={25,60,52,78,97,21};
        findseclarge(a);
        int a1[]={1,1,3,3,1,4};
        String s="aba";
        System.out.println("Max="+maxfind(a));
        findfreqloop(a1);
        palistr(s);
        revarr(a);
        int[] d={12,34,23,43,56};
        int[] d1={25,60,52,78,97,21};
        findseclarge(d1);
        findseclarge(d);
    }
}