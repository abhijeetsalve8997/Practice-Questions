* Firstly 2D intevals array is sorted on the basis of begining element of each interval by `Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]))`
​
* New ArrayList is created so that resultant intervals can be stored and after the complete operation it is returned to the function by converting it into 2D array by using `return result.toArray(new int[result.size()][])`
​
* Starting interval is firstly stored into the arraylist and then for loop is used for further operation.
​
* Inside the for loop, some variables are initialised such as,
`int current_begin = current_interval[0],
int current_end = current_interval[1],
int next_begin = interval[0],
int next_end = interval[1]`
* After this, if next interval's first element is less than current interval's last element then merging is required. Merge is done by `current_interval[1] = Math.max(current_end, next_end)`, otherwise we have to add the intervals directly into the arraylist.
​
* Finally arraylist is converted into 2D array and returned!
​
* Time Complexity: O(nlogn)
​
* Space Complexity: O(n)