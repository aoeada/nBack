# NarwhalBackend
(I don't plan to make this very pretty, I apologize to your eyes)
How to get up and running with the Backend of the project:
	After cloning the repo to your system run NarwhalApplication as a 'Java Application'
	- this will do the necessary work needed to start the project on a local server
	- tomcat is being used to house the backend, it will load this aspect of the program at port 8080, this is very important since the frontend will be looking for all the rest points at that location
	- the frontend is running on port 4200, also important since we have given that port access to use the rest points
	
Classes are used to declare tables (objects)
Repositories are used to get information from the database (do sql queries)
Services are what call the queries and either manipulate that data or send it to the controller to be used by the frontend
Controllers create the Rest Api points, we give the actions we want to do a declaration as a GET, POST, PUT, DELETE, etc
	