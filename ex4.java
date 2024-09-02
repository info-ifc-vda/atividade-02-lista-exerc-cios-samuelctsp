import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int codigos[]=new int[3];
        float saldos[]=new float[3];

        for(int i=0;i<codigos.length;i++)
        {
            System.out.println("Informe o código da conta "+(i+1)+":");
            codigos[i]=teclado.nextInt();

            System.out.println("Informe o saldo da conta "+(i+1)+":");
            saldos[i]=teclado.nextFloat();

            System.out.println("\n");
        }
        
        while(2>1)
        {
            System.out.println("\n");
            
            System.out.println("1-Efetuar depósito");
            System.out.println("2-Efetuar saque");
            System.out.println("3-Consultar o ativo bancário");
            System.out.println("4-Finzalizar programa");

            int num;
            num=teclado.nextInt();
            
            switch (num) {
                case 1:
                    float val=0;
                    int codigo=0;
                
                    System.out.println("Informe o valor para depósito:");
                    val=teclado.nextFloat();
    
                    
                    System.out.println("Informe o código da conta para depósito do valor:");
                    codigo=teclado.nextInt();
    
                    int flag=0;
                    int Isaldos=0;
                    
                    for(int i=0;i<codigos.length;i++)
                    {
                        if(codigo==codigos[i])
                        {
                            flag=1;
                            Isaldos=i;
                        }
                    }
    
                    if(flag==1)
                    {
                        saldos[Isaldos]+=val;
                    }else
                    {
                        System.out.println("Conta não encontrada!");
                    }
    
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar:");
                    val=teclado.nextFloat();

                    System.out.println("Informe o código da conta para sacar:");
                    codigo=teclado.nextInt();

                    int flag2=0;
                    int Isaldos2=0; 
                
                    for(int i=0;i<codigos.length;i++)
                        {
                            if(codigo==codigos[i])
                            {
                                flag2=1;
                                Isaldos2=i;
                            }
                        }

                    if(flag2==1)
                    {
                        if(saldos[Isaldos2]>=val)
                        {
                            saldos[Isaldos2]-=val;
                        }else
                        {
                            System.out.println("Saldo insuficiente!");
                        }
                    }else
                    {
                        System.out.println("Conta não encontrada!");
                    }
                
                    break;
                case 3:
                    float soma=0;
                    for(int i=0;i<saldos.length;i++)
                    {
                        soma+=saldos[i];
                    }
                    System.out.println("Ativo bancário: R$"+soma);
                    break;
                case 4:
                    System.out.println("Finzalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

            if(num==4)
            {
                break;
            }
        }
    }
}
