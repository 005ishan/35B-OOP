package week3;
import java.util.*;

public class ifelseclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of science:");
        int science=sc.nextInt();
        System.out.println("Enter marks of english:");
        int english=sc.nextInt();
        System.out.println("Enter marks of math:");
        int math=sc.nextInt();
        double av=(science+math+english)/3;
        if (science<35 && math<35 && english<35);
        System.out.println("Fail");
        
        }
    }
}
