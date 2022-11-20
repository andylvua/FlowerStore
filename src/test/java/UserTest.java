import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstoreweb.user.User;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testDateOfBirth() {
        User user = new User();
        user.setDob(LocalDate.of(1999, 1, 1));
        assertEquals("1999-12-31", user.getDob().toString());
    }
}
