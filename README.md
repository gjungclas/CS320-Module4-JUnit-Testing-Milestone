# CS320-Module4-JUnit-Testing-Milestone
Code an application and provide unit tests to verify that the application meets the customer’s requirements.

## CS 320 Module Four Milestone Guidelines and Rubric
### Overview
As you have learned in previous modules, there are various types of software testing that can be employed for a given situation. As you did in the Module Three milestone, for this assignment, you will be creating unit tests using code to uncover errors in a mobile application. You will develop the task service and task object.

### Prompt
For Project One, which is due in Module Six, you are asked to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code the application and provide unit tests to verify that the application meets the customer’s requirements. For this milestone, you will focus on delivering the task services. The purpose of these services is to add, update, and delete task objects within the application.

The task service uses in-memory data structures to support storing tasks (no database required). In addition, there is no user interface for this milestone. You will verify the task service through JUnit tests. The task service contains a task object along with the task service. The requirements are outlined below.

### Task Class Requirements

The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Task Service Requirements

The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per task ID.
The task service shall be able to update task fields per task ID. The following fields are updatable:
Name
Description

### What to Submit
To complete this project, you must submit a Task Service zipped folder containing the following deliverables:

Task.java

TaskService.java

TaskTest.java

TaskServiceTest.java

# Reflection
I admit being overwhelmed when initally reading the textbook chapter assigned last week that included all of the options for unit testing. My work in Module 3 reflects simple, functional testing while maintaining 100% coverage. However, the principles became more familiar the more I used them (shocker). This assignment is, essentially, the same as the one in Module 3 and was designed to be a repetative way to cement the main tennents. Despite being initally overwhelmed, I achieved a 100% on the assignment; so, I chose to challenge myself this week and apply more advanced techniques to improved the cleaness and organization of my tests. I see the potential scaling of JUnit testing and how adventagious it can be when you run a test and see which specific logic in your code is causing issues with compilation or type errors (or any errors). These two assignments have shifted my comprehension of testing code: I will be a better programmer and engineer as I continue to thrive in my Computer Science program. 

'G
