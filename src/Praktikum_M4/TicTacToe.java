package Praktikum_M4;

import java.util.Arrays;

public class TicTacToe {
    final char X = 'X';
    final char O = 'O';
    final char EMPTY = '-';
    char[][] table;

    public TicTacToe(char[][] table) {
        this.table = table;
    }

    public void newGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = EMPTY;
            }
        }
    }

    public void makeMove(int x, int y){

    }

    public void getField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(new char[3][3]);
        ticTacToe.newGame();
        ticTacToe.getField();
    }
}
