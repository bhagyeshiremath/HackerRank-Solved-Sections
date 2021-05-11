public static int birthdayCakeCandles(List<Integer> candles) 
{
int max = candles.get(0);
int cnt = 0;
for(int i=0;i<candles.size();i++)
{
       if(max<candles.get(i))
       {
            max = candles.get(i);
       }
}
for(int j=0;j<candles.size();j++)
{
        if(candles.get(j)==max)
        {
           cnt = cnt + 1;
        }
}
return cnt;
}
