import java.lang.Math;


// This will be use just simple practice writing code just to get back in the swing of java
public class Practice {

    public static void main(String[] args) {
        // calculate expression and print to screen
        System.out.println(3*4);

        // Use the math lib to store a calculation in a variable and print it to the screen
        double answer = Math.sqrt(Math.pow(3,2)+Math.pow(4,2));
        System.out.println(answer);

        System.out.println((4 + 6.2 +(-12))/3);

        // String concatenation
        String s1 = "Jessie";
        String s2 = "Burton";
        String s3 = "01234";
        System.out.println(s1 + " " + s2);

        // String methods
        System.out.println(s1.length());
        System.out.println(s1.substring(1, 4));
        System.out.println(s1 + " is without a doubt "+ "#" + s3.substring(1, 2));

        System.out.println();


        //Testing out the Transportation Class
        Transportation schoolBus = new Bus();
        Transportation honda = new Car();
        Transportation crotchRocket = new Motorcycle();
        Transportation sportsCar = new Car(2);
        //Transportation sportsCarTest = new Car(3);

        System.out.println(schoolBus.toString());
        System.out.println(honda.toString());
        System.out.println(crotchRocket.toString());
        System.out.println(sportsCar.toString());
        //System.out.println(sportsCarTest.toString());
        


    }
}
