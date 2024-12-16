# GYM-APP
A personal gym app built with React Native (frontend) and Spring Boot (backend). It allows users to track workouts, set goals, monitor progress, and connect with friends for motivation. Features include workout logging, goal setting, and push notifications for reminders and updates.

Personal Gym App (React Native & Spring Boot)

This is a personal gym application designed for fitness enthusiasts to track workouts, set goals, and stay motivated. The app is built with React Native on the frontend and Spring Boot on the backend, providing a seamless and efficient experience for users.

Features:
-- User Authentication: Secure sign-in and sign-up functionality.
-- Workout Tracking: Users can log and track their workouts, including exercises, sets, reps, and weights.
-- Goal Setting: Set and track fitness goals (e.g., weight targets, workout consistency).
-- Progress Monitoring: Visualize progress with charts and history of past workouts.
-- Friend Integration: Add friends, share progress, and motivate each other through a social aspect.
-- Push Notifications: Receive reminders and motivational messages to stay on track.

Technologies:
Frontend: React Native for cross-platform mobile app development.
Backend: Spring Boot for building a robust and scalable backend API.
Database: MySQL.
Authentication: JWT (JSON Web Tokens) for secure user authentication and authorization.


Installation:
Frontend (React Native):

Clone this repository.
Run npm install to install dependencies.
Run react-native run-android or react-native run-ios to start the app.
Backend (Spring Boot):

Clone the backend repository.
Run mvn clean install to build the backend.
Start the backend with java -jar target/your-backend-application.jar.
Contributing:
Feel free to fork this repo and submit pull requests with improvements, features, or bug fixes. Please ensure that all contributions follow the coding standards used in the project.

////////////////////////////////////////

front-end - React-Native
Back-end  - SpringBoot
DB        - MySql localhost:3306
#E4D9C6; - SOFT BEIGE - TEXT
#2A403D; - green - BACKGROUND COLOR

- user
    login / reg(sign-up)
    
    -registration/sign-up
       username/gmail
       password     // 1cap , 1 spcl charcter , 1 number
       confirm password

    -custom user profile // user can skip this page if needed
       profile picture
       dob
       height
       body weight

    -login
       username/gmail
       password
       
     
     
    
    
- landing Page

     - show user profile
         show profile picture
         show current body weight
         show streak -(when user create a new workout each day streak should add up)
         -  log button - shows workout of last 1 week
         -  Add new workout button  +
         -  PR button - shows "dynamic" PR

     


concerns

- multiple users with same username/ Gmail should not be allowed