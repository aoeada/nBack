-- To be used to store sql calls to load generic data into the database so we have users and records to test with

/* users table reference columns
	userID    username    password    firstname    lastname		*/
insert into users (username, password, firstname, lastname) values ('SuperAdmin', 'Narwhal123', 'Sean', 'Brogan');


/* medicalRecord table reference columns
	recordId    patientId    doctorId    treatment    description	*/
insert into medicalRecord () values ();