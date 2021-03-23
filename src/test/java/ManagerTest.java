import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Helen", 234, 20.00, "hr");
    }

    @Test
    public void managerHasAName(){
        assertEquals("Helen", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals(234, manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(20.00, manager.getSalary(), 0.00);
    }

    @Test
    public void managerHasADept(){
        assertEquals("hr", manager.getDeptName());
    }


    @Test
    public void managerGotSalaryRaise(){
        assertEquals(22.00, manager.getImprovedSalary(), 0.00);
    }

    @Test
    public void manageGotBonus(){
        assertEquals(22.20, manager.getImprovedSalaryAndBonus(), 0.00);
    }
}
