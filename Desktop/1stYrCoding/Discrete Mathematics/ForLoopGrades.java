
public class ForLoopGrades {
  public static void main (String [] args) {
  String[] students = {"Anna", "Ben", "Carla"};
  int [][] grades = {
    {85, 90, 98},
    {78, 72, 80},
    {92, 95, 93}
  };

  System.out.println ("=== For Loop - Student Grades ===\n");

  for (int i = 0; i < students.length; i++){
    System.out.print("Students: " + students [i] + " Grades: ");
    int total = 0;

  
      for (int j = 0; j < grades[i].length; j++) {
      System.out.print(grades[i][j] + " ");
      total += grades [i][j];
  }

    double average = total / 3.0;
    String remark = average >=75 ? "Passed" : "Failed";
    System.out.println ("|Average: " + average + " -> " + remark);
  }
}
}