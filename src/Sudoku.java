class Sudoku {

	private static int[][] board = {
		{5,3,0,0,7,0,0,0,0},
		{6,0,0,1,9,5,0,0,0},
		{0,9,8,0,0,0,0,6,0},
		{8,0,0,0,6,0,0,0,3},
		{4,0,0,8,0,3,0,0,1},
		{7,0,0,0,2,0,0,0,6},
		{0,6,0,0,0,0,2,8,0},
		{0,0,0,4,1,9,0,0,5},
		{0,0,0,0,8,0,0,7,9}
	}; 

	public static void main(String[] args){
		if (isNumberValid(1,3,1) == true) {
			System.out.println("Numero valido!");
		} else {
			System.out.println("Numero invalido!");
		}
	}
	
	public static boolean isNumberInRow(int number, int row){
		for (int i = 0; i < board.length; i++){
			if (board[row-1][i] == number){
				return true;
			}
		}
		return false;
	}

	public static boolean isNumberInColumn(int number, int column){
                for (int i = 0; i < board.length; i++){
                        if (board[i][column-1] == number){
				return true;
			}
                }
		return false;
        }

	public static boolean isNumberInGrid(int number, int row, int column){
		int localGridRow = row - row % 3;
		int localGridColumn = column - column % 3;
		for (int i = localGridRow; i < localGridRow +3; i++){
			for (int j = localGridColumn; j < localGridColumn +3; j++){
				if (board[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isNumberValid(int number, int row, int column){
		if (!isNumberInRow(number,row) && !isNumberInColumn(number,column) && !isNumberInGrid(number,row,column)){
			return true;
		}
		return false;
	}
}
