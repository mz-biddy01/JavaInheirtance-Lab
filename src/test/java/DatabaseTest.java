import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jack", 245, 10.00);
    }

    @Test
    public void developerHasAName(){
        assertEquals("Jack", databaseAdmin.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals(245, databaseAdmin.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(10.00, databaseAdmin.getSalary(), 0.00);
    }

//    @Test
//    public void developerGotSalaryRaise(){
//        assertEquals(11.00, databaseAdmin.getImprovedSalary(), 0.00);
//    }
//
//    @Test
//    public void developerGotBonus(){
//        assertEquals(11.10, databaseAdmin.getImprovedSalaryAndBonus(), 0.00);
//    }
}

