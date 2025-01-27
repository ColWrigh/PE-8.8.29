public class IdenticalArrays {

    // I was not able to parse an user input into a 2D array.


    public static void main(String[] args){
        
       int[][] lstOne = {{1,2,3}, {1,2,3}, {1,2,3}};
       int[][] lstTwo = {{1,2,3}, {1,2,3}, {1,2,3}};

    System.out.println(equals(lstOne, lstTwo));
    }

    public static boolean equals(int[][] m1, int[][] m2){

        // Check if arrays have same number of rows
        if (m1.length != m2.length){
            return false;
        }

        // Check if each element matches
        for (int i = 0; i < m1.length && i < m2.length; i++){
            for (int j = 0; j < m1[i].length; j++){
                // If any element of the array is different, return false
                if (m1[i][j] != m2[i][j]){
                    return false;
                }
            }
        }

        // Return true if nothing triggers false 
        return true;
    
    }
    
}
