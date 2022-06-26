* Firstly positive pointer is kept on the its right position because its a sorted array. Its kept in its right position by using comdition that `( nums[posPointer] < 0 )`
​
* Negative pointer is calculated by `posPointer - 1`
​
* Now new array `sqr` is prepared and its index `k` is intialised.
​
* Now while interation if the smaller element from negative pointer and positive pointer is kept inside the `sqr` array.
​
* Finally `sqr` array is returned
​
**Time Complexity: O(n)
Space Complexity: O(n)**