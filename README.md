Introduction to Computer Science 1 Project 2
========================================================================================

**This project evaluates the following skills.**

The student should be able to:

-   Write code to perform simple repetition
-   Write static methods
-   Use static methods


**This project needs the following skills.**

The student should already know how to:

-   Declare and define identifiers of primitive data types
-   Prompt users for data and input it
-   Write basic Java code for static methods
-   Write basic Java code to perform a loop  (use  **for loop**)
-   Write basic Java code to make simple decisions (  **if..then..else**)

The Project
===========
There are 2 specific .java files you will need to write for this project:  Proj2.java  and MathStats.java. The first one is your "driver", the one that contains  **main**. In it will be your primary instructions for the project. In the second file, will be methods that will all be NON-**static**  (for THIS project). You are to write the code for both  .java files.  You will write ONE public and static method which will be below main,  +**menu():int**.  Thus, in main you will have to create an instance of the MathStats class and use the reference variable throughout the program to access the methods. For example, you would have something like:

MathStats ms1= new MathStats( ); //creates both the reference variable and the instance

Then, using any method from the class from an external file (e.g. calling a method from **main** which is in the Proj2 class would have to use the reference variable. However, any method within the MathStats class that wants to use the method does NOT have to use the reference variable.\
Calling from **main**:      iVal = ms1.getScore();

Calling from another method in the MathStats class:   iVal = getScore();

**Methods you have to write for this project and their descriptions**           

**+menu( ):int**            This method will display the below menu:\
![](file:///C:/Users/adams/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

In main, call the menu method. The method displays the above menu, and returns the user's choice to main. Then, back in **main**, based on the value returned from this method execute the appropriate instructions (you will need to use either if-then-elses or you could use a switch statement (if you want to read ahead) . 

If the value returned from the menu method is any number other than 1-6, display the error message
You entered an invalid choice
