public static void plusMinus(List<Integer> arr) 
    {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        for (int arr_i = 0 ; arr_i < arr.size() ; arr_i++)
        {
            //if(arr_i > 0)
            if(arr.get(arr_i) > 0)
            {
                positive++;
            }
            else if(arr.get(arr_i) < 0)
            //else if(arr_i < 0)
            {
                negative++;
            }
            else if(arr.get(arr_i)==0)
            //else if(arr_i == 0)
            {
                zero++;
            }
        }
        int n = arr.size();
        //System.out.println(positive / n);
        System.out.println(String.format("% .6f", (double) positive/n));
        System.out.println(String.format("% .6f", (double) negative/n));
        System.out.println(String.format("% .6f", (double) zero / n));
    }
}
