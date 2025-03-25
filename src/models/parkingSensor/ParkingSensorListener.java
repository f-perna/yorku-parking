package models.parkingSensor;

import java.time.LocalDateTime;

public interface ParkingSensorListener {
    void onCarDetected(ParkingSensor sensor, String licencePlate, LocalDateTime detectionTime);

    void onCarRemoved(ParkingSensor sensor, LocalDateTime removalTime);
}