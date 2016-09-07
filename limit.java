public class Prime
{
    public static void main(String args[])
    {
         int s1, s2,flag = 0;
         Scanner sc = new Scanner(System.in);
         System.out.println (lower limit :"); 
         s1 = sc.nextInt();
         System.out.println ("upper limit :"); 
         s2 = sc.nextInt();
         System.out.println ("numbers inbetween the entered limits:");
         for(int i = s1; i <= s2; i++)
         {
             for( int j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
