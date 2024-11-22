## Explicit Intents in Android

This project demonstrates the use of Explicit Intents in an Android application.

**Explicit Intents Explained**

Explicit intents are more specific than implicit intents. They explicitly specify the target activity  you want to launch within the same application. This allows for more control over the app flow and data sharing between activities.

**Example: Launching a News Activity**

This program demonstrates how to navigate between two activities within the same application: `MainActivity` and `MainActivity2`. Clicking a button in `MainActivity` launches `MainActivity2`, which represents a "News" screen. Another button in `MainActivity2` navigates back to `MainActivity`.

**Code Breakdown:**

**1. Project Structure:**

  - The project consists of two activity classes: `MainActivity` and `MainActivity2`.

**2. MainActivity:**
\- Handles the main screen and initiates the navigation to the "News" activity.


**3. MainActivity2:**
\- Handles the "News" screen and provides navigation back to `MainActivity`.


**Running the Application:**

1.  Build and run the application on an Android device or emulator.
2.  Click the button in `MainActivity`. This should launch the "News" screen (`MainActivity2`).
3.  Click the button in `MainActivity2` to return to the main screen (`MainActivity`).

**Benefits of Explicit Intents:**

  - **Control:** They allow for more control over the flow of your application by explicitly specifying the target activity.
  - **Data Sharing:** You can easily pass data between activities using explicit intents.
