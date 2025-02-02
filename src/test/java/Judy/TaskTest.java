package Judy;
import Judy.task.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskTest {

    @Test
    public void parseDateTime_test() {
        assertEquals("Oct 2 1990", new Task("test").parseDateTime("02/10/1990 1800"));
    }

    @Test
    public void parseDateTime_fail() {
        assertEquals(null, new Task("test").parseDateTime("1990/10/2 1800"));
    }
}
