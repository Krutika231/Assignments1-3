package Assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketballTeamTest {
    BasketballTeam obj,obj1;
    @BeforeEach
    void setUp() {
        obj=new BasketballTeam("Boston Celtics",10);
        obj1=new BasketballTeam("Chelsea",33);
    }
    @Test
    void getTeamName() {
        assertEquals("Boston Celtics",obj.getTeamName());
        assertEquals("Chelsea",obj1.getTeamName());
    }

    @Test
    void updatePoints() {
        int a=obj.updatePoints("Win");
        int b=obj.getPoints()+a;
        assertEquals(12,b,0);

    }

    @Test
    void getPoints() {
        assertEquals(10,obj.getPoints());
    }


}