/*Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 

Example 1:

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4 */
public class StackUsingLL {
    class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    StackNode head = null;
    void push(int a) 
    {   
        StackNode newNode = new StackNode(a);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        // Add your code here
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(head==null){
            return -1;
        }
        else{
        
            int n = head.data;
            head = head.next;
            return n;
            
        }
    }
}
}
