public static List<Integer> gradingStudents(List<Integer> grades) 
    {
    // Write your code here
     int NewMarks = 0;
     for(int i = 0 ; i < grades.size() ; i ++)
     {
         if(grades.get(i) < 38)
         {
             //System.out.println(grades);
             //return grades;
             grades.set(i,grades.get(i));
         }
         else
         {
             int temp = grades.get(i) / 5;
             NewMarks = (temp + 1) * 5;
             if((NewMarks - grades.get(i)) < 3)
             {
                 //grades.get(i) = NewMarks;
                 grades.set(i,NewMarks);
             }
            // return grades; 
         }
      }
      return grades;
    }
