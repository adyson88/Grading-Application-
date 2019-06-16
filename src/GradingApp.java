import java.util.*;

 

public class GradingApp {

      static int getScore(String prompt, Scanner scanner, int min, int max) {

            
            System.out.print(prompt);

            
            int score = scanner.nextInt();

            
            if (score >= min && score <= max) {

                  
                  return score;

            } else {

                  
                  System.out.println("Invalid. The score should be between " + min

                              + " and " + max + ", try again!");

                  
                  return getScore(prompt, scanner, min, max);

            }

 

      }

 

      public static void main(String[] args) throws java.lang.Exception {

 

            Scanner sc = new Scanner(System.in);

 

            System.out.println("Enter how many students");

 

            int n = sc.nextInt();

 

            int a[] = new int[100];

 

            int b[] = new int[100];

 

            int total[] = new int[100];

 

            for (int j = 1; j <= n; j++) {

 

                  int sum = 0;

 

                  System.out.println("Enter the student " + j + " Scores");

 

                  for (int i = 1; i <= 4; i++) {

                        
                        a[i] = getScore("Exam #" + i + " Score(0-50) ", sc, 0, 50);

                        
                        b[i] = getScore("Assigment #" + i + " Score(0-75) ", sc, 0, 75);

 

                        sum = a[i] + b[i] + sum;

 

                  }

 

                  total[j] = sum;

 

            }

 

            double mean = 0.0, sd = 0.0;

 

            for (int i = 1; i <= n; i++) {

 

                  mean += total[i];

 

            }

 

            mean /= n;

 

            for (int i = 1; i <= n; i++) {

 

                  sd += (total[i] - mean) * (total[i] - mean);

 

            }

 

            sd /= n;

 

            sd = Math.sqrt(sd);

 

            for (int i = 1; i <= n; i++) {

                  System.out.print("Student " + total[i] + " Final Grade is ");

                 
                  if (total[i] >= mean + (2 * sd)) {

 

                        System.out.println("A");

 

                  } else if (total[i] >= mean + (1 * sd)) {

 

                        System.out.println("B");

 

                  } else if (total[i] >= mean) {

 

                        System.out.println("C");

 

                  } else if (total[i] >= mean - (1 * sd)) {

 

                        System.out.println("D");

 

                  } else {

 

                        System.out.println("F");

 

                  }

 

            }

 

      }

 

}