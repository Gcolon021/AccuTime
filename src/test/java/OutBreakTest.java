import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutBreakTest {

    private OutBreak outBreak;

    @BeforeEach
    void setUp() {
        outBreak = new OutBreak();
    }

    @Test
    void isVerticalTrue() {
        Room[][] verticalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };

        boolean isOutBreak = outBreak.isOutBreak(verticalTrue);
        assertEquals(Boolean.TRUE, isOutBreak);
    }

    @Test
    void isHorizontalTrue() {
        Room[][] horizontalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };

        boolean isOutBreak = outBreak.isOutBreak(horizontalTrue);
        assertEquals(Boolean.TRUE, isOutBreak);
    }

    @Test
    void isNoInfection() {
        Room[][] noInfection = new Room[][] {
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };

        boolean isOutBreak = outBreak.isOutBreak(noInfection);
        assertEquals(Boolean.FALSE, isOutBreak);
    }

    @Test
    void checkOutBreakSizeFive() {
        Room[][] outBreakSizeFive = new Room[][] {
                {new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };
        outBreak.setIsVisited(new boolean[outBreakSizeFive.length][outBreakSizeFive[0].length]);
        int outBreakSize = outBreak.determineOutbreakSizeWithoutDiag(outBreakSizeFive, 0, 0);
        assertEquals(5, outBreakSize);
    }

    @Test
    void ensureDiagRoomsNotConnected() {
        Room[][] onlyDiag = new Room[][] {
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }
        };



        outBreak.setIsVisited(new boolean[onlyDiag.length][onlyDiag[0].length]);
        int outBreakSize = outBreak.determineOutbreakSizeWithoutDiag(onlyDiag, 0, 0);
        assertEquals(1, outBreakSize);

        outBreakSize = outBreak.determineOutbreakSizeWithoutDiag(onlyDiag, 1, 1);
        assertEquals(1, outBreakSize);
    }

    @Test
    void checkNbyM2DArray() {
        Room[][] onlyDiag = new Room[][] {
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(true), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }
        };

        Boolean isOutBreak = this.outBreak.isOutBreak(onlyDiag);
        assertEquals(Boolean.TRUE, isOutBreak);
    }

    @Test
    void checkNbyM2DArrayFromMiddle() {
        Room[][] onlyDiag = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(true) },
                {new Room(false), new Room(false), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };

        Boolean isOutBreak = this.outBreak.isOutBreak(onlyDiag);
        assertEquals(Boolean.TRUE, isOutBreak);
    }
}
