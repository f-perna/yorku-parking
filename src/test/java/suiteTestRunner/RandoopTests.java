package suiteTestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    randoop.controllers.ControllerRegressionTest0.class,
    randoop.controllers.factory.ControllerFactoryRegressionTest0.class,
    randoop.models.ModelsRegressionTest0.class,
    randoop.models.auth.ModelsAuthRegressionTest0.class,
    randoop.models.booking.BookingRegressionTest0.class,
    randoop.models.client.ClientRegressionTest0.class,
    randoop.models.manager.ManagerRegressionTest0.class,
    randoop.models.parkingLot.ParkingLotRegressionTest0.class,
    randoop.models.parkingSensor.ParkingSensorRegressionTest0.class,
    randoop.models.parkingSpace.ParkingSpaceRegressionTest0.class,
    randoop.models.payment.PaymentRegressionTest0.class,
    randoop.models.superManager.SuperManagerRegressionTest0.class,
    randoop.repositories.RepositoriesRegressionTest0.class,
    randoop.services.ServicesRegressionTest0.class,
    randoop.utils.UtilsRegressionTest0.class,
    randoop.csvs.CsvsRegressionTest0.class
})
public class RandoopTests {

}