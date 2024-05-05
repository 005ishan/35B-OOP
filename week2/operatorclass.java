package week2;

public class operatorclass {
    public static void main(String[] args) {
        /* 
        /*Arithmetic Operators*/
        int Num1=18, Num2=20;
        int sum = Num1 + Num2;
        System.out.println("Addition is"+ sum);
        System.out.println("Subtraction is"+(Num1-Num2));
        System.out.println("Multiplication is"+(Num1*Num2));
        System.out.println("Division is"+(Num1/Num2));
        System.out.println("Modulo is"+(Num1%Num2));
        /*Assgnment Operators*/
        int num1=20;
        num1+=1;
        System.out.println("+= value is"+num1);
        System.out.println("-= value is"+(num1-=10));
        System.out.println("*= value is"+(num1*=10));
        System.out.println("/= value is"+(num1/=2));
        System.out.println("%= value is"+(num1%=3));
        /*Re;ational Operators*/
        int aNum1=20, aNum2=21;
        boolean Expression= aNum1==aNum2;
        System.out.println("Equal is"+Expression);
        System.out.println("Greater than"+(aNum1>aNum2));
        System.out.println("Less than"+(aNum1<aNum2));
        System.out.println("not equal to"+(aNum1!=aNum2));
        System.out.println("Greater than equals to"+(aNum1>=aNum2));
        /*Logical Operators*/
        int lNum1=20, lNum2=20;
        boolean lExpression1= lNum1==lNum2;
        boolean lExpression2= lNum1>lNum2;
        System.out.println("&& is used for AND"+(lExpression1 && lExpression2));
        System.out.println("|| is used for OR"+(lExpression1 || lExpression2));
        System.out.println("! is used for not"+(!lExpression1));
        /*Unary Operations*/
        int uNum1=10;
        uNum1++;
        ++uNum1;
        System.out.println("--uNum1 unary is"+ --uNum1);
        System.out.println("uNum1-- unary is"+ uNum1--);
        /*Ternary Operation*/
        int tNum1=20, tNum2=10;
        String output;
        output= tNum1>tNum2 ? "True Statement": "False Statement";
        int intOutput= tNum2 == tNum1 ? -10 :10;
        System.out.println(output);
        System.out.println(intOutput); 
        
    }
}
