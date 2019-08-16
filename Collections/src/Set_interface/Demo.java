package Set_interface;

import java.util.HashSet;
import java.util.Set;
class Demo
{
	public static  void main(String[] args)
	{
		Set<Book> set=new HashSet<>();
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"c","Galvin","Wiley",6);  
	    
	    set.add(b1);
	    set.add(b2);
	    set.add(b3);
	    
	   // set.add(new Book(104,"Let us C++","Yashwant Kanetkar","BPB",8)   );
	  
	    System.out.println(set);
	    
	    for(Book b:set)
	    {
	    	System.out.println(b.author+" "+b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
	    }
	
	  set.removeAll(set);
	  System.out.println("After removing");
	  
	  for(Book b:set)
	  {
		  System.out.println(b.author+" "+b.id+" "+b.name+" "+b.publisher+" "+b.quantity); 
	  }
	}
}
