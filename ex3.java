import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int v1[]=new int[10];
        int v2[]=new int[5];
        int v3[]=new int[10];
        int v4[]=new int[10];

        for(int i=0;i<v1.length;i++)
        {
            System.out.println("Informe o valor "+(i+1)+" do vetor 1:");
            v1[i]=teclado.nextInt();
        }

        for(int i=0;i<v2.length;i++)
        {
            System.out.println("Informe o valor "+(i+1)+" do vetor 2:");
            v2[i]=teclado.nextInt();
        }

        int iv3=0;
        int iv4=0;
        
        for(int i=0;i<v1.length;i++)
        {
            if(v1[i]%2==0)
            {
                for(int j=0;j<v2.length;j++)
                {
                    v1[i]+=v2[j];
                }
                v3[iv3]=v1[i];
                iv3++;
            }else
            {
                int div=0;
                
                for(int j=0;j<v2.length;j++)
                {
                    if(v1[i]%v2[j]==0)
                    {
                        div++;
                    }
                }

                v4[iv4]=div;
                iv4++;
            }
        }

        System.out.println("Soma de cada número par do v1 a todos os numeros do v2");
        for(int i=0;i<iv3;i++)
        {
            System.out.println(v3[i]);
        }

        System.out.println("\nQuantidade de divisores de cada numero impar do v1 com os numeros do v2");
        for(int i=0;i<iv4;i++)
        {
            System.out.println(v4[i]);
        }
        
    }
}
