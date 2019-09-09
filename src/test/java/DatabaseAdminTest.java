import org.junit.Before;
import org.junit.Test;

import staff.techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob Ross", "AB18364D", 2300.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(50.00);
        assertEquals(2350.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void checkBonus(){
        assertEquals(23.00, databaseAdmin.payBonus(), 0.01);
    }

}

