/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Scanner;
/**
 *
 * @author Steven Navarrete
 */
public class GradeBook {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double scores = 0;
        
        int A_count = 0;
        int B_count = 0; 
        int C_count = 0;
        int D_count = 0;
        int F_count = 0;
        int score_count = 0;
        double Total_score = 0;
        double average_score;
        String classGrade = "";
        
        while (scores >= 0) {
            System.out.println("Enter a score. When you are done, enter -1 to calculate class average");
            scores = sc.nextDouble();
            
            
            if(scores >= 90)
        {
            System.out.println(scores + " is an A");
            A_count ++;
            score_count++;
            Total_score += scores;
        }
        else if(scores >= 80 && scores <90)
        {
           System.out.println(scores + " is a B");
           B_count++;
           score_count++;
           Total_score+= scores;
        } 
        else if(scores >=70 && scores <80)
        {
            System.out.println(scores + " is a C");
            C_count++;
            score_count++;
            Total_score+= scores;
        }
        else if(scores >=60 && scores <70)
        {
            System.out.println(scores + " is a D");
            D_count++;
            score_count++;
            Total_score+= scores;
        }
        else if(scores <60 && scores >=0)
        {
           System.out.println(scores + " is a F");
            F_count++;
            score_count++;
            Total_score+= scores;
            
    
            
        }
    }
        
        
        average_score = Total_score / score_count;
        
        if(average_score >= 90)
        {
            classGrade = "A";
        }
        else if(average_score >= 80 && average_score <90)
        {
           
           classGrade = "B";
        } 
        else if(average_score >=70 && average_score <60)
        {
            classGrade = "C";
            
        }
        else if(average_score >=60 && average_score <70)
        {
            
            classGrade = "D";
        }
        else if(average_score < 50 && average_score >=0)
        {
           
            classGrade = "F";
    
            
        }
            
        
        System.out.println("Total number of A's: " + A_count);
        System.out.println("Total number of B's: " + B_count);
        System.out.println("Total number of C's: " + C_count);
        System.out.println("Total number of D's: " + D_count);
        System.out.println("Total number of F's: " + F_count);
        System.out.println("Total number of scores entered: " + score_count);
        System.out.println("Average class score: " + average_score );
        System.out.println("Average class grade: " + classGrade );
        
    }
}
