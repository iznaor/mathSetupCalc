package com.example;
import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

//A simple java program to do various mathematical operations with steps
public class mathSetupCalc {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("/      Welcome to math calculator    /");
        System.out.println("--------------------------------------");

        //What the program can solve
        String one = "1 Solve a quadratic equation";
        String two = "2 Prime number calculator";
        String three = "3 Factorial calculator [n]!";
        String four = "4 Right triangle calculator";
        //User is shown what is on the "menu"
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println("--------------------------------------");
        //Clarification for the user
        System.out.println("Pick what you need:");
        System.out.println("!!!Choose one number!!!");
        System.out.println("--------------------------------------");

        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number: ");   // Wait for the user input
        String userChoice = userInput.nextLine();  // Read user input and store it as user choice
        int numUserChoice=Integer.parseInt(userChoice); // String is converted to integer

        if (numUserChoice == 1) { //execution for the first choice quadratic equation

            System.out.println("You picked: "+one + ", please give additional info");
            System.out.println("ax^2+bx+c=0");

            System.out.println();
            System.out.println("Enter value for a=");
            Scanner userInputA = new Scanner(System.in);
            int valueA = userInputA.nextInt();

            System.out.println("Enter value for b=");
            Scanner userInputB = new Scanner(System.in);
            int valueB = userInputB.nextInt();

            System.out.println("Enter value for c=");
            Scanner userInputC = new Scanner(System.in);
            int valueC = userInputC.nextInt();

            //user is shown the initial equation
            System.out.println(valueA+"x^2+"+valueB+"+"+valueC+"=0");
            //user is shown the generic formula
            System.out.println("     -b +- sqrt(b^2-4ac) ");
            System.out.println("x = ---------------------");
            System.out.println("              2a         ");
            //user is shown the formula populated by his values
            System.out.println();
            System.out.println("     -"+valueB+" +- sqrt("+valueB+"^2-4*"+valueA+"*"+valueC+") ");
            System.out.println("x = -----------------------------------");
            System.out.println("                 2*"+valueA+"                         ");

            int value4AC = 4*valueA*valueC;
            int value2A = 2*valueA;

            System.out.println();
            System.out.println("     -"+valueB+" +- sqrt("+valueB+"^2-"+value4AC+") ");
            System.out.println("x = -----------------------------------");
            System.out.println("                  "+value2A+"                      ");
            System.out.println();

            int valueBsquared = valueB*valueB;

            System.out.println();
            System.out.println("     -"+valueB+" +- sqrt("+valueBsquared+"-"+value4AC+") ");
            System.out.println("x = -----------------------------------");
            System.out.println("                  "+value2A+"                      ");
            System.out.println();

            int valueParentheses = valueBsquared-value4AC;

            System.out.println();
            System.out.println("     -"+valueB+" +- sqrt("+valueParentheses+") ");
            System.out.println("x = -----------------------");
            System.out.println("            "+value2A+"                  ");
            System.out.println();

            double valueSq = Math.sqrt(valueParentheses);
            //output will be NaN if less than zero
            if (valueSq>=0) {

                System.out.println();
                System.out.println("     -" + valueB + " +- " + valueSq);
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();

                int valueB2 = valueB *-1;
                double valueUp1= valueB2+valueSq;
                double valueUp2= valueB2-valueSq;
                double valueFin1=valueUp1/value2A;
                double valueFin2=valueUp2/value2A;

                System.out.println();
                System.out.println("     -" + valueB + " +- " + valueSq);
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();

                System.out.println();
                System.out.println("     " + valueB2 + " +- " + valueSq);
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();

                System.out.println("----------------------------------------------");
                System.out.println();
                System.out.println( "        "+valueUp1+ "                        ");
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();

                System.out.println();
                System.out.println("FIRST SOLUTION");
                System.out.println();
                System.out.println("x = "+valueFin1);
                System.out.println();

                System.out.println("----------------------------------------------");

                System.out.println();
                System.out.println( "        "+valueUp2+ "                        ");
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();

                System.out.println();
                System.out.println("SECOND SOLUTION");
                System.out.println();
                System.out.println("x = "+valueFin2);
                System.out.println();

            } else {
                System.out.println();
                System.out.println("There are no real roots");
                System.out.println();
                System.out.println("     -" + valueB + " +- " + valueSq);
                System.out.println("x = -----------------------");
                System.out.println("            " + value2A + "                  ");
                System.out.println();
            }

        }

