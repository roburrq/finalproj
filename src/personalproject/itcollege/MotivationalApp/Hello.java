package personalproject.itcollege.MotivationalApp;
import Practice2.TextIO;
import java.util.Random;


/*Author = Romaine Ayoki Burrell
Course: ICS004 - Fundamentals of programming
Item: Motivational App.

*******DISCLAIMER***************
This app generates random quotes base on ones feeling and age.
***This app is not to be used for any medical substitute. If you or anyone you know currently suffer from any
* psychological issues eg. depression please speak to a license practitioner.
* I accept no liability and in no way market this app as a replacement for required professional services.
*
* *******THIS APP IS ONLY FOR ENTERTAINMENT PURPOSES**********
 */

public class Hello {
    public static void main (String [] args){

        phrases ph = new phrases();

        //user will be provided a greeting and instructed to enter their name, age and mood.

        System.out.println ("Welcome to the motivational centre. Please enter your name, age and how you are feeling to get your quote");
        System.out.println();
        System.out.println("Please enter your name here: ");
        String name = TextIO.getlnString();
        System.out.println("Hello" + " " + name);
        System.out.println();
        System.out.println("How old are you? : ");
        int age = TextIO.getlnInt();  //Age is an integer, hence user can only enter a number.
        System.out.println("How are you feeling today? (Please use Angry, Happy or Sad)");
        String feelings = TextIO.getlnString();

        Random rand = new Random();   //creating a object 'rand'. This will be called to generate a random quotes base on user input.

        //The if and else if loop is used to check user inputs from 'rand'. The 'toUpperCase* is used to accept user input in any random case
        //and converting the text to upper case which the loop will then recognize and return appropriate responses.
        if (age <18 && feelings.toUpperCase().equals("SAD")){
            System.out.println(ph.sadQuotesB18[rand.nextInt(2)]);
        } else if (age >= 18 && feelings.toUpperCase().equals("SAD") ) {
            System.out.println(ph.sQuotesA18[rand.nextInt(3)]);
        } else if (age <18 && feelings.toUpperCase().equals("ANGRY")){
            System.out.println(ph.angrQuotesB18[rand.nextInt(2)]);
        } else if (age >= 18 && feelings.toUpperCase().equals("ANGRY")){
            System.out.println(ph.aQuotesA18[rand.nextInt(8)]);
        } else if (age < 18  && feelings.toUpperCase().equals("HAPPY")){
            System.out.println(ph.happyQuotesB18[rand.nextInt(2)]);
        } else if (age >= 18 && feelings.toUpperCase().equals("HAPPY")){
            System.out.println(ph.hQuotesA18[rand.nextInt(4)]);
        } else{
            System.out.println("You have entered and unknown combination, please retry");
        }
        System.out.println();
        System.out.println("Do you want to go again?  Please answer with YES or NO");
        String answer = TextIO.getlnString();
        if(answer.toUpperCase ().equals("YES")){
            String[] restart = new String[1];
            main(restart);
        }else{
            System.out.println("Ok goodbye now");
        }

}
}
