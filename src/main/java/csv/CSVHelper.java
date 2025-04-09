package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

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

	protected static void initializeTestFile(String filePath, String header) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(header);
			writer.newLine();
		}
	}

	protected static void cleanupTestFile(String filePath) {
		try {
			Files.deleteIfExists(Paths.get(filePath));
		} catch (IOException e) {
			// Ignore, will be cleaned up by temp directory
		}
	}

}