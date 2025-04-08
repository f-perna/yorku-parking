package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import csv.ParkingSensorCSVProcessor;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;

public class ParkingSensorRepository {
	private List<ParkingSensor> sensors;

	public ParkingSensorRepository() {
		this.sensors = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		sensors = ParkingSensorCSVProcessor.readSensorData();
	}

	public ParkingSensor getSensorBySpaceId(UUID spaceId) {
		for (ParkingSensor sensor : sensors) {
			if (sensor.getParkingSpace().getID().equals(spaceId)) {
				return sensor;
			}
		}
		return null;
	}

	public List<ParkingSensor> getAllSensors() {
		return new ArrayList<>(sensors);
	}

	public ParkingSensor createSensor(ParkingSpace parkingSpace) {
		ParkingSensor sensor = new ParkingSensor(parkingSpace);
		sensors.add(sensor);
		saveSensors();
		return sensor;
	}

	public void saveSensors() {
		ParkingSensorCSVProcessor.setSensorData(sensors);
	}

	public void updateSensor(ParkingSensor sensor) {
		// The sensor is already in our list, just save the updated state
		saveSensors();
	}
}