package smokeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        S1Post.class,
        S2Put.class,
        S3Get.class,
        S4Patch.class,
        S5Delete.class,
        S6GetNegativeTest.class
})

public class Runner {


}
