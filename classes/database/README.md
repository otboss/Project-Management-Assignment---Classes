This directory is a portable mongo database for storing all the software data. This database server must be started using mongod.
<br>
The database server should be started using the following command from this directory:
<br>
mongod --port 27018 --dbpath ./mongodb;
<br>
<br>
Please remember to remove all journal files ("./mongodb/journal/") before pushing to the repository! These files are very large.