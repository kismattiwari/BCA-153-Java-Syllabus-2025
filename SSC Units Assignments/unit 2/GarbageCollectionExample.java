public class GarbageCollectionExample { 
public static void main(String[] args) { 
// Creating objects 
GarbageCollectionExample obj1 = new GarbageCollectionExample(); 
GarbageCollectionExample obj2 = new GarbageCollectionExample(); 
// Making obj1 eligible for garbage collection 
obj1 = null; 
// Requesting garbage collection 
System.gc(); 
System.out.println("Garbage collection requested."); 
} 
// finalize() method is called before object is destroyed 
@Override 
protected void finalize() { 
System.out.println("Garbage collector called. Object destroyed."); 
} 
}