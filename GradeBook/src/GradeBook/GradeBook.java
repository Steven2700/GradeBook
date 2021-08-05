
package GradeBook;

import java.util.Scanner;
/**
 *
 * @author Steven Navarrete
 */
public class GradeBook {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double scores = 0;
        int A_count = 0;
        int B_count = 0; 
        int C_count = 0;
        int D_count = 0;
        int F_count = 0;
        int score_count = 0;
        double Total_score = 0;
        double average_classScore;
        String classGrade = "";
        
        while (scores >= 0) {
            System.out.println("Enter a score. enter -1 to calculate class average");
            scores = input.nextDouble();
            
            
            if(scores >= 90)
        {
            System.out.println(scores + " is an A");
            Total_score += scores;
            A_count ++;
            score_count++;
            
        }
        else if(scores >= 80 && scores <90)
        {
           System.out.println(scores + " is a B");
           Total_score+= scores;
           B_count++;
           score_count++;
           
        } 
        else if(scores >=70 && scores <80)
        {
            System.out.println(scores + " is a C");
            Total_score+= scores;
            C_count++;
            score_count++;
            
        }
        else if(scores >=60 && scores <70)
        {
            System.out.println(scores + " is a D");
            Total_score+= scores;
            D_count++;
            score_count++;
            
        }
        else if(scores <60 && scores >=0)
        {
           System.out.println(scores + " is a F");
           Total_score+= scores; 
           F_count++;
            score_count++;
             
        }
    }
        
        
        average_classScore = Total_score / score_count;
        
        if(average_classScore >= 90)
        {
            classGrade = "A";
        }
        else if(average_classScore >= 80 && average_classScore <90)
        {
           
           classGrade = "B";
        } 
        else if(average_classScore >=70 && average_classScore <80)
        {
            classGrade = "C";
            
        }
        else if(average_classScore >=60 && average_classScore <70)
        {
            
            classGrade = "D";
        }
        else if(average_classScore < 50 && average_classScore >=0)
        {
           
            classGrade = "F";
    
            
        }
            
        System.out.println("Total number of A's: " + A_count);
        System.out.println("Total number of B's: " + B_count);
        System.out.println("Total number of C's: " + C_count);
        System.out.println("Total number of D's: " + D_count);
        System.out.println("Total number of F's: " + F_count);
        System.out.println("Total number of scores entered: " + score_count);
        System.out.println("Average class score: " + average_classScore );
        System.out.println("Average class grade: " + classGrade );
        
    }
}
