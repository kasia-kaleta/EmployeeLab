import org.junit.Before;
import org.junit.Test;

import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob Ross", "AB18364D", 2300.00, "Anti Corruption");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50.00);
        assertEquals(2350.00, manager.getSalary(), 0.01);
    }

    @Test
    public void checkBonus(){
        assertEquals(23.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canSetName(){
        manager.setName("Mat");
        assertEquals("Mat", manager.getName());
    }

}
