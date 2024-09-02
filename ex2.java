import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int v1[]=new int[10];
        int v2[]=new int[10];
        int v3[]=new int[20];

        for(int i=0;i<10;i++)
        {
            System.out.println("Informe o valor "+(i+1)+" do vetor 1:");
            v1[i]=teclado.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            System.out.println("Informe o valor "+(i+1)+" do vetor 2:");
            v2[i]=teclado.nextInt();
        }

        int iv3=0;
        
        for(int i=0;i<10;i++)
        {
            int dif=0;
            int dif2=0;
            
            for(int j=0;j<10;j++)
            {
                if(v1[i]!=v2[j])
                {
                    v3[iv3]=v1[i];
                    dif++;
                }
            }

            for(int j=0;j<10;j++)
            {
                if(v2[i]!=v1[j])
                {
                    dif2++;
                }
            }

            if(dif==10)
            {
                v3[iv3]=v1[i];
                iv3++;
            }

            if(dif2==10)
            {
                v3[iv3]=v2[i];
                iv3++;
            }
        }

        System.out.println("Vetor com valores não comuns aos vetores:");
        for(int i=0;i<iv3;i++)
        {
            System.out.println(v3[i]);
        }
    }
}
