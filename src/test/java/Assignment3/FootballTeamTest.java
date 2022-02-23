package Assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballTeamTest {
    FootballTeam obj,obj1;
    @BeforeEach
    void setUp() {
        obj=new FootballTeam("FC Barca",50,"Happy foot");
        obj1=new FootballTeam("Manchester",33,"Nice Stadium");
    }

    @Test
    void getTeamName() {
        assertEquals("FC Barca",obj.getTeamName());
    }


    @Test
    void updatePoints() {
        int a=obj.updatePoints("Win");

        assertEquals(53,a);
    }

    @Test
    void getPoints() {
        assertEquals(50,obj.getPoints());
    }
}