import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob Ross", "AB18364D", 2300.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50.00);
        assertEquals(2350.00, developer.getSalary(), 0.01);
    }

    @Test
    public void checkBonus(){
        assertEquals(23.00, developer.payBonus(), 0.01);
    }

}
