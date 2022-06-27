* Firstly List of Arraylist `pascalT` is created which will be returned at the end.

* Base case taken into consideration, if there is 0 rows then we have return empty list.

* As the first row is having only one element which is `1`. So firstly that arraylist is created `firstRow` and then it is added into the main list `pascalT`.

* It is observed that in each row. At position of `index 0` and  ` index i` element 1 is present. so while starting and ending loop for column it is assigned.

* In this code, `i` is for row index and `j` is for column index.

* Previous row is accessed by `pascalT.get(i - 1)` and In current row on the elements rather that `index 0` and `index i`, They are calculated and added by `currRow.add(prevRow.get(j - 1) + prevRow.get(j))`

* Finally the modified `currRow` is added in `PascalT` and it is returned!

* Time Complexity: O(n^2);

* Space Complexity: O(n);
