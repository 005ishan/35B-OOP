package week4;

public class jumpStatement{

    public static void main(String[] args) {
        
        for(int i=0;i<3;i++){
            if(i==2){
                continue;
            }
            System.out.println("Index = "+i);

        }

        int counter=0;
        while(counter<3){
        if(counter==9){
            break;
        }
            System.out.println("While counter "+counter);
            counter++;
    }
}
}
