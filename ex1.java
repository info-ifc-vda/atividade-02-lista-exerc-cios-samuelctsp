
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        int length=5;
        int val[]=new int[5];
        Scanner teclado=new Scanner(System.in);


        while(2>1)
        {
            int i, num=0;
            
            for(i=0;i<val.length;i++)
            {
                System.out.println("Informe o valor "+(i+1)+":");
                num=teclado.nextInt();
                if(num!=0)
                {
                    val[i]=num;
                }else
                {
                    break;
                }
            }
            
            length=i;
            System.out.println("\n");
            System.out.println("Valor\tCubo\tRaizQuad");

            for(i=0;i<length;i++)
            {
                System.out.println(val[i]+"\t"+Math.pow(val[i],2)+"\t"+Math.sqrt(val[i]));
            }

            System.out.println("\n");

            if(num==0)
            {
                break;
            }
        }
    }
}