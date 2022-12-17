package HW2;

import javax.xml.stream.events.Namespace;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

     //method that will calculate the Pythagorean Theorem c = sqrt(a^2+b^2) ( needed help)


//Program : Pythagorean Theorem 

public static void main(String[] args) {
#include <iostream>
#include <math.h>

using Namespace std;

void main ()

{

        float a, b, c;

        cout << "Please input the values of a and b: ";
        cin >> a >> b;

        c = a*a + b*b;
        c = sqrt(c) ; 

        cout << The Hypotenuse of the triangle is: " << c << '.' <<endl;

        system('Pause") ; 
}}
    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

        Dim grade as decimals

        grade = Val(txtMark.text)

        If (grade>=90) Then lbl.Grade.Text - "A"
        If (grade<=89) Then lbl.Grade.Text - "B"
        If (grade<=79) Then lbl.Grade.Text - "C"
        If (grade<=69.3) Then lbl.Grade.Text -"C-"
        If (grade<=69) Then lbl.Grade.Text - "d"
        If (grade<=60) Then lbl.Grade.Text - "F"



    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    
    Dim amt, tipPercent, tipAmt As double
    amt = txtBill.Text 
    tipPercent = txtTipPercent.Text / 100
    '$100 if tip percent was 18%
    'What is 18% of $100
    '18% * 100 
    '18/100 * 100
    '.18 * 100'
    tipAmt = amt * tipPercent
    txtTipAmount.Text = tip Amt 

               
