public static int diagonalDifference(List<List<Integer>> arr) 
    {
    // Write your code here
    int first_dia=0;
    int second_dia=0;
    for(int i=0; i < arr.size() ; i++)
    {
        //System.out.println("a");
        for(int j=0;j< arr.size(); j++)
        {
            if(i==j)
            {
                //first_dia = first_dia + arr[i][j].get(i);
                first_dia=first_dia+arr.get(i).get(j);
            }
             if (i+j==arr.size()-1)
            {
                //second_dia = second_dia + arr[i][j].get(i);
                second_dia = second_dia + arr.get(i).get(j);
            }
        //System.out.println( );
        }
        }
        int ans = first_dia - second_dia;
        if(ans<0)
        {
            ans = ans * -1;
        }      
    return ans;
    }
}
