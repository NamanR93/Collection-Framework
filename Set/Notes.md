## Set

- Unlike a List, a Set does not allow duplicates, and it does not preserve the order of  elements (unless you're using TreeSet or LinkedHashSet).

- Set is a collection that cannot contain duplicate elements plus multiple null values
- faster operations
- Hashset doesnt follow insertion order, also sorting order 
- Set ---> Hashset(unordered), LinkedHashSet(Ordered), TreeSet, EnumSet
- we can provide other collections as well using addAll method.

## HashSet:
- It contains unique element.
- It does not care about order
- Now we  can use methods like add(), contains(), and remove() to manage your collection of unique elements. All take O(1).

## Tip: Use HashSet when you care about speed, and TreeSet when you need sorted elements.

## TreeSet

- TreeSet is the direct implemented class of Navigable set but indirectly implements sortedSet & Set interface.

- It stores elements of same type, but not duplicates and null values.
- It is not an index based DS
- Not follow insertion order.
- follows the sorting order. ( while retrieving they will return in sorting order)
- Its not synchronized.

## LinkedHashSet

- Tip: Use LinkedHashSet when you want a set that does not allow duplicates and keeps the original insertion order.
-  The elements will appear in the order they were added( cuz of doubly linked list)

- HashSet & LinkedHashSet allow null at key, TreeSet not.
- Hashset- random, LinkedHashset- insertion order, Tree- sorted order