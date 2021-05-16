public static int countingValleys(int steps, String path)
    {
    //ArrayList<Integer> steps = new ArrayList<Integer>();
    int Level = 0 ;
    int currentLevel = 0;
    for(int i = 0 ; i < steps ; i++)
    {
        char ch = path.charAt(i);
        if(ch == 'U')
        {
            currentLevel ++ ;
            
            if(currentLevel == 0 )
            {
            Level ++;
            }
        }
        else
        {
            currentLevel -- ;
        }
        //System.out.println(Level);
    }
     return Level;
    }
