public static void staircase(int n) 
    {
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j < (n-1-i))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }*/
        
        
        for(int I=0; I<n;I++)
        {
          for(int j=0; j<(n-I-1);j++)
          {
            System.out.print(" ");
          }
          for(int k=0;k<=I;k++)
          {
            System.out.print("#");
          }
          System.out.println("");
          }
        }
