# Technical Test


## Program instructions to run
You have to install the Java Development Kit.
[You can install the JDK here](https://www.oracle.com/es/java/technologies/downloads/). 
Open the command prompt and go to the directory where the .java is saved. After that, type the command 'javac App.java' to compile the code. Finally, you just need to type 'java App' to run the program. If you don't want to compile the code, I will upload the compiled file to the repository. Now, you can type the inputs to test the program.

## Details about the logic and the code
### Constraints
When N or M are less than 1, they will take the value of 1. When N or M are greater than 100000, the will take the value of 100000. 
When M is greater than N, M will take the value of N. 

### Logic
To get the number of unique numbers, you just need to remove the duplicate elements in the sub array. When you have cleaned up the sub array, you just need to get its size and compare it to the maximum unique value. If the size is bigger, the new maximun unique value is the size. 
