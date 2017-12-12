package personalproject.itcollege.MotivationalApp;
import Practice2.TextIO;
import sun.font.TrueTypeFont;
import sun.invoke.empty.Empty;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
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

        String[] angrQuotesB18 = {           ///Loading angry quotes for persons under 18 into an array
                "Don't get mad, smile and creep them out instead",
                "Your too amazing to let someone upset you",
        };

        String [] sadQuotesB18 = {          ///Loading sad quotes for persons under 18 into an array
                "being sad is a waste of time",
                "its ok to feel sad, the sky cries too, just remember that the sun comes out at some point",
                "Someone loves you honey",

        };
        String [] happyQuotesB18 = {         ///Loading happy quotes for persons under 18 into an array
                "Our phones fall we panic our friends fall we laugh :D ",
                "All my life i thought air was free until i bought a bag of chips"
        };
        String[] aQuotesA18 = {          ///Loading angry quotes for persons 18 and over into an array
                "If my dog had your face I'd shave his butt and teach him to walk backwards.",
                "It's not worth the jail time",
                "When your angry take a breath and count to 10. Throw a punch at 8, no one expects that",
                "Don't break anybody's heart they only have one. Break their bones they have 206 ",
                "You wouldn't have to manage your anger if people would manage their stupidity",
                "Behind every angry woman is a man that has no idea what he did wrong",
                "Never go to bed angry, Stay away and plot your revenge",
                "If you want to kill someone just do it in your mind, you can express your full creativity their and there are no rules"
        };

        String [] sQuotesA18 = {       ///Loading sad quotes for persons 18 and over into an array
                "Whenever your feeling sad just remember there is an idiot pulling a door thats says 'push'",
                "I don't hate you i just lost respect for you",
                "If people show you that they don't care, show them that you are ok",
                "blah, blah, blah, blah....go eat an ice cream"

        };
        String [] hQuotesA18 = {          ///Loading happy quotes for persons 18 and over into an array
                "I'm going to stand outside so if anyone asks i am 'outstanding' ",
                "Don't give up on your dreams keep sleeping",
                "Vodka once told me; 'Trust me you can dance'",
                "With great power comes great electricity bill"
        };
        String[][] quoestoqueotes = {angrQuotesB18,sadQuotesB18,happyQuotesB18}; //creating an array into an array
        String[][] quoestoqueotes18 = {aQuotesA18,sQuotesA18,hQuotesA18}; //creating pointers to the arrays

        String[][][] ages = {quoestoqueotes,quoestoqueotes18,};  //creating an array within an array, within another array

        //user will be provided a greeting and instructed to enter their name, age and mood.
        System.out.println ("Welcome to the motivational centre. Please enter your name, age and how you are feeling to get your quote");
        System.out.println();
        System.out.println("Please enter your name here: ");
        String name = TextIO.getlnString();
        System.out.println("Hello" + " " + name);
        System.out.println();
        System.out.println("How old are you? : ");
        int age = TextIO.getlnInt();  //Age is an integer, hence user can only enter a number.
        System.out.println("How are you feeling today? ");
        String feelings = TextIO.getlnString();

        Random rand = new Random();   //creating a method 'rand'. This will be called to generate a random quotes base on user input.

        int select = rand.nextInt(5); //this is where the random quotes will be generated after getting user input that matches any of the below criteria.

        //String choice = [select];
        //The if and else if loop is used to check user inputs from 'rand'. The 'toUpperCase* is used to accept user input in any random case
        //and converting the text to upper case which the loop will then recognize and return appropriate responses.
        if (age <18 && feelings.toUpperCase().equals("SAD")){
            System.out.println(ages[0][1][rand.nextInt(2)]);
        }
        else if (age >= 18 && feelings.toUpperCase().equals("SAD") ) {
            System.out.println(ages[1][1][rand.nextInt(3)]);
        }
        else if (age <18 && feelings.toUpperCase().equals("ANGRY")){
            System.out.println(ages[0][0][rand.nextInt(2)]);
        }
        else if (age >= 18 && feelings.toUpperCase().equals("ANGRY")){
            System.out.println(ages [1][0][rand.nextInt(8)]);
        }
        else if (age < 18  && feelings.toUpperCase().equals("HAPPY")){
            System.out.println(ages [0][2][rand.nextInt(2)]);
        }
        else if (age >= 18 && feelings.toUpperCase().equals("HAPPY")){
            System.out.println(ages [1][2] [rand.nextInt(4)]);
        }
        else{
            System.out.println("You have entered and unknown combination, please retry");
        }
}
}