        //execution for the second choice - prime number
        if (numUserChoice == 2) {
            System.out.println("You picked: "+two + ", enter a number:");
            Scanner userInput2 = new Scanner(System.in);
            int value2 = userInput2.nextInt();

            boolean flag = false;
            for (int i = 2; i <= value2 / 2; ++i) { //checks if the number is divisible by any number in range
                // condition for non-prime number
                if (value2 % i == 0) {
                    flag = true; //determines number is not a prime number
                    break; //break loop
                }
            }
            double value22=value2/1;//value 2 is an int and double is needed for divBy3
            double divBy3=value22/3;
            if (!flag) //if is not divisible by any number, flag is false and number is a prime number.
                //output is shown as division by 1, then by itself
                System.out.println(+value2+"/"+1+"="+value2 / 1+", "+value2+"/"+value2+"="+value2/value2+
                        ", "+value2 + " is a prime number, the number is divisible only by 1 and itself.");

            else
                //output is shown as division by 3, then by 2 and in the end by itself
                System.out.println(+value2+"/3="+divBy3+
                        " ,"+value2+"/"+2+"="+value2/2+
                        " ,"+value2+"/"+value2+"="+value2/value2+", "+value2+ " is not a prime number, " +
                        "it is divisible by a number other than itself and 1 .");

        }


