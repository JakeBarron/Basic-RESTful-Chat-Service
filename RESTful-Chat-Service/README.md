# Basic-RESTful-Chat-Service
This is a minimal chat service implemented in Spring

## Description
This project implements a RESTful chat server with support for registering, editing, deleting, and searching for users. 

## To Compile and Run
1. Clone this repository. 
1. From inside the top-level directory of the repository, build and run with Maven: `mvn clean install spring-boot:run`.   

## Associated Documentation 
1. See `src/main/resources/db.migration` for the scripts that populate the in-memory MySQL database.  
1. A dump of the in-memory MySQL database AFTER the above testing steps were completed is included in the top-level directory of the repository as `mySQLDump.txt`.  