package creational.singleTon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintsPoolerTest {

    @Test
    void testSingletonInstance() {
        PrintsPooler instance1 = PrintsPooler.getInstance();
        PrintsPooler instance2 = PrintsPooler.getInstance();
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    void testAddAndProcessPrintJobs() {
        PrintsPooler printSpooler = PrintsPooler.getInstance();
        printSpooler.addPrintJob("Job 1");
        printSpooler.addPrintJob("Job 2");

        assertEquals("Job 1", printSpooler.processNextJob());
        assertEquals("Job 2", printSpooler.processNextJob());
        assertNull(printSpooler.processNextJob());
    }

}