import management.Director;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director  = new Director("Phil", 419, 50.00, "Operations", 100.00);
    }

    @Test
    public void directorHasAName(){
        assertEquals("Phil", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals(419, director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(50.00, director.getSalary(), 0.00);
    }

    @Test
    public void directorHasDept(){
        assertEquals("Operations", director.getDeptName());
    }

    @Test
    public void  directorHasBudget(){
        assertEquals(100.00, director.getBudget(), 0.00);
    }

//    @Test
//    public void directorGotSalaryRaise(){
//        assertEquals(52.00, director.getImprovedSalary(), 0.00);
//    }
//
//    @Test
//    public void directorGotBonus(){
//        assertEquals(52.50, director.getImprovedSalaryAndBonus(), 0.00);
//    }
}

