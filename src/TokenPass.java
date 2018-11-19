public class TokenPass
{
    private int[] board; private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++)
        {
            int random = (int)Math.random() * 9 + 1;
            board[i] = random;
        }
        currentPlayer = (int)Math.random() * (playerCount - 1);
    }

    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while (numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public printBoard()
    {
        System.out.println();
    }
}