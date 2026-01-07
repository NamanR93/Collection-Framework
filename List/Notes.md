# Collection frameworks:

- Collection: It is the single entity  or object which stores multiple data
framework: represents the library.

- It is the set of predefined classes and interfaces which is used to store multiple data.

- It contains two main parts:
      1. java.util.Collection
      2. java.util.Map

## Arrays vs collections framework

1. Array store primitve and non primitives ds ---------VS--------- collections store only non primitive ds

2. we store here only homogenous(same) type of data. -------VS-------  store heterogeneous(different)

3. we cannot increase the size of arrys ------- VS------- we can inc or dec the size of collections at runtime.

4. Arrays are inbuilt feature of Java and thus we have to develop algorithm------  VS-----------collection fram. is an API, which provides predefined classes , Interfaces and methods.

- Collection is an Interface which is present in util package.
Since Collection is interface we cant create object, so we have to use implemented class for that.

Methods:
1. -- al.add(obj o)
2. -- al.addAll(collection c)
3. -- al.contains(obj o)
4. -- al.isEmpty()
5. -- al.size()
6. -- al.remove()   // works diff --- if provide obj then works as Collection methods, if provide .remove(i) works as in
  - arrayList method
7. -- al.removeAll(al2) : removes the common elements.
8. -- al.clear(): prints the empty.

# Diff btw Set nd List

- it is an index based data strucutre  --- it stores value acc. to the hash value
- it can store duplicate element vs it doesnt not allows duplicates
- it can store any number of null values--- it store only one null value
- list follows the insertion order --- set does not follow the insertion order
- use iterator and listIterator to get elements ---- here we use iterator.
- 


# List or Set interface the ek method hota h interator jo Iterator interface m value return krta h.
Iterator itr = list1.iterator();
Now in case of iterator it has 3 methods: hasNext(), 

List m bs ListIterator ltr = list1.listIterator(); // this provides methods for both forwrd and backwrd.

while(itr.hasNext()){
sop(itr.next())
}


TO Retrieve the data we use cursors. there r types of cursors
1.Iterator
2.ListIterator
3.Enumeration

# List vs ListIterator

1. .iterator() method ------ .listIterator() method
2. can us used with any collection object ---------only used with the List implemented classes
3. has 3 methods: hasNext(), next(), remove() --------it has 3 + hasPrevious(), previous(), set()
4.we can ready and remove using iterator -----------we can read, remove, replace and add the elements.


# Enumeration: can only be used with legacy classes i.e, Vector and Stack.
- Enumeration e = v.elements();
- Methods of Enumeration cursor are: hasMoreElements(), nextElement()
- Enumeration cursor can be used to retrieve the elements only in forward direction.
- only used to read operation.


# ArrayList: implemented class of List interface

- follows the insertion order
- non synchronized

# LinkedList: it implements List, deque

The underline data structure of linked list is: " doubly linked list" or "circular linked list"
- It is index based DS
- It can store diff data types, duplicates and mul. null values
- it follows the insertion order.
- Insertion and deletion operations are efficient and fast.
- we can traverse from both front and backwrd direction.
-- 
      

# Vector:

- It is the part of the java util package and is one of the legacy classes in java that implements the list interface.
- It is still useful in some certain scenarios, particularly in  multi-threaded environments where thread safety is a concern.
- It is similar to ArrayList but with synchronized methods, making it thread-safe. 

# Dynamic Feature:

- Vector is a dynamic array that can grow or shrink in size as needed.
- Synchronize, Legacy class, Resizing Mechanism, Thread-Safe.

# Constructors of vector:

- Vector(): It creates an empty vector with an initial capacity of 10.
- Vector(int initialCapacity): It creates an empty vector with the specified initial capacity.
- Vector(int initialCapacity, int capacityIncrement): It creates an empty vector with the specified initial capacity and capacity increment.
- Vector (Collection<? extends E> c): It creates a vector containing the elements of the specified  collection


# Methods in Vector:

- add(E e): adds an element at the end.
- add(int index, E element): inserts an element at the specific index
- get(int index, E element): retrieves the element.
- set(int index, E element): replace an element at specific index.
- remove(int index): removes element at specfied index
- remove( Object o): removes first occurence of specified element.
- size()
- isEmpty()
- contains(Object o)
- clear()



# Stack:

- works on the principal LIFO (Last in first out)
- Since it extends Vector, it is synchronized, making it thread-safe.
- we can use LinkedList as stack.

#CopyonWriteArrayList:

- It means whenever there is write operation, like adding or removing an element innstead of directly modifying the existing list,
- a new copy of list is created, and the modification is applied to that copy
- This ensures that the other threads reading the list while its being modified are unaffected.

- Write: A new copy of the list is created for every modification.
          The reference to the list is then updated so that subsequent reads use this new list.