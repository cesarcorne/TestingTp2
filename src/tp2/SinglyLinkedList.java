package tp2;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;


/**
 * Class  SinglyLinkedList defines Singly linked List
 * @author 
 */
public class SinglyLinkedList implements Serializable{


	public  static final long serialVersionUID = 1;  

	Entry header;
	int size = 0;


	public  SinglyLinkedList(){
		header = new Entry();
		size = 0;	
	} 

	public IP get(int index){
		Entry current = header.next;
		int i = 0;
		while(current!=null && i< index){
			current = current .next;
			i++;
		}
		if(current!=null){
			return current.element;
		}
		return null;
	} 
	
	public boolean contains(IP ip){
		Entry current = header.next;
		while(current!=null){
			if(current.element.equals(ip))
				return true;
			current = current.next;
		}
		return false;
	} 
	
	//add the new IP at the first position.
	public void add (IP ip){
		Entry n = new Entry();
		n.element = new IP(ip.getFirst(), ip.getSecond(), ip.getThird(), ip.getFourth());
		Entry nn = header.next;
		n.next = nn;
		header.next = n;
		size++;
	} 
	
	 /**
     * This method removes a given IP iff it belongs to the current list.
     */
    public boolean remove(IP value){
    	if(!contains(value))
    		return false;
    	
    	Entry current = header.next.next;	
    	Entry prev = header.next;
    	while(current!=null){
    			if(current.element.equals(value)){
    				//remove ip
    				prev.next = current.next;
    				break;
    			}
    			current = current.next;
    			prev = prev.next;
       	} 
    	return true;
    }



	public int getSize(){
		return size;
	}

	/**
	 * Checks whether or not the current list has not elements.
	 * @return true iff the current list is empty, false otherwise.
	 */
	public boolean isEmpty(){
		return header.next== null;
	}



	

	public String toString() {
		String res = "(";
		if (header != null) {
			Entry cur = header.next;
			while (cur != null && cur != header) {
				res += cur.toString();
				cur = cur.next;
			}
		}
		return res + ")";
	}

}//End Class
