package testes;

class Main {
	public static void main(String[] args) throws Exception {
		 int grid1[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
				 		   { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				 		   { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			 		   	   { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, 
			 		   	   { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
			 		   	   { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
			 		   	   { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
			 		   	   { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		int grid2[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 }, 
						  { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
						  { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 }, 
						  { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1 }, 
						  { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		
		int grid3[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6));
		System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12));
		System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid3) == 0));
	}
	
	public static int maxAreaOfIsland(int[][] grid) {
		Integer area = 0;
		Integer max = 0;
		for (int i = 0; i <= grid.length - 2; i++) {
			for (int j = 0; j <= grid[1].length - 2; j++) {
				int current = grid[i][j];
				boolean nextRight = grid[i][j + 1] == 1;
				boolean nextDown = grid[i + 1][j] == 1;
				if (current > 0) {
					area++;
					if (nextRight) {
						area++;
					}
					if (nextDown) {
						area++;
					}
				} 
				else if (!nextRight && !nextDown){
					if(max < area) {
						max = area;
					}
					area = 0;
				}
			}
		}
		System.out.println("area :" + max);
		return max;
	}
}


