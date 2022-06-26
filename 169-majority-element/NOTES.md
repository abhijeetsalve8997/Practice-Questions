* Firstly 1st element of array is considered as majority element.
​
* Iteration started from index 1, if the element is same as majority element its count will be incremented.
​
* If that's not the case, then count is decreamented and also if count becomes 0 then majority element is updated as well as count became 1.
​
* In that way, Because constraints that saying "Majority element will always be exist" that's why the most occuring element is remained at last!
​
**Time Complexity: O(n)
Space Complexity: O(1)**