public static String timeConversion(String s) 
    {
            String finalstring="";
            String[] arr=s.split(":");
            String hour=arr[0];
            String minutes=arr[1];
            String seconds=arr[2].substring(0,2);
            String ampm=arr[2].substring(2);
            if (ampm.equals("PM"))
            {
                //System.out.println("----");
                if(Integer.parseInt(hour)==12)
                    finalstring+=hour;
                else
                    finalstring+=Integer.toString(Integer.parseInt(hour)+12);
                finalstring+=":"+minutes+":"+seconds;
                return finalstring;
            }
            else
            {
                if (hour.equals(Integer.toString(12)))
                {
                    StringBuilder str=new StringBuilder(s);
                    str.setCharAt(0,'0');
                    str.setCharAt(1,'0');
                    String st=str.toString().substring(0,8);
                    return st;
                }
                else 
                {
                    String str=s.substring(0,8);
                    return str;
                }
            }
    }
