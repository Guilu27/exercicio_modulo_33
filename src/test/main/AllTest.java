package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MarcaDAOTest.class,
        CarroDAOTest.class,
        AcessorioDAOTest.class
})
public class AllTest {
}