        //execution for the third choice - factorial
        if (numUserChoice == 3) {
            System.out.println("You picked: "+three + ", enter a number:");
            Scanner userInput3 = new Scanner(System.in);
            int value3 = userInput3.nextInt();
            int count;
            int factorial=1;
            for (count=value3; count>1; count--)
            {
                factorial = factorial*count;
                System.out.print(count);
                if(count > 2)
                    System.out.print(" * ");
            }
            System.out.println(" = "+factorial);
            System.out.println("Factorial of "+value3+"! is "+factorial);
            System.out.println();

        }
        //execution for the fourth choice - right triangle
        if (numUserChoice == 4) {
            System.out.println("You picked: "+four);
            System.out.println("       A");
            System.out.println("       |");
            System.out.println("      /|");
            System.out.println("     / |");
            System.out.println(" c  /  | b");
            System.out.println("   /   |");
            System.out.println("B / _ _| C");
            System.out.println("   a   ");
            System.out.println("Please pick the number of what you need:");
            System.out.println("1 You have the length of the sides a and b and need to find c.");
            System.out.println("2 You have the length of the sides a and c and need to find b.");
            System.out.println("3 You have the length of the sides b and c and need to find a.");

            Scanner userInput4 = new Scanner(System.in);  // Create a Scanner object
            String userChoice4 = userInput4.nextLine();  // Read user input 4 and store it as user choice 4
            int numUserChoice4=Integer.parseInt(userChoice4); // String is converted to integer

            if (numUserChoice4 == 1) { //choice 1 for right triangle
                System.out.println("Enter value for side a");
                Scanner userInput4a = new Scanner(System.in);
                String userChoice4a = userInput4a.nextLine();
                double numUserChoice4a=Double.parseDouble(userChoice4a); //convert input to double
                System.out.println("Enter value for side b");
                Scanner userInput4b = new Scanner(System.in);
                String userChoice4b = userInput4b.nextLine();
                double numUserChoice4b=Double.parseDouble(userChoice4b);

                double numUserChoice4aSq= numUserChoice4a * numUserChoice4a;
                double numUserChoice4bSq= numUserChoice4b * numUserChoice4b;
                double numUserChoice4cSq= (numUserChoice4aSq+numUserChoice4bSq);
                double numUserChoice4c=Math.sqrt(numUserChoice4cSq);
                System.out.println("----------------------------------------------");
                System.out.println("We find the length of c with Pythagorean theorem c^2=a^2+b^2 " +
                        "--> c^2=["+numUserChoice4a+"]^2+["+numUserChoice4b+"]^2" +
                                "--> c^2="+numUserChoice4aSq+"+"+numUserChoice4bSq);
                double numUserChoice4Sq= numUserChoice4aSq + numUserChoice4bSq;
                System.out.println("c^2="+numUserChoice4Sq);
                System.out.println("c=sqrt["+numUserChoice4Sq+"]");
                System.out.println("c="+numUserChoice4c);
                System.out.println("----------------------------------------------");

                System.out.println("                        A");
                System.out.println("                        |");
                System.out.println("                       /|");
                System.out.println("                      / |");
                System.out.println("          "+numUserChoice4c+"                 "+numUserChoice4b+"");
                System.out.println("                    /   |");
                System.out.println("                 B / _ _| C");
                System.out.println("                    "  +numUserChoice4a+  "");


                double angleA = Math.asin(numUserChoice4a/numUserChoice4c);
                System.out.println("Angle A=sin[a/c]=sin^(-1)["+numUserChoice4a+"/"+numUserChoice4c+"]="+Math.toDegrees(angleA)+" degrees");
                double angleB = Math.asin(numUserChoice4b/numUserChoice4c);
                System.out.println("Angle B=sin[b/c]=sin^(-1)["+numUserChoice4b+"/"+numUserChoice4c+"]="+Math.toDegrees(angleB)+" degrees");
                System.out.println("Angle of C has to be 90 degrees.");
                System.out.println("----------------------------------------------");
            }
            if (numUserChoice4 == 2) { //choice 2 for right triangle
                System.out.println("Enter value for side a");
                Scanner userInput4a = new Scanner(System.in);
                String userChoice4a = userInput4a.nextLine();
                double numUserChoice4a=Double.parseDouble(userChoice4a); //convert input to double
                System.out.println("Enter value for side c");
                Scanner userInput4c = new Scanner(System.in);
                String userChoice4c = userInput4c.nextLine();
                double numUserChoice4c=Double.parseDouble(userChoice4c);

                double numUserChoice4aSq= numUserChoice4a * numUserChoice4a;
                double numUserChoice4cSq= numUserChoice4c * numUserChoice4c;
                double numUserChoice4bSq= (numUserChoice4cSq-numUserChoice4aSq);
                double numUserChoice4b=Math.sqrt(numUserChoice4bSq);
                System.out.println("----------------------------------------------");
                System.out.println("We find the length of b with Pythagorean theorem b^2=c^2-a^2 " +
                        "--> b^2=["+numUserChoice4c+"]^2-["+numUserChoice4a+"]^2" +
                        "--> b^2="+numUserChoice4cSq+"+"+numUserChoice4aSq);
                double numUserChoice4Sq= numUserChoice4cSq - numUserChoice4aSq;
                System.out.println("b^2="+numUserChoice4Sq);
                System.out.println("b=sqrt["+numUserChoice4Sq+"]");
                System.out.println("b="+numUserChoice4b);
                System.out.println("----------------------------------------------");

                System.out.println("                        A");
                System.out.println("                        |");
                System.out.println("                       /|");
                System.out.println("                      / |");
                System.out.println("          "+numUserChoice4c+"                 "+numUserChoice4b+"");
                System.out.println("                    /   |");
                System.out.println("                 B / _ _| C");
                System.out.println("                    "  +numUserChoice4a+  "");

                double angleA = Math.asin(numUserChoice4a/numUserChoice4c);
                System.out.println("Angle A=sin[a/c]=sin^(-1)["+numUserChoice4a+"/"+numUserChoice4c+"]="+Math.toDegrees(angleA)+" degrees");
                double angleB = Math.asin(numUserChoice4b/numUserChoice4c);
                System.out.println("Angle B=sin[b/c]=sin^(-1)["+numUserChoice4b+"/"+numUserChoice4c+"]="+Math.toDegrees(angleB)+" degrees");
                System.out.println("Angle of C has to be 90 degrees.");
                System.out.println("----------------------------------------------");

            }
            if (numUserChoice4 == 3) {//choice 3 for right triangle
                System.out.println("Enter value for side b");
                Scanner userInput4b = new Scanner(System.in);
                String userChoice4b = userInput4b.nextLine();
                double numUserChoice4b=Double.parseDouble(userChoice4b); //convert input to double
                System.out.println("Enter value for side c");
                Scanner userInput4c = new Scanner(System.in);
                String userChoice4c = userInput4c.nextLine();
                double numUserChoice4c=Double.parseDouble(userChoice4c);

                double numUserChoice4bSq= numUserChoice4b * numUserChoice4b;
                double numUserChoice4cSq= numUserChoice4c * numUserChoice4c;
                double numUserChoice4aSq= (numUserChoice4cSq-numUserChoice4bSq);
                double numUserChoice4a=Math.sqrt(numUserChoice4aSq);
                System.out.println("----------------------------------------------");
                System.out.println("We find the length of a with Pythagorean theorem a^2=c^2-b^2 " +
                        "--> a^2=["+numUserChoice4c+"]^2-["+numUserChoice4b+"]^2" +
                        "--> a^2="+numUserChoice4cSq+"-"+numUserChoice4bSq);
                double numUserChoice4Sq= numUserChoice4cSq - numUserChoice4bSq;
                System.out.println("a^2="+numUserChoice4Sq);
                System.out.println("a=sqrt["+numUserChoice4Sq+"]");
                System.out.println("a="+numUserChoice4a);
                System.out.println("----------------------------------------------");

                System.out.println("                        A");
                System.out.println("                        |");
                System.out.println("                       /|");
                System.out.println("                      / |");
                System.out.println("          "+numUserChoice4c+"                 "+numUserChoice4b+"");
                System.out.println("                    /   |");
                System.out.println("                 B / _ _| C");
                System.out.println("                    "  +numUserChoice4a+  "");

                double angleA = Math.asin(numUserChoice4a/numUserChoice4c);
                System.out.println("Angle A=sin[a/c]=sin^(-1)["+numUserChoice4a+"/"+numUserChoice4c+"]="+Math.toDegrees(angleA)+" degrees");
                double angleB = Math.asin(numUserChoice4b/numUserChoice4c);
                System.out.println("Angle B=sin[b/c]=sin^(-1)["+numUserChoice4b+"/"+numUserChoice4c+"]="+Math.toDegrees(angleB)+" degrees");
                System.out.println("Angle of C has to be 90 degrees.");
                System.out.println("----------------------------------------------");
            }



        }

    }
}

