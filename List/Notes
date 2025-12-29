# Vector:

-- It is the part of the java util package and is one of the legacy classes in java that implements the list interface.
-- It is still useful in some certain scenarios, particularly in  multi-threaded environments where thread safety is a concern.
-- It is similar to ArrayList but with synchronized methods, making it thread-safe. 

# Dynamic Feature:

-- Vector is a dynamic array that can grow or shrink in size as needed.
-- Synchronize, Legacy class, Resizing Mechanism, Thread-Safe.

# Constructors of vector:

-- Vector(): It creates an empty vector with an initial capacity of 10.
-- Vector(int initialCapacity): It creates an empty vector with the specified initial capacity.
-- Vector(int initialCapacity, int capacityIncrement): It creates an empty vector with the specified initial capacity and capacity increment.
-- Vector (Collection<? extends E> c): It creates a vector containing the elements of the specified  collection


# Methods in Vector:

-- add(E e): adds an element at the end.
-- add(int index, E element): inserts an element at the specific index
-- get(int index, E element): retrieves the element.
-- set(int index, E element): replace an element at specific index.
-- remove(int index): removes element at specfied index
-- remove( Object o): removes first occurence of specified element.
-- size()
-- isEmpty()
-- contains(Object o)
-- clear()



# Stack:

-- works on the principal LIFO (Last in first out)
-- Since it extends Vector, it is synchronized, making it thread-safe.
-- we can use LinkedList as stack.

#CopyonWriteArrayList:

-- It means whenever there is write operation, like adding or removing an element innstead of directly modifying the existing list,
-- a new copy of list is created, and the modification is applied to that copy
-- This ensures that the other threads reading the list while its being modified are unaffected.

-- Write: A new copy of the list is created for every modification.
          The reference to the list is then updated so that subsequent reads use this new list.