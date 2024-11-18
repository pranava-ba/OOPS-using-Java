import java.util.*;
public class VariableCheck { //class is named using Pascal naming convention
    public static void main(String[] args) {
        int temperature =5;
        //it is better to declare variables separately for better visibility and coding practices
        int myAge=19;
        int broAge=21;
        //variables are named using camel naming convention
        boolean flag=true;
        char ch='a';
        //single characters are called with single quotes, rest with double quotes
        int viewCount=123_456_789;
        //integer can only have integers of max 3 billion, for larger values use long
        //integers can be split using underscore to make it more readable
        long newViewCount=12345_12345_12345L;
        //use caps L for better readability
        float taxRate= 11.0310F;
        //F to  specify type as 11.0310 is recognised as double
        double discount=6.9;
        System.out.println("bro age is "+broAge);
        System.out.println("my age is "+myAge);
        Date now=new Date();
        //now is an instance of the Date() class
        now.getTime();
        System.out.println("temperature is "+temperature);
        System.out.println("now is "+now);
        String message = "wow this is cool";
        System.out.println(message.replace(" ","sus"));
    }
}
