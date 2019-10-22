import java.util.Scanner;
public class student2 {
    public static void main(String[] args){
        Scanner first = new Scanner(System.in);
        System.out.println("Please enter the number of students' data you would like to enter");
        int s = first.nextInt();
        student[] studentArray = new student[s];
        for(int i=0;i<s;i++){
            studentArray[i]= new student();
        }//end 1st for
        for(int i=0;i<s;i++){
            studentArray[i].getInfo();
        }//end 2nd for
        System.out.println("Student Details, Department of ILT");
        for(int i=0;i<s;i++){
            System.out.println(studentArray[i].displayInfo());
        }//end 3rd for
        System.out.println("The number of students is: "+studentArray[s-1].getCount());

    }//end main
}//end class
