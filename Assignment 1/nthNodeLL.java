/*Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8. */


public class nthNodeLL {
    class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int count = 0;
    	Node temp=head;
    	while(temp!= null){
    	    temp=temp.next;
    	    count++;
    	}
    	if(n>count){
    	    return -1;
    	}
    	count=count-n+1;
    	temp= head;
    	for(int i=0;i<count;i++){
    	    if(i!=count-1){
    	        temp = temp.next;
    	    }
    	    else{
    	        break;
    	    }
    	}
    	return temp.data;
    }
}
    
}
