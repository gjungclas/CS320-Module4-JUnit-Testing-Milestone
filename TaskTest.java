import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


public class TaskTest {
	// Declare object variable for all methods can use
	private Task task;
	
	@BeforeAll
	static void beginTesting() {
		System.out.println("Beginning JUnit testing...");
	}
	
	@AfterAll
	static void testingComplete() {
		System.out.println("...JUnit testing has completed.");
	}
	
	
	@BeforeEach
	void testTaskSetUp() {
		// instantiate a new object BEFORE each test runs
		task = new Task("1234567891", "Module 4 Assignment", "Write unit tests to verify and validate code.");
	}
	
		@Test
	void taskTestClass() {
		// check if object correctly sets taskId input string
		assertEquals("1234567891", task.getTaskId());
		// check if object correctly sets name input string
		assertEquals("Module 4 Assignment", task.getName());
		// check if object correctly sets description input string
		assertEquals("Write unit tests to verify and validate code.", task.getDescription());
	}
	
	// ================================================================================================
	// TASK ID SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Task Id Tests")
	class TestTaskId {
		@Test
		void taskTestTaskIdIsNull() {
			// test if error is correctly thrown when taskId is null
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task(null, "Module 4 Assignment", "Write unit tests to verify and validate code.");			
			});
		}
		
		@Test
		void taskTestTaskIdTooLong() {
			// test if error is correctly thrown when taskID is > 10 characters
			// set taskId to 11 characters (edge case)
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("12345678911", "Module 4 Assignment", "Write unit tests to verify and validate code.");
			});
		}
	}	
	
	// ================================================================================================
	// TASK NAME SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Task Name Tests")
	class TestTaskName{
		@Test
		void taskTestNameIsNull() {
			// test if error is correctly thrown when name is null
			// set name to null
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("1234567891", null, "Write unit tests to verify and validate code.");
			});
		}
		
		@Test
		void taskTestNameIsTooLong() {
			// test if error is correctly thrown when name is > 20 characters
			// set name to 21 characters (edge case)
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("1234567891", "Module 4 Assignmenttt", "Write unit tests to verify and validate code.");
			});
		}
	}
	
	// ================================================================================================
	// TASK DESCRIPTION SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Task Description Tests")
	class TestTaskDescription{
		@Test
		void taskTestDescriptionIsNull() {
			// test if error is correctly thrown when description is null
			// set description to null
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("1234567891", "Module 4 Assignment", null);
			});
		}
		
		@Test
		void taskTestDescriptionTooLong() {
			// test if error is correctly thrown when description is > 50 characters
			// set description to 51 characters (edge case)
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("1234567891", "Module 4 Assignment", "Write unit tests to verify and validate code.......");
			});
		}
	}
}
