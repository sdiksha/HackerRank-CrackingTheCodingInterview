//https://www.hackerrank.com/challenges/ctci-linked-list-cycle
public class Node
{
	int data;
    Node next;
    
    public boolean hasCycle(Node head) 
    {
    	boolean bCycle = true;
    	
    	if(head == null)
    	{
    		bCycle = false;
    	}
    	else
    	{
    		Node oneHopp = head;
    		Node twoHopp = head;
    		while(true)
    		{
    			oneHopp = oneHopp.next;
    			if(twoHopp.next.next != null)
    			{
    				twoHopp = twoHopp.next.next;
    			}
    			else
    			{
    				bCycle = false;
    				break;
    			}
    			
    			if (twoHopp == null || oneHopp == null)
    			{
    				bCycle = false;
    				break;
    			}

    			if(oneHopp == twoHopp)
    			{
    				bCycle = true;
    				break;
    			}
    		}
    	}
    	
    	return bCycle;
    }

}
