# Internal Structure of Hashmap

1. Key: the identifier used to retrieve the value
2. Value: data associated with value
3. Bucket: place where key-value are stored. Think of buckets as cells in a list (array).
4. Hash function: convert key into index for storage.

# LinkedHashMap:

-- A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.


# Difference: 

Feature	             HashMap	                                 LinkedHashMap
Order	          No guaranteed order                     	Insertion order preserved
Performance	  Faster for random access	              Slightly slower due to ordering
Duplicates	    Keys must be unique	                        Keys must be unique

# Example of LRUcache: 
-- suppose there r 3 entries, as we add the 4th one, the least recently used will be removed.
