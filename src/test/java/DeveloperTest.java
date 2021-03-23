import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Allison", 244, 30.00);
    }

    @Test
    public void developerHasAName(){
        assertEquals("Allison", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals(244, developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(30.00, developer.getSalary(), 0.00);
    }

//    @Test
//    public void developerGotSalaryRaise(){
//        assertEquals(33.00, developer.getImprovedSalary(), 0.00);
//    }
//
//    @Test
//    public void developerGotBonus(){
//        assertEquals(33.30, developer.getImprovedSalaryAndBonus(), 0.00);
//    }
}
