# Employee

## Project Overview

Create a web application that exposes REST operations for employees.

Implemented n-tier design patterns (domain-services-business-presentation)
Implemented test suite testing lower layers, specifically testing DB connections
Restful interfaces execute all required use cases

Solution leverages Spring MVC and Security.  

## Requirements

### The API should be able to:


* Get employees by an ID

* Create new employee

* Update existing employee

* Delete employee

* Get all employees


An employee is made up of the following data:


### Employee spec


ID - Unique identifier for an employee


FirstName - Employee first name

MiddleInitial - Employee middle initial

LastName - Employee last name

DateOfBirth - Employee birthday and year

DateOfEmployment - Employee start date

Status - ACTIVE or INACTIVE


### Startup

-------


* On startup, the application should be able to ingest an external source of employees, and should make them available via the GET endpoint.


ACTIVE vs INACTIVE employees

----------------------------


* By default, all employees are active, but by way of the API, can be switched to inactive. This should be done by the delete API call. This call should require some manner of authorization header.

* When an employee is inactive, they should no longer be able to be retrieved in either the get by id, or get all employees calls


All data should be persisted into either memory, or externally. Please include instructions on how to run and interact with the web server.

## Build Environment

Netbeans 8.2
Mysql - SQL DB Create script included in github project under src/main/resources




