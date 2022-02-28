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
		int x = grid.length;
		int y = grid[0].length;
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				if (grid[i][j] > 0)
					area = Math.max(area, traverseAndReplace(i, j, grid));
		return area;
	}

	private static int traverseAndReplace(int i, int j, int[][] grid) {
		int x = grid.length;
		int y = grid[0].length;
		if (i < 0 || j < 0 || i >= x || j >= y || grid[i][j] < 1)
			return 0;
		grid[i][j] = 0;
		return 1 + traverseAndReplace(i - 1, j, grid) + traverseAndReplace(i, j - 1, grid) + traverseAndReplace(i + 1, j, grid) + traverseAndReplace(i, j + 1, grid);
	}
}


