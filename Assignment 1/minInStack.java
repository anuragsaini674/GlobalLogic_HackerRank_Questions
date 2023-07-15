/*You are given N elements and your task is to Implement a Stack in which you can get a minimum element in O(1) time.

Example 1:

Input:
push(2)
push(3)
pop()
getMin()
push(1)
getMin()
Output: 2 1
Explanation: In the first test case for
query 
push(2)  Insert 2 into the stack.
         The stack will be {2}
push(3)  Insert 3 into the stack.
         The stack will be {2 3}
pop()    Remove top element from stack 
         Poped element will be 3 the
         stack will be {2}
getMin() Return the minimum element
         min element will be 2 
push(1)  Insert 1 into the stack.
         The stack will be {2 1}
getMin() Return the minimum element
         min element will be 1
Your Task:
You are required to complete the three methods push() which takes one argument an integer 'x' to be pushed into the stack, pop() which returns an integer popped out from the stack, and getMin() which returns the min element from the stack. (-1 will be returned if for pop() and getMin() the stack is empty.)

 */
public class minInStack {
    class GfG
{
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
        s = new Stack<Integer>();
        
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    minEle = Integer.MAX_VALUE;
	    if(s.empty()){
	        return -1;
	    }
	    for(int i=0;i<s.size();i++){
	        minEle = Math.min(minEle, s.get(i));
	    }
	    return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	    if(s.empty()){
	        return -1;
	    }
	    int n = s.peek();
	    s.pop();
	    return n;
	
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
    
	    s.push(x);
    }	
}


}
