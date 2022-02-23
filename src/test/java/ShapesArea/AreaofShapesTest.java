package ShapesArea;

import Assignment2.ShapesArea.AreaofShapes;
import Assignment3.BasketballTeam;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaofShapesTest {
    AreaofShapes obj,obj1;

    @Before
    public void setUp(){
        obj=new AreaofShapes();
        obj.square(4);

    }


    @Test
    void square() {
        obj=new AreaofShapes();
        double a=obj.square(4);
        assertEquals(16,a);
        //assertEquals(4,obj.square(-2),0);
    }

    @Test
    void circle() {
        AreaofShapes obj=new AreaofShapes();
        double a= obj.circle(5);
        assertEquals(78.539,a);
        //assertEquals(12.566,obj.circle(-2),0);
    }

    @Test
    void rectangle() {
        AreaofShapes obj=new AreaofShapes();
        double a=obj.rectangle(5,7);
        assertEquals(35.0,a);
        //assertEquals(0,obj.rectangle(-2,6));
    }
}