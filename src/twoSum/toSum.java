package twoSum;

public class toSum {

    public int[] x;
    public int target;
    public int i;
    public int j;


    public toSum(int[] arr, int x) {
    }

    public int [] twoSum(int[] x, int target){
        x = this.x;
        target = this.target;

        for ( i = 0; i < x.length-1; i++) {

            for ( j = 0; j < x.length; j++) {
                if(x[i] + x[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public String toString(){
        return "[" + this.i + ", " + this.j + "]";
     }
}
