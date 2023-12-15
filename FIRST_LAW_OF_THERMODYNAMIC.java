 import java.util.*;
public class FIRST_LAW_OF_THERMODYNAMIC{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("1. Calculate \n");
        System.out.print("2. Exit \n");
        System.out.print("1 OR 2 = ");
        int n=in.nextInt();
        while(n==1){
        System.out.printf("1. Heat Tranfer is Not Occur \n");
        System.out.printf("2. Heat Tranfer is Occur \n\n");
        System.out.print("1 OR 2 = ");
        int Type;
        Type=in.nextInt();
    if(Type==1)
    {
        System.out.print("\nNumber of process: ");
        int j,i,np=in.nextInt();
		String unit="Kj";
        System.out.print("------------!!!-----------\n");
        System.out.print("Enter value=999 for UNKNOWN value\n");
		System.out.println("All the unit must be in Kj");
        System.out.print("------------!!!-----------\n\n");
        int Q[]=new int[np+1];
        int W[]=new int[np+1];
        int dE[]=new int[np+1];
        Q[0]=W[0]=dE[0]=0;
        for(i=1;i<=np;i++)
        {
            System.out.print("---------process "+i+"--------\n\n");
            System.out.print("Enter the value of Q"+i+"("+unit+")= ");    
            Q[i]=in.nextInt();
            System.out.print("Enter the value of W"+i+"("+unit+")= ");
            W[i]=in.nextInt();
            System.out.print("Enter the value of dE"+i+"("+unit+")= ");
            dE[i]=in.nextInt();
        }
        Method1(np,Q,W,dE,unit);
        System.out.print("1. Calculate \n");
        System.out.print("2. Exit \n");
        System.out.print("1 OR 2 = ");
        n=in.nextInt();
    }
    else if(Type==2)
    {
		String unit="Kj/min";
        System.out.print("Amount of heat transfered= ");
        int ht=in.nextInt();
        System.out.print("No of cycle occur= ");
        int c=in.nextInt();
        int TQ=c*ht;
        System.out.print("Number of process= ");
        int j,i,np=in.nextInt();
         System.out.print("------------!!!-----------\n");
        System.out.print("Enter value=999 for unknown value \n ");
		System.out.println("All the unit must be in Kj/min");
         System.out.print("------------!!!-----------\n\n");
        int Q[]=new int[np+1];
        int W[]=new int[np+1];
        int dE[]=new int[np+1];
        Q[0]=W[0]=dE[0]=0;
        for(i=1;i<=np;i++)
        {
            System.out.print("---------process "+i+"--------\n\n");
            System.out.print("Enter the value of Q"+i+"("+unit+")= ");    
            Q[i]=in.nextInt();
            System.out.print("Enter the value of W"+i+"("+unit+")= ");
            W[i]=in.nextInt();
            System.out.print("Enter the value of dE"+i+"("+unit+")= ");
            dE[i]=in.nextInt();
        }
        Method2(np,TQ,Q,W,dE,unit);
        System.out.print("1. Calculate \n");
        System.out.print("2. Exit \n");
        System.out.print("1 OR 2 = ");
        n=in.nextInt();
    }
}
    }
    public static void  Method1(int np,int Q[],int W[],int dE[], String unit){
        int i,j;
        for(i=1;i<=np;i++)
        {
        if(Q[i]==999&&W[i]==999 || Q[i]==999&&dE[i]==999 || W[i]==999&&dE[i]==999)
        {
     
        }
        else{
            if(dE[i]==999)
            {
                dE[i]=Q[i]-W[i];
            }
            else if(W[i]==999)
            {
                W[i]=Q[i]-dE[i];
                
            }
            else if(Q[i]==999)
            {
                Q[i]=W[i]+dE[i];
            }
        }
        }
        int Sum_dE=0;
        for(i=1;i<=np;i++)
        {
            if(dE[i]!=999)
            {
            Sum_dE=Sum_dE+dE[i];
            }
        }
        for(i=1;i<=np;i++)
        {
             if(dE[i]==999)
             {
                 dE[i]=-Sum_dE;
             }
        }
        for(i=1;i<=np;i++)
        {
             if(dE[i]==999)
            {
                dE[i]=Q[i]-W[i];
            }
            else if(W[i]==999)
            {
                W[i]=Q[i]-dE[i];
            }
            else if(Q[i]==999)
            {
                Q[i]=W[i]+dE[i];
            }
        }
        System.out.print("---------ANSWERS---------\n");
        for(i=1;i<=np;i++)
         {
            System.out.printf("the value of Q%d= %d %s\n",i,Q[i],unit); 
            System.out.printf("the value of W%d= %d %s\n",i,W[i],unit);
            System.out.printf("the value of dE%d= %d %s\n",i,dE[i],unit);
	    System.out.print("-------------------------\n");
         }
       }
    public static void Method2(int np,int TQ,int Q[],int W[],int dE[],String unit){
        int i;
         for(i=1;i<=np;i++)
        {
        if(Q[i]==999&&W[i]==999 || Q[i]==999&&dE[i]==999 || W[i]==999&&dE[i]==999 || Q[i]==999&&W[i]==999&&dE[i]==999)
        {

        }
        else{
            if(dE[i]==999)
            {
                dE[i]=Q[i]-W[i];
            }
            else if(W[i]==999)
            {
                W[i]=Q[i]-dE[i];
            }
            else if(Q[i]==999)
            {
                Q[i]=W[i]+dE[i];
            }
        }
        }
        int Qsum=0;
        for(i=1;i<=np;i++)
         {
             if(Q[i]!=999)
             {
                 Qsum=Qsum+Q[i];
             }
         }
         for(i=1;i<=np;i++)
         {
             if(Q[i]==999)
             {
                 Q[i]=TQ-Qsum;
             }
         }
         int Sum_dE=0;
        for(i=1;i<=np;i++)
        {
            if(dE[i]!=999)
            {
            Sum_dE=Sum_dE+dE[i];
            }
        }
        for(i=1;i<=np;i++)
        {
             if(dE[i]==999)
             {
                 dE[i]=-Sum_dE;
             }
        }
        for(i=1;i<=np;i++)
        {
            if(dE[i]==999)
            {
                dE[i]=Q[i]-W[i];
            }
            else if(W[i]==999)
            {
                W[i]=Q[i]-dE[i];
            }
            else if(Q[i]==999)
            {
                Q[i]=W[i]+dE[i];
            }
        }
		System.out.print("---------ANSWERS---------\n");
        for(i=1;i<=np;i++)
         {
            System.out.printf("the value of Q%d= %d %s\n",i,Q[i],unit); 
            System.out.printf("the value of W%d= %d %s\n",i,W[i],unit);
            System.out.printf("the value of dE%d= %d %s\n",i,dE[i],unit);
	    System.out.print("-------------------------\n");
         }
    }
}
