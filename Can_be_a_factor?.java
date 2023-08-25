import java.util.*;
public class Pardhu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        c=sc.nextInt();
        for(int i=0;i<c;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if((b-a)<a && a!=b)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}