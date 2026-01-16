class Solution {

    Integer [][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {

        memo = new Integer[triangle.size()][triangle.size()];
         return solve(0,0,triangle);
    }

    private int solve(int i, int j, List<List<Integer>> triangle) {
        
        if(i == triangle.size()){
            return 0;
        }

        if(triangle.size() == 1){
            return triangle.get(i).get(j);
        }

        if(memo[i][j] != null){
            return memo[i][j];
        }

        int current = triangle.get(i).get(j);
        int down = solve(i+1,j,triangle);
        int downRight = solve(i+1,j+1,triangle);
        memo[i][j] = current + Math.min(down, downRight);
        return memo[i][j];
    
    }
}