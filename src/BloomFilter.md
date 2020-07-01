Bloom Filter:
=========

- Let's say we want perform string search {or column value search in a database}
- Google email service - which tells us weather a given User id already exists are not

How it searches in quick time ??
--------
Options:

1. List holding all the user names - bad choice O(n) time complexity
2. Hash table - time complexity is not always O(1) - in case of hash collision data gets stored in LinkedList which takes O(n) for searching

And the data/size of List or Hash table would so high, we can't store on single machine and even in distributed machines, data will be stored on Disk - And data reading from disk is not faster

**Bloom Filter** can help us here - It's a probabilistic data structure

#### How probabilistic??

When we check for a string value it can give us two ans:

- Present - 90% sure 
- Not Present - 100% sure 

* Since it won't tell us its present with 100% guarantee -- we call it probabilistic


    Bloom filter takes very less storage - hence we can store it in memory:
    
    It uses bit array or bit representation of collection to store in memory:


    let's say we have two hash functions
    ========
    
    fun1
    fun2
    
    Bit Array [0,0,0,0,......0] - 23 is the size of array 
    
    While storing:
    ======
    
    when we try to store below string, it will calculate the indxes using both the functions and make entry of 1 in bot array 
    
    ex: Ramesh ==>  fun1 - 3, fun2 - 6
        Mahesh ==>  fun1 - 4, fun2 - 9
        Suresh ==>  fun1 - 6, fun2 - 3
    
    while searching:
    =========
    
    Ramesh - 1,1 == 100% yes
    Somu   - 6,10 == 100% No 
    Raju   - 6,3  == may exists {this is how its probablistic in nature}

##### How much memory it takes to store records?

    40 million records
    Probability - 1 mistake in 10 million 
    Memory - 159 MB
    Hash(k) - 23


##### Some of the databases using Bloom filter

    HBase
    Cassandra
    PostGre


##### Few use cases

    - Google emial service - while signup
    - Goolge finding un-safe URL's  {It Maintain's bit rerepresenataion {hardly 1MB} of Bit Array of Bloom filter of very big size}
      Original List size {of un-safe URL's could be 50-100MB}