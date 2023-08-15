//TASK -1 WORD GAME
import java.util.Scanner;

public class Codesoft1 {
    public static void Numberguess(){
        //NUMBER GUESS GAME
        //CREATING A RANDOM NUMBER IN ORDER TO PLAY A GAME;

int randomnumber = (int)Math.random()*100;
Scanner sc= new Scanner(System.in);

//j trials;

int j=5,i;

System.out.println("----------WELCOME TO NUMBER GUESS GAME---------");
System.out.println();
System.out.println("*****game rules are as Follows****:");
System.out.println();
System.out.println("1)You are supposed to be guess a number between 1 to 100 numbers" );
System.out.println("2)You have got 5 chances of guessing the number" );
System.out.println("3)You will be getting cash reward of rs 1000 if u guess it on the first attempt");
System.out.println("4)If u have guessed the correct number within the given trials you will win the game");
            System.out.println();
  for(i=0;i<j;i++){
   System.out.println();   
System.out.println("Input your number here :-");

int n=sc.nextInt();

if(n == randomnumber){
    System.out.println("You have guessed the correct number"+"Congratulations you have won a cash reward of 1000rs");
    break;
}
else if(n < randomnumber && i != j){
    System.out.println("Your guess is less than random number"+"you are supposed to guess greater value than"+ n);
}
else{
    System.out.println("Your guess is greater than random number"+" you are supposed to guess lesser value than"+ n);
}
}

if(i == j ){
    System.out.println("You have Reached the maximimum limit"+","+" Sorry you are out of the game");
    System.out.println("the number was"+" "+randomnumber);
}
    }

    public static void main(String args[]){
        Numberguess();
    }
} 









