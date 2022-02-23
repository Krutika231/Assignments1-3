package ShapesArea;
import Assignment2.ShapesArea.PerimeterofShapes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerimeterofShapesTest {

    @Test
    void square() {
        PerimeterofShapes obj=new PerimeterofShapes();
        assertEquals(24,obj.square(4),0);
    }

    @Test
    void circle() {
        PerimeterofShapes obj=new PerimeterofShapes();
        assertEquals(31.4000,obj.circle(5),0);

    }

    @Test
    void rectangle() {
        PerimeterofShapes obj =new PerimeterofShapes();
        assertEquals(18,obj.rectangle(4,5),0);
    }
}