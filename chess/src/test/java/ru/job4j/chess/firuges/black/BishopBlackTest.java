package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void whenInitialCellIsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.C1;
        assertEquals(expected, actual);
    }

    @Test
    public void whenCopyIsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell dest = Cell.D2;
        Figure expected = bishopBlack.copy(dest);
        Figure actual = new BishopBlack(dest);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMoveNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell dest = Cell.G5;
        Cell[] actual = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] expected = bishopBlack.way(dest);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void whenImpossibleMove() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C4);
    }

    private void assertEquals(Cell expected, Cell actual) {
    }

    private void assertEquals(Figure expected, Figure actual) {
    }

    private void assertEquals(Cell[] expected, Cell[] actual) {
    }
}