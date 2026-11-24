# Fit Quest (Debugging Assignment)

Fit Quest is a small Spring Boot fitness tracker. It has bugs. Your job is to find and fix them!

## App Requirements

Your finished app must do all of the following:

- When the app starts, the user has **0 fitness points**.
- The user can log 4 different activities:
  - **Walk**: earns 5 to 10 points
  - **Yoga**: earns 10 to 20 points
  - **Weights**: earns 15 to 30 points
  - **Daily Challenge**: can **earn or lose** up to 50 points
- There are **4 separate forms**, each making a **POST** request.
- Hidden inputs are used to tell the forms apart.
- The controller uses only **2 methods** (one GET, one POST).
- Points and the activity log are stored in **session**.
- The page shows the current points and a log of past activities, newest first.
- Earned points show in green. Lost points show in red.

## How to Run

1. Clone this repo and open it in your IDE (Spring Tool Suite, IntelliJ, or VS Code).
2. Run `FitquestApplication.java`, or run `mvn spring-boot:run` in the project folder.
3. Visit http://localhost:8080

## Project Structure

```
src/main/java/com/fitquest/FitquestApplication.java
src/main/java/com/fitquest/controllers/FitQuestController.java
src/main/resources/application.properties
src/main/resources/static/css/style.css
src/main/webapp/WEB-INF/index.jsp
```

Happy debugging!
