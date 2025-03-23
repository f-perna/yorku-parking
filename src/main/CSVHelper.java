package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public abstract class CSVHelper {
	protected static final String CSV_DELIMITER = ",";
	protected static final String DATA_DIRECTORY = "data/";

	protected static void ensureDataDirectoryExists() {
		File directory = new File(DATA_DIRECTORY);
		if (!directory.exists()) {
			directory.mkdirs();
		}
	}

	protected static BufferedReader getFileReader(String filePath) throws IOException {
		ensureDataDirectoryExists();
		return new BufferedReader(new FileReader(filePath));
	}

	protected static BufferedWriter getFileWriter(String filePath) throws IOException {
		ensureDataDirectoryExists();
		return new BufferedWriter(new FileWriter(filePath));
	}

	protected static void logError(String message) {
		System.err.println("CSV Error: " + message);
	}
}