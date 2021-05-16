public static long repeatedString(String s, long n) 
    {
        long count = 0 ;
        
        if (s.length()==1 && s.charAt(0)=='a')
        {
            return n;
        }
        else if (s.length()==1 && s.charAt(0)!='a')
        {
            return 0;
        }
        for(int i = 0 ; i < s.length() ; i ++)
        {
            if(s.charAt(i) == 'a')
            {
                count ++;
            }
        }
        count = count * (n / s.length());
        for(int i = 0 ; i < n % s.length() ; i++)
        {
            if(s.charAt(i)== 'a') 
            { 
                count ++;
            }
        }
        return count ;
    }
