# MakeMyTrip Flight Search Automation

## Overview
This project automates a flight search scenario on the MakeMyTrip website using Selenium WebDriver with Java.

## Tools & Technologies
- Java
- Selenium WebDriver
- TestNG
- Maven

## Test Scenario
1. Open makemytrip.com
2. Close login popup
3. Select Round Trip option
4. Enter From City: Kolkata
5. Enter To City: Delhi
6. Open the dynamic calendar
7. Capture all available prices
8. Identify the lowest price
9. Perform flight search

## Project Structure

makemytrip-flight-search-automation
│
├── FlightSearchTest.java
├── pom.xml
├── testng.xml
└── README.md

## How to Run
1. Clone the repository
2. Open project in IntelliJ / Eclipse
3. Run FlightSearchTest.java
