CREATE TABLE BUILD (
    BUILD_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    BUILD_NAME VARCHAR(50) NOT NULL
);
CREATE TABLE DEPARTMENT(
    DEPARTMENT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR(50) NOT NULL
);
CREATE TABLE DIVISION (
    DIVISION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    DIVISION_NAME VARCHAR(50) NOT NULL
);

CREATE TABLE USERS (
    USER_ID BIGINT PRIMARY KEY ,
    USER_NAME VARCHAR(50) NOT NULL,
    USERTYPE VARCHAR(50) NOT NULL ,
    USER_MAIL VARCHAR(50) NOT NULL,
    USER_PHONE VARCHAR(50) NOT NULL,
    USER_PASSWORD VARCHAR(50) NOT NULL,
    DIVISION_ID BIGINT ,
     CONSTRAINT FK_DIVISION FOREIGN KEY (DIVISION_ID) REFERENCES DIVISION(DIVISION_ID) 
);

CREATE TABLE ROOM (
    ROOM_ID BIGINT PRIMARY KEY,
    CAPACITY INT NOT NULL,
    BUILD_ID BIGINT,
    DEPARTMENT_ID BIGINT,
    CONSTRAINT FK_BUILD FOREIGN KEY (BUILD_ID) REFERENCES BUILD(BUILD_ID),
    CONSTRAINT FK_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(DEPARTMENT_ID)
);

CREATE TABLE BOOKINGDATA (
    REFID BIGINT AUTO_INCREMENT PRIMARY KEY,

    DATEREQ DATE ,
    DATESTART DATE ,
    DATEEND DATE ,


    TIMESTART TIME ,
    TIMEEND TIME ,

    
    APPROVE_TEACHER_ID INT,
    APPROVE_DEPARTMENT_ID INT,
    APPROVE_DIRECTOR_ID INT,


    APPROVE_DATE_TEACHER DATE,
    APPROVE_DATE_DEPARTMENT DATE,
    APPROVE_DATE_DIRECTOR DATE,

    
    BOOKINGSTATUS VARCHAR(50) , -- This assumes you are using string representation for the Status enum

    REASON VARCHAR(255),    

    USER_ID BIGINT,
    ROOM_ID BIGINT,
    CONSTRAINT FK_USER FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID),
    CONSTRAINT FK_ROOM FOREIGN KEY (ROOM_ID) REFERENCES ROOM(ROOM_ID)
);

