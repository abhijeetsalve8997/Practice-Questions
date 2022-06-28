* Firstly `freq` array is created to store number of frequency of each character of String `s`.
​
* Then, all the frequecies are stored in its correct index by `freq[s.charAt(i) - 'a']++`.
​
* A HashSet created `occurances` to Store and check occured Frequencies and also one integer is initialised to store deletion of characters required i.e. `deletionRequired`.
​
* Now, by iterating through an array if `currFreq` is greater than `0` that means that character exists in array. if it already exist then its frequency is decreamented by `currFreq--` and required number of character to be deleted is increament by `deletionRequired++`
If it now exist then it simply added into hashSet `occurances`.
​
* Finally `deletionRequired` is returned to function.
​
* Time Complexity: O(n^2)
​
* Space Complexity: O(n)