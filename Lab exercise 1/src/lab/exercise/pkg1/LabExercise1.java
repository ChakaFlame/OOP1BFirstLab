/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise.pkg1;

/**
 *
 * @author 100568
 */
public class LabExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Question 1
        String firstName = "Jerry";
        String lastName = "Chaka";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        
        //Question 2
        String textF = "Welcome";
        String textL = "to the wonderful world of Java!!";    
        String textM = textF+" "+fullName+" "+textL;
        System.out.println(textM);
        
        //Question 3
        String sch = "I will be graduating soon!";
        System.out.println(sch);
        
        //Question 4
        String fun = "I am enjoying my experience at Strathmore University";
        System.out.println(fun);
        
        //Question 5
        int b = 10;
        int h = 7;
        int hy = 12;
        
        float a = (b*h)/2;
        int p = b+h+hy;
        
        String ar = "The area of the triangle is ";
        String pr = "The perimeter of the triangle is ";
        String ara = ar+" "+a;
        System.out.println(ara);
        String prp = pr+" "+p;
        System.out.println(prp);
      
        //Question 6
        int bp = 450000;
        int sp = 580000;
        int profit = sp - bp;
        
        String repout = "The profit of this selling is equals to ";
        String out = repout+" "+profit;
        System.out.println(out);
        
        //Question 7
        int yob = 1954;
        int cy = 2017;
        int cage = cy - yob;
        String reoutput = "Peter's age is ";
        String finout = reoutput+" "+cage;
        System.out.println(finout);
        
        //Question 8
        double totha = 20;
        double sons = 6;
        double portions = totha/sons;
        String haout = "Each son will receive ";
        String haend = "ha";
        String finhaout = haout+""+portions+" "+haend;
        System.out.println(finhaout);
        
        //Question 9
        int q = 10;
        int w = 15;
        float e = 12.6f;
        String outint = "Your variable is ";
        String intoutint1 = outint+" "+q;
        String intoutint2 = outint+" "+w;
        String intoutint3 = outint+" "+e;
        System.out.println(intoutint1);
        System.out.println(intoutint2);
        System.out.println(intoutint3);
    }
    
}
