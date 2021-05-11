public static void miniMaxSum(List<Integer> arr) 
    {
        long min_sum=0;
        long max_sum=0;
        Collections.sort(arr);
        for(int I=0;I <arr.size();I++)
        {
            if(I<4)
            {
                min_sum+=arr.get(I);
            }
            if(I>0)
            {
                max_sum+=arr.get(I);
            }
        }
        System.out.println(min_sum+" "+max_sum);
    }
