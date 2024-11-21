package game;
import java.util.*;
public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[3][3];
		for(int row = 0; row < board.length; row++)
		{
			for(int col = 0; col <board[row].length; col++)
			{
				board[row][col] = ' ';
			}
		}
		Scanner sc = new Scanner(System.in);
		char player = 'X';
		boolean gameOver = false;
		while(!gameOver)
		{
			printboard(board);
			System.out.println("Player " + player + " make your move " );
			int row = sc.nextInt();
			int col = sc.nextInt();
			 System.out.println();
			if(board[row][col]==' ')
			{
				board[row][col] = player;
				gameOver = winner(board,player);
				if(gameOver)
				{
					printboard(board);
					System.out.println("Player " + player + " Has won the game ");
				}
				else
				{
					if(player =='X')
					{
						player='O';
					}
					else
					{
						player = 'X';
					}
				}
			}
			else
			{
				System.out.println("Invalid move try again please");
			}
			
		}
	}
	private static boolean winner(char[][] board, char player) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++)
		{
			if(board[i][0]== player && board[i][1]== player && board[i][2]== player )
			{
				return true;
			}
		}
		
		for (int i = 0; i < board[0].length; i++)
		{
			if(board[0][i]== player && board[1][i]== player && board[2][i]== player )
			{
				return true;
			}
		}
		if(board[0][0]== player && board[1][1] ==player && board[2][2]== player)
		{
			return true;
		}
		if(board[0][2]== player && board[1][1]==player && board[2][0]==player)
		{
			return true;
		}
		return false;
	}
	private static void printboard(char[][] board) {
		// TODO Auto-generated method stub
		for(int row = 0; row < board.length; row++)
		{
			for(int col = 0; col <board[row].length; col++)
			{
				System.out.print(board[row][col] + " | ");
			}
			System.out.println();
		}
		
	}
	

}
