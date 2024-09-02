import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int m[][]=new int[7][7];
        int v1[]=new int[7];
        int v2[]=new int[7];

        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.println("Informe o valor "+(i+1)+"x"+(j+1)+" da matriz:");
                m[i][j]=teclado.nextInt();
            }
        }

        System.out.println("Matriz gerada:\n");

        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.printf(m[i][j]+"\t");
            }
            System.out.printf("\n");
        }

        int maior=0;
        
        
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(j==0 || m[i][j]>maior)
                {
                maior=m[i][j];
                }
            }

            v1[i]=maior;
        }

        int menor=0;

        for(int j=0;j<7;j++)
        {
            for(int i=0;i<7;i++)
            {
                if(i==0 || m[i][j]<menor)
                {
                menor=m[i][j];
                }
            }

            v2[j]=menor;
        }

        System.out.println("\nVetor com os maiores elementos da cada linha:\n");
        for(int i=0;i<7;i++)
        {
            System.out.println(v1[i]);
        }

        System.out.println("\n\nVetor com os menores elementos da cada coluna:\n");
        for(int i=0;i<7;i++)
        {
            System.out.println(v2[i]);
        }
    }
}
