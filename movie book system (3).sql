CREATE TABLE Customer
(
  C_ID INT ,
  Password INT NOT NULL,
  fname VARCHAR(20) NOT NULL,
  lname VARCHAR(20) NOT NULL,
  Age INT NOT NULL,
  Email VARCHAR(30) NOT NULL,
  PRIMARY KEY (C_ID)
);

ALTER TABLE CUSTOMER
ALTER COLUMN Email Varchar(30);

ALTER TABLE CUSTOMER ADD CONSTRAINT MINAGE CHECK (age > 16); 

select * from Customer;

CREATE TABLE Manager
(
  M_ID INT ,
  M_Password VARCHAR(20) NOT NULL,
  PRIMARY KEY (M_ID)
);

select * from Manager;

CREATE TABLE Payment
(
  P_ID INT ,
  Debit_Card INT NOT NULL,
  Credit_Card INT NOT NULL,
  Customer_ID INT NOT NULL,
  PRIMARY KEY (P_ID),
  FOREIGN KEY (Customer_ID) REFERENCES Customer(C_ID)
);

select * from Payment;

CREATE TABLE Receipt
(
  R_ID INT ,
  Receipt_Date DATE NOT NULL,
  Amount INT NOT NULL,
  P_ID INT NOT NULL,
  PRIMARY KEY (R_ID),
  FOREIGN KEY (P_ID) REFERENCES Payment(P_ID)
);

select * from Receipt;

CREATE TABLE Theatre
(
  Th_ID INT ,
  Th_Name VARCHAR(30) NOT NULL,
  M_ID INT NOT NULL,
  PRIMARY KEY (Th_ID),
  FOREIGN KEY (M_ID) REFERENCES Manager(M_ID)
);

select * FROM Theatre;

CREATE TABLE Stall
(
  Fastfood VARCHAR(30) NOT NULL,
  Beverages VARCHAR(15) NOT NULL,
  St_Id INT ,
  Th_ID INT NOT NULL,
  PRIMARY KEY (St_Id),
  FOREIGN KEY (Th_ID) REFERENCES Theatre(Th_ID)
);

select * from stall;

CREATE TABLE Seats
(
  Seat_ID INT ,
  No_of_seats INT NOT NULL,
  Th_ID INT NOT NULL,
  PRIMARY KEY (Seat_ID),
  FOREIGN KEY (Th_ID) REFERENCES Theatre(Th_ID)
);

select * from seats;

CREATE TABLE Ticket
(
  T_ID INT ,
  Show_ID VARCHAR(12) NOT NULL,
  Seat_No VARCHAR(5) NOT NULL,
  Th_ID INT NOT NULL,
  PRIMARY KEY (T_ID),
  FOREIGN KEY (Th_ID) REFERENCES Theatre(Th_ID)
);

select * from ticket;

CREATE TABLE Customer_Ticket
(
  C_ID INT ,
  T_ID INT NOT NULL,
  PRIMARY KEY (C_ID, T_ID),
  FOREIGN KEY (C_ID) REFERENCES Customer(C_ID),
  FOREIGN KEY (T_ID) REFERENCES Ticket(T_ID)
);

select * from customer_ticket;

CREATE TABLE Show_
(
  T_ID INT ,
  Date DATE NOT NULL,
  PRIMARY KEY (T_ID),
  FOREIGN KEY (T_ID) REFERENCES Ticket(T_ID)
);

select * from Show_;

CREATE TABLE Movies
(
  Movie_ID INT ,
  Description VARCHAR(100) NOT NULL,
  Movie_Name VARCHAR(30) NOT NULL,
  T_ID INT NOT NULL,
 PRIMARY KEY (Movie_ID),
  FOREIGN KEY (T_ID) REFERENCES Show_(T_ID)
);

select * from Movies;

CREATE TABLE Stand_up_comedy
(
  Sc_ID INT ,
  Sc_Name VARCHAR (25) NOT NULL,
  T_ID INT NOT NULL,
  PRIMARY KEY (Sc_ID),
  FOREIGN KEY (T_ID) REFERENCES Show_(T_ID)
);
select * from Stand_up_comedy ;


insert into customer values (1,14567,'Ramesh','Mahajan',18,'Ramesh12@gmail.com');
insert into customer values (2,14568,'Kierra','Cantrell',21,'Kierra0987@gmail.com');
insert into customer values (3,14569,'Alvaro','Morata',47,'MoratasAl@gmail.com');
insert into customer values (4,14570,'Arjun','Nagpal',66,'ANagpal98@gmail.com');
insert into customer values (5,14571,'John','Cox',78,'JohnCox@gmail.com');
insert into customer values (6,14571,'Kevin','Lapsia',24,'Kevin3412@gmail.com');
insert into customer values (7,14572,'Tina','Patil',17,'PatilTinaT@gmail.com');
insert into customer values (8,14573,'Siddesh','Parab',31,'SidParab@gmail.com');
insert into customer values (9,14574,'Yatin','Lapsia',18,'YatinLP@gmail.com');
insert into customer values (10,14575,'Steven','Gerard',18,'SGLivar@gmail.com');

select * from customer;

insert into Manager values (101,'8076@123');
insert into Manager values (102,'sLEablete');
insert into Manager values (103,'UgAdocINE');
insert into Manager values (104,'guehUNdWo');
insert into Manager values (105,'enTrYmPER');
insert into Manager values (106,'IGLouSeTh');
insert into Manager values (107,'nimUGhert');
insert into Manager values (108,'RUSenTILO');
insert into Manager values (109,'hOEThwinc');
insert into Manager values (110,'sIstAwaL');

