package com.ibm;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowEmptyBoardTest {

    public static final String EMPTY_BOARD_EXPECTED = " | | \n-+-+-\n | | \n-+-+-\n | | \n-+-+-\n | | \n";

    @DisplayName("Empty Board Creation")
    @Test
    public void emptyBoard() {
        TicTacToe ttt = new TicTacToe();
        assertEquals(EMPTY_BOARD_EXPECTED, ttt.showEmptyBoard());
    }
}
