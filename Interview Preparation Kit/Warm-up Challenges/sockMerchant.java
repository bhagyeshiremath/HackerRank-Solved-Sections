
public static int sockMerchant(int n, List<Integer> ar) 
    {
       /* ArrayList<Integer> store = new ArrayList<Integer>();
        int k = 0;
        for(int i = 0 ; i < n; i ++)
        {
            int element = ar.get(i);
            if(store.contains(element))
            {
                store.remove(element);
                k++;
            }
            else
            {
                store.add(element);
            }
        }
        return k;*/
        ArrayList <Integer> store= new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++)
        {
            if(!store.contains(ar.get(i)))
               store.add(ar.get(i));
        }
        int cnt=0;
        for(int i = 0 ; i < store.size() ; i++)
        {
            cnt = cnt + Collections.frequency(ar,store.get(i))/2;
        }
        return cnt;
    }
}
