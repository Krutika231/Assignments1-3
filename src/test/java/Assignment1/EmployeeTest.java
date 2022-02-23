package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    void computeBaseSalary() {
        Employee abc=new Employee();
        abc.getInfo("abc",10,7);
        double baseSalary=abc.computeBaseSalary();
        assertEquals(1400,baseSalary,0);
    }

    @Test
    void addSal() {
        Employee abc=new Employee();
        abc.getInfo("abc",10,7);
        double baseSalary=abc.computeBaseSalary();
        double addSal=abc.addSal(baseSalary);
        assertEquals(1400,addSal,0);
    }

    @Test
    void addWork() {
        Employee abc=new Employee();
        abc.getInfo("abc",10,6);
        double baseSalary=abc.computeBaseSalary();
        double addSal=abc.addWork(7);
        assertEquals(1205,addSal,0);
    }
}