package week2;

public class VariableClass {

    int a=235;

    static int staticVariable= 22334;

    public static void main(String[] args) {
        // byte byteValue;
        // byteValue=10;
        // short shortValue=100;
        // int intValue1, intValue2;
        // intValue1=-99; intValue2=99;
//         long longValue1=-999,longValue2=999;
//         float floatValue=1.90f;
//         double doubleValue=28.88d;
//         char charValue='C';
//         boolean booleanValue=false;

// //non primitive data type
//         String stringInfo1="Variable";
//         String stringInfo2=new String("Variable2");
//         VariableClass variableObj=new VariableClass();


        System.out.println(staticVariable);
        // System.out.println(a);

        VariableClass newClass = new VariableClass();
        System.out.println(newClass.a);
    }
}
