package student;
import java.util.Scanner;

public class studentinterface {
     private String name;
     private int score;
     private int score2;
     

    public Student(){

    }
     public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);
        
        String name;
        int score = 0;
        int score2 = 0;
        System.out.print("Enter name for first student (min 1 letter): ");
        name = scan.nextLine();
        stu1.setName(name);
        for (int i = 1; i <=3; i++) {
            System.out.format("Enter text score %d for %s> ", i, stu1.getName());
            score = scan.nextInt();
            stu1.setScore(i, score);
        }
        
        scan.nextLine();
        System.out.println("\n-------------------\n");
        System.out.println("Enter name for second student");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, stu2.getName());
            score2 = scan.nextInt();
            stu2.setScore(i, score);
        }
        System.out.println("\n--------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);
    }
        public int getHighScore(){
        int high = Math.max(score,score2);
        int highScore;
        highScore = score;
        if (score2> highScore) highScore = score2;
        
    
    
        
              
    
    
