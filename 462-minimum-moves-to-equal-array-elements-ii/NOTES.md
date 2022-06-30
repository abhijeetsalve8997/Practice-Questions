* Firstly Array is sorted! because we can say that if we want to find out minimun numbers of changes required to make all elements equal, we have to find out the mid of the array. the element which is present at mid is the element which can approached by other elements with minimum moves!
​
* After that a while loop is required for further operations. In while loop, if the iterating element is less than mid element then it is increamented and if it is greater than mid element it is decreamented.
​
* A count variable is also increamented with following operations. So that changes are recorded.
​
* If the iterating element is became equal to mid element then pointer is moved to next element and same operations would be performed on that element!
​
* Finally count is returned to the function.
​
* Time Complexity: O(nlogn)
​
* Space Complexity: O(1)