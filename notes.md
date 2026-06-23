Collection
In java, collection is a framework that allows us to store and manipulate a group of objects dynamically
the collection framework is a set of interfaces and classes in java used to store, retrieve, update, and process groups of objects.

Collection Framework Hierarchy (simplified):

Iterable (interface)
  └── Collection (interface)
        ├── List (interface)   — ordered, allows duplicates
        │     ├── ArrayList        — dynamic array, fast index access
        │     ├── LinkedList       — doubly linked list, fast insert/delete
        │     └── Vector           — thread-safe version of ArrayList
        │
        ├── Set (interface)    — no duplicates
        │     ├── HashSet          — uses hash table, no order
        │     ├── LinkedHashSet    — maintains insertion order
        │     └── TreeSet          — sorted order
        │
        └── Queue (interface)  — FIFO order
              ├── PriorityQueue    — elements ordered by priority
              └── LinkedList       — can also be used as a Queue


ArrayList
- class in the java collection framework that implements the List interface
- dynamic in size — can grow or shrink automatically
- maintains insertion order
- allows duplicate elements
- allows null values
- accessing elements by index is fast (O(1))
- insertion/removal in the middle is slow (O(n)) because elements shift
- default initial capacity is 10; grows by 50% when full

Common ArrayList methods:
  add(element)        — appends element at the end
  add(index, element) — inserts at specific position
  get(index)          — retrieves element at index
  set(index, element) — replaces element at index
  remove(index)       — removes element at index
  size()              — returns number of elements
  contains(element)   — checks if element exists
  clear()             — removes all elements
  isEmpty()           — checks if list is empty

Array vs ArrayList:
  Array                   |  ArrayList
  fixed size              |  dynamic size
  can hold primitives     |  holds only objects (uses wrapper classes)
  [] syntax               |  methods like add(), get()
  faster                  |  slightly slower due to overhead

LinkedList (implements List and Deque)
- doubly linked list — each element holds a reference to the previous and next node
- fast insert/delete at both ends (O(1))
- slow random access (O(n)) — must traverse from head/tail
- can be used as a List, Stack, or Queue

LinkedList as a Stack (LIFO — Browser History):
  push(element)   — adds element at the front
  pop()           — removes and returns the first element
  peek()          — returns the first element without removing
  add(element)    — appends at the end
  removeLast()    — removes the last element (simulates "Back")
  getLast()       — retrieves the last element (current page)

LinkedList as a Queue (FIFO — Waiting List):
  addLast(element)   — enqueues element at the tail
  removeFirst()      — dequeues element from the head
  peekFirst()        — views head without removing
  isEmpty()          — checks if queue is empty
  size()             — returns number of elements

Common LinkedList methods:
  addFirst(element)  — inserts at the beginning
  addLast(element)   — inserts at the end
  removeFirst()      — removes and returns the first element
  removeLast()       — removes and returns the last element
  getFirst()         — retrieves the first element
  getLast()          — retrieves the last element
  remove(element)    — removes the first occurrence of the specified element

Wrapper Classes (for using primitives in collections):
  int    → Integer
  float  → Float
  double → Double
  char   → Character
  boolean→ Boolean
  long   → Long

JDBC (Java Database Connectivity)
- API to connect and execute queries on databases from Java
- Steps:
  1. Load the driver: Class.forName("com.mysql.cj.jdbc.Driver")
  2. Establish connection: DriverManager.getConnection(url, user, password)
  3. Create statement: con.createStatement() or con.prepareStatement(sql)
  4. Execute query: executeQuery() for SELECT, executeUpdate() for INSERT/UPDATE/DELETE
  5. Process results: ResultSet (use rs.next() and rs.getXxx() methods)
  6. Close resources: con.close(), ps.close()

PreparedStatement advantages:
- prevents SQL injection (uses ? placeholders)
- precompiled — faster for repeated executions
- handles data type conversion automatically

CRUD operations mapping:
  CREATE → INSERT INTO table VALUES(?,?,...)
  READ   → SELECT * FROM table
  UPDATE → UPDATE table SET col=? WHERE id=?
  DELETE → DELETE FROM table WHERE id=?