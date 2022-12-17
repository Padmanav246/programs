package collection;
import java.util.LinkedList;
import java.util.*;

public class Linked {
	public static void main(String...strings)
	{
		LinkedList<Integer> ll=new LinkedList<Integer>(                                                                                                                                                                                                                                                                    );
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			ll.add(arr[i]);
		}
		
		 Collection<Integer> collect = new ArrayList<Integer>();
		 collect.add(11);                                                                                                            
		 collect.add(12);
		 collect.add(13);
		 collect.add(14);

		
//		add(int index, E element)	This method Inserts the specified element at the specified position in this list.
//		ll.add(9,10);
		
				
//		add(E e)	This method Appends the specified element to the end of this list.		
//		ll.add(10);

		
//		addAll(int index, Collection<E> c)	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.
//		ll.addAll(3,collect);
		 
//		 addAll(Collection<E> c)	This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
//		 ll.addAll(collect);
		 
//		 addFirst(E e)	This method Inserts the specified element at the beginning of this list.
//		 ll.addFirst(10);
		 
//		 addLast(E e)	This method Appends the specified element to the end of this list.
//		 ll.addLast(10);
		 
//		 clear()	This method removes all of the elements from this list.
//		 ll.clear();
		 
//		 clone()	This method returns a shallow copy of this LinkedList.
//		 LinkedList l1=new LinkedList();
//		 l1=(LinkedList) ll.clone();	
		 
//		 contains(Object o)	This method returns true if this list contains the specified element.
//		 System.out.println(ll.contains(1));
		 
//		 descendingIterator()	This method returns an iterator over the elements in this deque in reverse sequential order.
		 Iterator itr=ll.descendingIterator();
		 while(itr.hasNext())
		 {
			 System.out.print("  "+itr.next());
		 }
		 
//		 element()	This method retrieves but does not remove, the head (first element) of this list.
//		 System.out.println(ll.element());
		 
//		 get(int index)	This method returns the element at the specified position in this list.
//		 System.out.print(ll.get(2));
		 
//		 offerFirst(E e)	This method Inserts the specified element at the front of this list.
//		 ll.offerFirst(11);\
		 
//		 int[] arr1=new int[10];
//		 ll.toArray(arr1);
		 System.out.println(ll);		
	}
}
