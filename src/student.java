import java.util.Scanner;
import java.util.regex.*; //verification
public class student {
    private static int count = 0;
    private String firstName, lastName, classStanding, email, address, city, state;
    private int peopleSoft, zip;
    private Scanner tuna= new Scanner(System.in);
    //strings
    public void setFirstName(){
        System.out.println("First Name: ");
        firstName=tuna.nextLine();
        while(!firstName.chars().allMatch(Character::isLetter)){
            System.out.println("Incorrect format. Please enter the correct format. ");
            System.out.println("First Name: ");
            firstName= tuna.nextLine();
        }//end while
    }//end first method
    private void setLastName(){
        System.out.println("Last Name: ");
        lastName=tuna.nextLine();
        while(!lastName.chars().allMatch(Character::isLetter)){
            System.out.println("Incorrect format. Please enter only letters. ");
            System.out.println("Last Name: ");
            lastName= tuna.nextLine();
        }//end while
    } //end 2nd method
    private void setClassStanding(){
        System.out.println("Class Standing: ");
        classStanding =tuna.nextLine().toLowerCase();
        while(!classStanding.equals("freshman")&&!classStanding.equals("sophomore")&&!classStanding.equals("junior")&&!classStanding.equals("senior")){
            System.out.println("Please format in only lowercase letters");
            System.out.println("Class Standing: ");
            classStanding=tuna.nextLine();
        }//end while
    }//end method 3
    private void setEmail(){
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"; //for required symbols
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Email: ");
        email=tuna.nextLine();
        Matcher matcher = pattern.matcher(email);
        while(!matcher.matches()){
            System.out.println("Incorrect format. Please try again");
            System.out.println("Email: ");
            email=tuna.nextLine();
            matcher = pattern.matcher(email);
        }//end while
    }//end 4th method
    private void setAddress(){
        System.out.println("Address: ");
        address=tuna.nextLine();
        String[] street = address.split(" ", 2);
        while (!street[0].matches("[0-9]*$") && !street[1].matches("^[\\p{L} .'-]+$")){
            System.out.println("Incorrect format. Please enter the house number followed by a space and the street name");
            address=tuna.nextLine();
            street = address.split(" ", 2);
        }//end while
    }//end 5th method
    private void setCity(){
        System.out.println("City: ");
        city=tuna.nextLine();
        while(!city.matches("^[\\p{L} .'-]+$")){
            System.out.println("Incorrect format. Please use only letters");
            System.out.println("City: ");
            city=tuna.nextLine();
        }//end while
    }//end 6th method
    private void setState(){
        System.out.println("State: ");
        state=tuna.nextLine();
        while(!state.matches("^[\\p{L} .'-]+$")){
            System.out.println("Incorrect format. Please use only letters. Example: TX");
            System.out.println("State: ");
            state=tuna.nextLine();
        }//end while
    }//end 7th method
    //ints
    private void setPeopleSoft(){
        System.out.println("PeopleSoft ID: ");
        String z = tuna.nextLine();
        while(!z.matches("[0-9]*$")&&z.length()>7){
            System.out.println("Incorrect format. Please enter digits; no more than 7.");
            System.out.println("PeopleSoft ID: ");
            z=tuna.nextLine();
        }//end while
        peopleSoft=Integer.parseInt(z);  //int
    }//end 8th method
    private void setZip(){
        System.out.println("Zip: ");
        String x = tuna.nextLine();
        while(!x.matches("[0-9]*$")&&x.length()!=9){
            System.out.println("Incorrect format. Zip must be 9 digits long");
            System.out.println("Zip: ");
            x=tuna.nextLine();
        }//end while

        zip=Integer.parseInt(x);
    }//end method 9
    public void getInfo(){
        setFirstName();
        setLastName();
        setClassStanding();
        setEmail();
        setAddress();
        setCity();
        setState();
        setPeopleSoft();
        setZip();
        count = count+1;
    }//end method 10
    public String displayInfo(){
        return firstName+"\t"+lastName+"\t"+classStanding+"\t"+email+"\t"+address+"\t"+city+"\t"+state+"\t"+peopleSoft+"\t"+zip;
    }//end 11th method
    public int getCount(){
        return count;
    }// 12th method
}//end class