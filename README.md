# AccuTime

Notes:
The limitation of this implementation is the size of the given data set. I am using a modified Depth First Search to complete the given problem; however, as the data set grows in size the stack will grow beyond Java's ability to handle it and will throw a Stack Overflow error. If the size of the data set is of sufficient size Dijkstra's algorithm can overcome this issue. Dijkstra's algorithm is slightly slower than DFS, O(n*m) vs O((n*m) log n), but it uses an iterative approach instead of a recursive one. 
