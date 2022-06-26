* Time Complexity: O(n)
​
*  Space Complexity: O(1);
​
*  Explaination: In this question, i have used a pointer for storing unique elements in pointer index. firstly the given array is sorted so the first element is anyway a unique element and it should be stored at 0'th index only. so i have stored that index in my 1st pointer which is at index 0 then i have iterrated through the array from index 1 and compared that element with my pointer element. If i found any element which is not same of my pointer element i just increamented my pointer and then i stored that unique element in that pointer.