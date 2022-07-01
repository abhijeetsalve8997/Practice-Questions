* Firstly, For considering boxes of maximum units the 2D array `boxTypes` is sorted in decreasing order by `Arrays.sort(boxTypes,(a,b) -> -Integer.compare(a[1],b[1]))`.
​
* Then `maxUnits` initialised so that maximum total number of units can be stored into that variable.
​
* For loop is used to access each sub-array, in that `maxUnits` calculated and stored by `maxUnits += box[0] * box[1]`.
​
* `truckSize` is also decreamented and stored by ` truckSize -= box[0]`, so that if any number of boxes are greater than modified `truckSize` then remaining number of units stored into the truck by `maxUnits + truckSize * box[1]` which is finally returned to the function.