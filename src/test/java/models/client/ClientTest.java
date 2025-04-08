package models.client;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class ClientTest {

    @ParameterizedTest
    @MethodSource("clientTypeProvider")
    void testFactoryCreatesCorrectType(Client.type type, Class<?> expectedClass, int expectedRate) {
        String name = "TestName";
        String email = "test@example.com";
        String password = "testpass";
        String licencePlate = "TEST123";
        boolean approved = true;

        Client client = GenerateClientFactory.getClientType(name, email, password, type, licencePlate, approved);

        assertNotNull(client, "Client should not be null for type " + type);
        assertTrue(expectedClass.isInstance(client), "Client should be an instance of " + expectedClass.getSimpleName());
        assertEquals(type, client.getType(), "Client type should match the expected type");
        assertEquals(expectedRate, client.getRate(), "Client rate should match the expected rate for " + type);
        assertEquals(name, client.getName(), "Client name should be set correctly");
        assertEquals(email, client.getEmail(), "Client email should be set correctly");
        assertEquals(password, client.getPassword(), "Client password should be set correctly");
        assertEquals(licencePlate, client.getLicencePlate(), "Client licence plate should be set correctly");
        assertEquals(approved, client.isApproved(), "Client approval status should be set correctly");
    }

    private static Stream<Arguments> clientTypeProvider() {
        return Stream.of(
            Arguments.of(Client.type.STUDENT, Student.class, 5),
            Arguments.of(Client.type.FACULTY, FacultyMember.class, 8),
            Arguments.of(Client.type.NON_FACULTY, NonFacultyMember.class, 10),
            Arguments.of(Client.type.VISITOR, Visitor.class, 15)
        );
    }

    @Test
    void testVisitorSpecifics() {
        Visitor visitor = new Visitor("Jane Doe", "jane@example.com", "pass123", "VIS123", false);
        assertEquals(Client.type.VISITOR, visitor.getType(), "Visitor should have VISITOR type");
        assertEquals(15, visitor.getRate(), "Visitor should have rate of 15");
        visitor.setApproved(true);
        assertTrue(visitor.isApproved(), "Visitor approval status should be modifiable");
        assertTrue(visitor.authenticate("jane@example.com", "pass123"), "Visitor should authenticate correctly");
    }

    @Test
    void testNonFacultyMemberSpecifics() {
        NonFacultyMember nonFaculty = new NonFacultyMember("John Smith", "john@example.com", "pass456", "NF123", true);
        assertEquals(Client.type.NON_FACULTY, nonFaculty.getType(), "NonFacultyMember should have NON_FACULTY type");
        assertEquals(10, nonFaculty.getRate(), "NonFacultyMember should have rate of 10");
        nonFaculty.setApproved(false);
        assertFalse(nonFaculty.isApproved(), "NonFacultyMember approval status should be modifiable");
        assertTrue(nonFaculty.authenticate("john@example.com", "pass456"), "NonFacultyMember should authenticate correctly");
    }
    
    @Test
    void testStudentSpecifics() {
        Student student = new Student("Alice Brown", "alice@example.com", "pass789", "STU456", true);
        assertEquals(Client.type.STUDENT, student.getType(), "Student should have STUDENT type");
        assertEquals(5, student.getRate(), "Student should have rate of 5");
        student.setApproved(false);
        assertFalse(student.isApproved(), "Student approval status should be modifiable");
        assertTrue(student.authenticate("alice@example.com", "pass789"), "Student should authenticate correctly");
    }

    @Test
    void testFacultyMemberSpecifics() {
        FacultyMember faculty = new FacultyMember("Bob Green", "bob@example.com", "pass321", "FAC789", false);
        assertEquals(Client.type.FACULTY, faculty.getType(), "FacultyMember should have FACULTY type");
        assertEquals(8, faculty.getRate(), "FacultyMember should have rate of 8");
        faculty.setApproved(true);
        assertTrue(faculty.isApproved(), "FacultyMember approval status should be modifiable");
        assertTrue(faculty.authenticate("bob@example.com", "pass321"), "FacultyMember should authenticate correctly");
    }
    
    @Test
    void testGenerateClientFactoryEdgeCases() {
        
        Client nullTypeClient = GenerateClientFactory.getClientType("Name", "email@example.com", "pass", null, "PLATE123", true);
        assertNull(nullTypeClient, "Factory should return null for null client type");

       
        Client visitor = GenerateClientFactory.getClientType("Visitor", "v@example.com", "pass", Client.type.VISITOR, "VIS789", false);
        assertTrue(visitor instanceof Visitor, "Factory should create Visitor instance");
        assertEquals(15, visitor.getRate(), "Visitor from factory should have rate 15");

        Client nonFaculty = GenerateClientFactory.getClientType("NonFac", "nf@example.com", "pass", Client.type.NON_FACULTY, "NF789", true);
        assertTrue(nonFaculty instanceof NonFacultyMember, "Factory should create NonFacultyMember instance");
        assertEquals(10, nonFaculty.getRate(), "NonFacultyMember from factory should have rate 10");
    }

    @Test
    void testAuthenticate() {
        Client client = new Student("John", "john@example.com", "correctpass", "ABC123", true);
        assertTrue(client.authenticate("john@example.com", "correctpass"), "Authentication should succeed with correct credentials");
        assertFalse(client.authenticate("wrong@example.com", "correctpass"), "Authentication should fail with wrong email");
        assertFalse(client.authenticate("john@example.com", "wrongpass"), "Authentication should fail with wrong password");
        assertFalse(client.authenticate("wrong@example.com", "wrongpass"), "Authentication should fail with wrong email and password");
    }

    @Test
    void testSetApproved() {
        Client client = new FacultyMember("Jane", "jane@example.com", "pass", "XYZ789", false);
        assertFalse(client.isApproved(), "Initial approval status should be false");
        client.setApproved(true);
        assertTrue(client.isApproved(), "Approval status should be true after setting to true");
        client.setApproved(false);
        assertFalse(client.isApproved(), "Approval status should be false after setting to false");
    }

    @Test
    void testEquals() {
        Client student = new Student("John", "same@example.com", "pass1", "ABC123", true);
        Client faculty = new FacultyMember("Jane", "same@example.com", "pass2", "XYZ789", false);
        Client anotherStudent = new Student("Jim", "different@example.com", "pass3", "DEF456", true);

        assertEquals(student, faculty, "Clients with same email should be equal");
        assertEquals(faculty, student, "Equality should be symmetric");
        assertNotEquals(student, anotherStudent, "Clients with different emails should not be equal");
        assertNotEquals(faculty, anotherStudent, "Clients with different emails should not be equal");
        assertEquals(student, student, "Client should equal itself");
        assertNotEquals(student, null, "Client should not equal null");
    }

    @Test
    void testHashCode() {
        Client student = new Student("John", "same@example.com", "pass1", "ABC123", true);
        Client faculty = new FacultyMember("Jane", "same@example.com", "pass2", "XYZ789", false);
        assertEquals(student.hashCode(), faculty.hashCode(), "Equal clients should have the same hash code");
    }

    @Test
    void testConstructorNullValues() {
        assertThrows(NullPointerException.class, () -> new Visitor(null, "email", "pass", "plate", true), "Visitor constructor should throw NPE for null name");
        assertThrows(NullPointerException.class, () -> new NonFacultyMember("name", null, "pass", "plate", true), "NonFaculty constructor should throw NPE for null email");
        assertThrows(NullPointerException.class, () -> new Visitor("name", "email", null, "plate", true), "Visitor constructor should throw NPE for null password");
        assertThrows(NullPointerException.class, () -> new NonFacultyMember("name", "email", "pass", null, true), "NonFaculty constructor should throw NPE for null licence plate");
    }
}