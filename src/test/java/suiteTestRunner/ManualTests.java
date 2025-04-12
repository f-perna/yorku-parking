package suiteTestRunner;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({
    "manual.controllers",
    "manual.controllers.factory",
    "manual.models",
    "manual.models.auth",
    "manual.models.booking",
    "manual.models.client",
    "manual.models.manager",
    "manual.models.parkingLot",
    "manual.models.parkingSensor",
    "manual.models.parkingSpace",
    "manual.models.payment",
    "manual.models.superManager",
    "manual.repositories",
    "manual.services",
    "manual.utils",
})
public class ManualTests {

}