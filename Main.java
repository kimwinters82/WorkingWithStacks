import java.util.*;
import java.util.Stack;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // get user input 
    int length = sc.nextInt(); //N amount of statemets
    sc.nextLine(); //clear scanner  - moving from int to string
    Stack stack = new Stack(); //create stack object
    int largestNum = 0; //variable to store laregst num and print to screen 

    for (int i=0; i<length; i++){ // iterate through each input
      String [] input = sc.nextLine().split(" "); //separate letters from numbers
      if (input[0].equalsIgnoreCase("PUSH")){ //if letters equal push
        stack.push(Integer.parseInt(input[1])); //push to stack
      }
      else { //if letters equal pop
        if (!stack.isEmpty() && input[0].equalsIgnoreCase("POP")){
          //condition added to avoid error- popping off empty stack
          stack.pop();//remove top element
        }
        }
        }
    sc.close();//close scanner

    if (stack.isEmpty()){
      System.out.println("empty"); //in case stack is empty
    }
    else{ // stop looping when stack is empty
      while(!stack.isEmpty()){
        int temp = (Integer) stack.pop();//create variable to store popped element
        if (temp > largestNum){ //compare variable to largest num
          largestNum = temp;//update largest num if needed
        }
      }
      System.out.println(largestNum);//print answer
    }
}
}