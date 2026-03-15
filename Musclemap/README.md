
# Tutorial 1 - Hello Kotlin. Hello Mobile Android World!

**Course:** Computação Móvel  
**Student(s):**  
**Date:**  
**Repository URL:**  

---

## 1. Introduction
This assignment focuses on the development of a simple Android mobile application using **Kotlin** and **XML Views**.  
The main objective is to understand the structure of an Android project, configure the development environment in Android Studio and implement a basic mobile application.

The developed application, **MuscleMap**, presents a small catalogue of gym exercises. The user can view a list of exercises and open a detailed screen with more information about each exercise.

---

## 2. System Overview
The **MuscleMap** application was designed to present fitness exercises in a simple mobile interface.

Main features:

- Display a list of exercises
- Show the exercise image and category
- Allow the user to click an exercise
- Open a new screen with detailed information

The application uses standard Android components such as **Activities**, **RecyclerView**, and **Kotlin data classes**.

---

## 3. Architecture and Design
The application architecture is based on a typical Android structure.

Main components:

- **MainActivity** – responsible for displaying the list of exercises
- **Exercise (Data Class)** – represents the exercise data model
- **ExerciseAdapter** – connects exercise data to the RecyclerView
- **ExerciseDetailActivity** – displays detailed exercise information

The **RecyclerView** component is used to efficiently display multiple items on the screen.

---

## 4. Implementation
The implementation was developed using **Kotlin** for application logic and **XML** for user interface layouts.

Main modules:

- `Exercise.kt` – defines the exercise data structure
- `MainActivity.kt` – initializes the exercise list and RecyclerView
- `ExerciseAdapter.kt` – binds exercise data to the interface
- `ExerciseDetailActivity.kt` – shows detailed information for the selected exercise

Navigation between screens is performed using **Android Intent objects**.

---

## 5. Testing and Validation
The application was tested using the **Android Studio Emulator**.

Tests performed:

- Application startup verification
- Validation of exercise list display
- Testing item click functionality
- Confirmation that the detail screen loads correctly

No major functional errors were detected during testing.

---

## 6. Usage Instructions
Steps to run the project:

1. Install **Android Studio**
2. Open the project folder
3. Allow **Gradle** to sync dependencies
4. Launch an Android emulator or connect a device
5. Press **Run** to start the application

---

# Autonomous Software Engineering Sections

## 7. Prompting Strategy
AI tools were used to assist in generating structured documentation and explanations for the project.

Prompts were designed to:
- Generate a report structure
- Explain Android components
- Organize technical documentation

---

## 8. Autonomous Agent Workflow
AI tools assisted in documentation support and explanation of development steps.

However, the core development tasks such as:
- Coding
- Layout design
- Testing

were performed by the student.

---

## 9. Verification of AI Generated Artifacts
All generated content was manually verified to ensure:

- Correct technical explanations
- Consistency with the project
- Alignment with the assignment requirements

Manual review was performed before submission.

---

## 10. Human vs AI Contribution

### Human Contribution
- Android project development
- Code implementation
- Application testing
- Design decisions

### AI Contribution
- Documentation assistance
- Code explanation support
- Report structuring

---

## 11. Ethical and Responsible Use
AI tools were used responsibly only to assist with explanations and documentation.

The student remains fully responsible for the final implementation and validation of the project.

---

## 12. Version Control and Commit History
Version control was implemented using **Git** and **GitHub**.

The repository allows tracking of project changes and ensures proper version management during development.

---

## 13. Difficulties and Lessons Learned
During the development process several challenges were encountered:

- Understanding Android project structure
- Configuring the emulator
- Implementing RecyclerView
- Managing activity navigation

This project helped reinforce Kotlin programming and Android development fundamentals.

---

## 14. Future Improvements
Possible future improvements include:

- Adding more exercises
- Implementing search functionality
- Adding exercise categories
- Improving UI design

---

## 15. AI Usage Disclosure (Mandatory)
AI tools used during this assignment:

- **ChatGPT** – assistance with documentation structure and explanations

The student confirms responsibility for all final project content.
