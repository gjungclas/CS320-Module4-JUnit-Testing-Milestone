import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

@DisplayName("Task Service Test Suite")
public class TaskServiceTest {
	// Declare object variables for all methods can use
	private Task task;
	private TaskService service;
		
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
		// clear or re-instantiate objects BEFORE each test runs (fresh instances for each test)
		service = new TaskService();
		task = new Task("1234567891", "Module 4 Assignment", "Write unit tests to verify and validate code.");
		}
	
	// ================================================================================================
	// ADD TASK SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Add Task Tests")
	class AddTaskTests{
		@Test
		void testAddTaskIsNullThrows() {
			// check if program throws error when task is null and passed into addTask method of service class
			assertThrows(IllegalArgumentException.class, () -> service.addTask(null));
		}
		
		@Test
		void testDuplicateIdThrows() {
			// check if program correctly throws error for duplicative taskIds
			// create another task with same id as task (initialized in set-up)
			Task task1 = new Task("1234567891", "Module 3 Assignment", "Introduction into unit testing.");
			
			// add first task to hash map
			service.addTask(task);
			// verify error correctly thrown when task1, which has a duplicate taskId, is passed into addTask method
			assertThrows(IllegalArgumentException.class, () -> service.addTask(task1));
		}
		
		@Test
		void testAddTaskSuccess() {
			// validate proper passing of task object into task service add task method
			// verify error not thrown when valid task is added (variables already initialized in public class)
			assertDoesNotThrow( () -> service.addTask(task));
		}
	}
	
	// ================================================================================================
	// DELETE TASK SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Delete Task Tests")
	class testDeleteTask{
		@Test
		void testDeleteTaskIsNullThrows() {
			// verify program throws error when task is null and passed into deleteTask method of service class
			assertThrows(IllegalArgumentException.class, () -> service.deleteTask(null));
		}
		
		@Test 
		void testDeleteTaskNotFoundThrows() {
			// verify exception thrown when trying to delete a taskId that was never entered
			assertThrows(IllegalArgumentException.class, () -> service.deleteTask("9999999999"));
		}
		
		@Test
		void testDeleteTaskSuccess() {
			// validate proper passing of taskId from task object into task service deleteTask method
			// add task to service (variables already initialized in setup)
			service.addTask(task);
			// pass taskId from task object and verify it deletes without throwing error
			assertDoesNotThrow( () -> service.deleteTask(task.getTaskId()));
		}
	}
	
	// ================================================================================================
	// UPDATE TASK SUITE
	// ================================================================================================	
	@Nested
	@DisplayName("Update Task Tests")
	class testUpdateTask {
		@Test
		void testUpdateTaskIsNullThrows() {
			// verify program throws error when task is null and passed into updateTask method of service class
			assertThrows(IllegalArgumentException.class, () -> service.updateTask(null, "Module 4 Assignment", "Write unit tests to verify and validate code."));
		}
		
		@Test
		void tesUpdateTaskNotFoundThrows() {
			// verify exception thrown when trying to update a taskId that was never entered
			assertThrows(IllegalArgumentException.class, () -> service.updateTask("9999999999", "Module 4 Assignment", "Write unit tests to verify and validate code."));
		}
		
		@Test
		void testUpdateTaskSuccess() {
			// validate proper passing of taskId from task object into task service updateTask method
			// add task to service (variables already initialized class or via setup)
			service.addTask(task);
			// pass taskId from task object and verify it updates name and description without throwing error
			assertDoesNotThrow( () -> service.updateTask("1234567891", "Module 3 Assignment", "Introduction into unit testing."));
			// verify name has been updated
			assertEquals(task.getName(), "Module 3 Assignment");
			// verify description has been updated
			assertEquals(task.getDescription(), "Introduction into unit testing.");
		}

	}
	
}