select * from Manager;

insert into Theatre values (1001,'PVR',103) ;
insert into Theatre values (1002,'Artcraft Theatre',104) ;
insert into Theatre values (1003,'Bleecker Street Cinema',108) ;
insert into Theatre values (1004,'Booth Theater',102) ;
insert into Theatre values (1005,'Imatra',106) ;
insert into Theatre values (1006,'Tennispalatsi',101) ;
insert into Theatre values (1007,'Royal Cinema',110) ;
insert into Theatre values (1008,'Rex Theatre',109) ;
insert into Theatre values (1009,'The Studio Ursulines',107) ;
insert into Theatre values (1010,'Rialto',103) ;

select * from Theatre;

insert into Stall values ('Samosa','Coffee',201,1001) ;
insert into Stall values ('Sandwhich','Tea',202,1002) ;
insert into Stall values ('Pop corn','Cold Coffee',203,1003) ;
insert into Stall values ('Samosa','Mango Juice',204,1004) ;
insert into Stall values ('Pop corn','Coke',205,1005) ;
insert into Stall values ('Burger','Coffee',206,1006) ;
insert into Stall values ('Frankie','Sprite',207,1007) ;
insert into Stall values ('Pizza','Coffee',208,1008) ;
insert into Stall values ('Chips','Limca',209,1009) ;
insert into Stall values ('Doritos','Coffee',210,1010) ;

select * from Stall;

insert into Seats values (10001,100,1009) ;
insert into Seats values (10002,88,1003) ;
insert into Seats values (10003,70,1006) ;
insert into Seats values (10004,95,1004) ;
insert into Seats values (10005,80,1001) ;
insert into Seats values (10006,83,1002) ;
insert into Seats values (10007,75,1007) ;
insert into Seats values (10008,60,1008) ;
insert into Seats values (10009,98,1005) ;
insert into Seats values (10010,100,1010) ;

select * from Seats;

insert into Ticket values (1,1,56,1009) ;
insert into Ticket values (2,1,72,1001) ;
insert into Ticket values (3,1,18,1002) ;
insert into Ticket values (4,1,54,1005) ;
insert into Ticket values (5,1,23,1003) ;
insert into Ticket values (20,2,19,1004) ;
insert into Ticket values (21,2,8,1007) ;
insert into Ticket values (22,2,42,1008) ;
insert into Ticket values (23,2,46,1010) ;
insert into Ticket values (24,2,41,1006) ;

select* from ticket;

insert into Customer_Ticket values (1,20);
insert into Customer_Ticket values (2,21);
insert into Customer_Ticket values (3,22);
insert into Customer_Ticket values (4,23);
insert into Customer_Ticket values (5,24);
insert into Customer_Ticket values (6,5);
insert into Customer_Ticket values (7,4);
insert into Customer_Ticket values (8,3);
insert into Customer_Ticket values (9,2);
insert into Customer_Ticket values (10,1);

select * from Customer_Ticket;

insert into Payment values (304,55850170,68160463,10);
insert into Payment values (305,46015730,87364334,5);
insert into Payment values (306,56051212,62129928,8);
insert into Payment values (307,55850170,95083907,6);
insert into Payment values (308,21894760,51449361,9);
insert into Payment values (309,55850170,22427887,7);
insert into Payment values (310,95083907,36403455,2);
insert into Payment values (311,22804674,68855334,4);
insert into Payment values (312,64037124,04666168,3);
insert into Payment values (313,55850170,92408597,1);

select * from Payment;

insert into Receipt values (730,'2020-11-07',399,304);
insert into Receipt values (731,'2020-11-06',199,305);
insert into Receipt values (732,'2020-11-01',799,306);
insert into Receipt values (733,'2020-10-30',399,307);
insert into Receipt values (734,'2020-10-31',560,308);
insert into Receipt values (735,'2020-11-01',399,309);
insert into Receipt values (736,'2020-11-03',399,310);
insert into Receipt values (737,'2020-11-01',199,311);
insert into Receipt values (738,'2020-11-04',399,312);
insert into Receipt values (739,'2020-11-04',999,313);

select * from Receipt;

insert into Show_ values (20,'2020-11-09');
insert into Show_ values (21,'2020-11-11');
insert into Show_ values (22,'2020-11-13');
insert into Show_ values (23,'2020-11-14');
insert into Show_ values (24,'2020-11-16');
insert into Show_ values (5,'2020-11-09');
insert into Show_ values (1,'2020-11-10');
insert into Show_ values (2,'2020-11-11');
insert into Show_ values (3,'2020-11-12');
insert into Show_ values (4,'2020-11-14');

select * from Show_;

insert into movies values (900,'Superhero film','Avenger Endgame',1);
insert into movies values  (901,'Science fiction film','Avtar',2);
insert into movies values (902,'Joker is the year’s most divisive studio movie','Joker',3);
insert into movies values (903,'Wall street film is based on share market scam','Wall street',4);
insert into movies values ( 904,'3 Idiots is a Indian Hindi-language coming-of-age comedy-drama film','3 idiots',5); 

select * from Movies;

insert into  Stand_up_comedy  values (800,'Zakir Khan',20);
insert into  Stand_up_comedy  values (801,'Tanmay Bhat',21);
insert into  Stand_up_comedy  values (802,'	Rahul Khanna',22);
insert into  Stand_up_comedy  values (803,'Kapil Sharma',23);
insert into  Stand_up_comedy  values (804,'Vinayak Mali',24);

select * from Stand_up_comedy