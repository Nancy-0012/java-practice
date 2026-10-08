# java-practice
A.1 Bicycle Rental

2. What the program do:
The Bicycle Rental program calculates thr total amount a customer has to pay for renting a bicycle based on the starting  hour and ending hour
 The program:

- Takes the starting and ending hours from the user.
- Checks whether the entered hours are valid.
- Uses a "for" loop to go through each rental hour.
- Assigns a rental rate depending on the hour.
- Adds all the hourly rates together.
- Displays the total amount to be paid in RWF.

1. Importing Scanner

import java.util.Scanner;

This line imports the "Scanner" class from Java.

"Scanner" is used to allow the program to receive input from the user through the keyboard.

2. Declaring the Class

public class BicycleRental{

This declares a class called "BicycleRental".

The class contains the whole program.

3. Main Method

public static void main(String [] args){

The "main" method is where the execution of the Java program starts.

4. Creating the Scanner

Scanner y = new Scanner(System.in);

This creates a "Scanner" object called "y".

It allows the program to read information entered by the user.

5. Declaring Variables

int start;
int end;
int rate;
int total = 0;

These variables store information used by the program:

- "start" stores the starting rental hour.
- "end" stores the ending rental hour.
- "rate" stores the price for each rental hour.
- "total" stores the total amount to be paid.

"total" starts at "0" because the program has not calculated any rental cost yet.

6. Asking for the Starting and Ending Hours

System.out.println("enter the starting hour: ");
start = y.nextInt();

System.out.println("enter the ending hour: ");
end = y.nextInt();

The program asks the user to enter the starting hour and the ending hour.

"y.nextInt()" reads the integer entered by the user and stores it in the corresponding variable.

7. Checking if the Input is Valid

if((start<0||start>23) || (end<1||end>24) || (start>=end)){
    System.out.println("invalid inputed hour");
}

This "if" statement checks whether the hours entered by the user are valid.

The conditions mean:

- "start < 0" → the starting hour cannot be below 0.
- "start > 23" → the starting hour cannot be above 23.
- "end < 1" → the ending hour cannot be below 1.
- "end > 24" → the ending hour cannot be above 24.
- "start >= end" → the starting hour must be earlier than the ending hour.

If any of these conditions is true, the program displays "invalid inputed hour".

8. Calculating the Rental Cost

else {
    for(int i=start; i<end; i++){

The "else" part runs when the entered hours are valid.

The "for" loop goes through every rental hour, starting from "start" and continuing until the hour before "end".

The variable "i" represents the current rental hour.

9. Assigning the Rental Rate

if(i<7){
    rate=500;
}
else if(i<14){
    rate=1000;
}
else if(i<19){
    rate=1500;
}
else if(i<21){
    rate=1000;
}
else {
    rate=500;
}

These conditions determine the rental price for each hour.

Hour| Rate per hour
0–7| 500 RWF
7–14| 1000 RWF
14–19| 1500 RWF
19–21| 1000 RWF
21–24| 500 RWF

The program checks the current hour "i" and assigns the correct rate to the "rate" variable.

10. Adding the Rate to the Total

total = total + rate;

This adds the rate of the current hour to the total amount.

The process is repeated by the "for" loop until all rental hours have been calculated.

11. Displaying the Total Amount

System.out.println("Total amount to be paid is: "+total+"RWF");

After calculating all the rental hours, the program displays the total amount that the customer has to pay in RWF.

Conclusion

The Bicycle Rental program uses input, variables, conditional statements, and a "for" loop to calculate the rental cost. It also validates the user's input before performing the calculation

B.1 Mushroom Identification

2. What the program do:
The Mushroom Identification program identifies a type of mushroom based on characteristics provided by the user.

The program first asks whether the mushroom grows in a forest and whether it has a convex cup. Depending on the answers, it may ask an additional question about whether the mushroom has a ring or gills.

Finally, the program displays the name of the identified mushroom.

3. Importing Scanner

import java.util.Scanner;

This imports the "Scanner" class, which allows the program to receive input from the user.

4. Declaring the Class

public class Mushroom{

This declares a class called "Mushroom".

5. Main Method
public static void main(String[] args) {

The "main" method is where the Java program starts running.

6. Creating the Scanner

Scanner p = new Scanner(System.in);

This creates a "Scanner" object called "p".

It is used to read the user's answers.

7. Declaring Variables

int forest;
int convex;
int ring;
int gills;

These variables store the user's answers about the mushroom.

- "forest" stores whether the mushroom grows in a forest.
- "convex" stores whether the mushroom has a convex cup.
- "ring" stores whether the mushroom has a ring.
- "gills" stores whether the mushroom has gills.

The program uses "1" for yes and "0" for no.

8. Asking the First Two Questions

System.out.println("Does the mushroom grow in forest?(1=yes,0=no): ");
forest=p.nextInt();

System.out.println("Does the mushroom have a convex cup?(1=yes,0=no): ");
convex=p.nextInt();

The program asks the user two questions:

1. Does the mushroom grow in a forest?
2. Does the mushroom have a convex cup?

The answers are stored in the "forest" and "convex" variables.

9. First Decision

if(forest ==0 && convex ==1 ){
   System.out.println("your mushroom is Agaric jaunissant");
}

The program checks whether:

- The mushroom does not grow in a forest ("forest == 0").
- The mushroom has a convex cup ("convex == 1").

The "&&" operator means both conditions must be true.

If both conditions are true, the program identifies the mushroom as Agaric jaunissant.

10. Second Decision

else if (forest==0 && convex ==0){
   System.out.println(" your mushroom is Coprin chevelu");
}

If the previous condition is false, the program checks whether:

- The mushroom does not grow in a forest.
- The mushroom does not have a convex cup.

If both are true, the program identifies it as Coprin chevelu.

11. Checking for a Ring

else if(forest==1 && convex==1){
    System.out.println(" Does it have a ring?(1=yes,0=no): ");
    ring= p.nextInt();

If the mushroom grows in a forest and has a convex cup, the program asks another question:

Does it have a ring?

The answer is stored in the "ring" variable.

The program then uses another "if" statement to identify the mushroom.

if (ring ==1){
    System.out.println(" your mushroom is Amanite tue-mouche");
}
else if(ring ==0){
    System.out.println(" your mushroom is pied bleu");
}

If "ring" is "1", the mushroom is identified as Amanite tue-mouche.

If "ring" is "0", the mushroom is identified as Pied bleu.

12. Checking for Gills

else if (forest ==1 && convex ==0){
    System.out.println("Does it have gills?(1=yes,0=no):");
    gills=p.nextInt();

If the mushroom grows in a forest but does not have a convex cup, the program asks:

Does it have gills?

The answer is stored in the "gills" variable.

The program then checks the answer.

if(gills==1){
    System.out.println(" your mushroom is Girolle");
}
else{
    System.out.println(" your mushroom is Cepe fe bordeaux");
}

If "gills" is "1", the mushroom is identified as Girolle.

If the answer is not "1", the "else" statement identifies it as Cepe de bordeaux.

13. Decision Structure

The program can be summarized as follows:

Forest| Convex cup| Additional question| Result
No| Yes| None| Agaric jaunissant
No| No| None| Coprin chevelu
Yes| Yes| Ring?| Amanite tue-mouche / Pied bleu
Yes| No| Gills?| Girolle / Cepe de bordeaux

Conclusion

The Mushroom Identification program uses variables, user input, "if", "else if", "else", and logical operators to identify a mushroom.

The program does not ask every question to every user. Instead, the next question depends on the answers given previously. This makes the program use a decision-making structure.