/* This program tests your understanding of using static methods and println statements.
You should write a Java class called OldLady that should be saved into a file called
OldLady.java. Your program should produce the following song as output:

There was an old lady who swallowed a fly.
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old lady who swallowed a spider,
That wriggled and iggled and jiggled inside her.
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old lady who swallowed a bird,
How absurd to swallow a bird.
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old lady who swallowed a cat,
Imagine that to swallow a cat.
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old lady who swallowed a dog,
What a hog to swallow a dog.
She swallowed the dog to catch the cat,
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die. 

There was an old lady who swallowed a horse,
She died of course.

You should exactly reproduce the format of this output. This includes having identical
wording, spelling, spacing, punctuation, and capitalization. You may include a blank line
at the very end of the output if you like. 

System.out.println(""); 


*/


public class Oldlady {

	public static void main(String[] args) {
	System.out.println("There was an old lady who swallowed a fly.");
    Die();
    Spider();
 
    Bird();
    Cat();
    Dog();
  
   
    
    dog();
    cat();
    bird();
    fly();
    Horse();
    
	}
	public static void Die() {
		System.out.println("I don't know why she swallowed that fly,\n"
				+ "Perhaps she'll die. ");
		 System.out.println();
		}
	
	public static void Spider() { 
		System.out.println("There was an old lady who swallowed a spider,\n"
				+ "That wriggled and iggled and jiggled inside her.");
		fly();
	}
	public static void Bird() {
		System.out.println("There was an old lady who swallowed a bird,\n"
				+ "How absurd to swallow a bird."); 
		bird();
		fly();
	}
	
	public static void Cat() {
		System.out.println("There was an old lady who swallowed a cat,\n"
				+ "Imagine that to swallow a cat.");
		cat();
		bird();
		fly();
		
	}
	
	public static void Dog() {
		System.out.println("There was an old lady who swallowed a dog,\n"
				+ "What a hog to swallow a dog.");
	}
	public static void Horse() {
		System.out.println("There was an old lady who swallowed a horse,\n"
				+ "She died of course.");
	}
	public static void fly() {
		System.out.println("She swallowed the spider to catch the fly,");
	    Die();
	}
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
} 



	
