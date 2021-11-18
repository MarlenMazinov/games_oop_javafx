package ru.job4j.chess;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest extends TestCase {

    @Test
    public void whenReturnIndex()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
        int actual = 0;
        int expected = logic.getIndex();
        assertEquals(actual, expected);
    }

    @Test (expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void whenCountCells()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        logic.move(Cell.C1, Cell.E3);
        Cell[] expected = logic.getFigures()[logic.getIndex()].way(Cell.E3);
        Cell[] actual = {Cell.C1, Cell.D2, Cell.E3};
        assertEquals(actual, expected);
    }
}