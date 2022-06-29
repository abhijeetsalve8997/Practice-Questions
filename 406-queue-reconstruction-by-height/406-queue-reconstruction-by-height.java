class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        //Sort the array based on position.
        // If position is same sort based on height
        Arrays.sort(people, (a,b) ->{
           return a[1]!=b[1]?a[1]-b[1]:a[0]-b[0]; 
        });
        
        for(int i=1;i<people.length;i++) {
            int count = 0;
            for(int j=0;j<i;j++) {
                if(people[j][0]>=people[i][0])
                    count++;
                if(count>people[i][1]) {
                    //Insert i in j and shift left
                    insert(people,i,j);
                    break;
                }
            }
        }
        return people;
    }
    
    private int[][] insert(int[][] people, int i, int j) {
        int[] temp = people[i];
        while(i>j) {
            people[i] = people[i-1];
            i--;
        }
        people[j] = temp;
        
        return people;
    }
}