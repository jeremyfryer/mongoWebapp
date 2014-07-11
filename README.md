mongoWebapp
===========

Simple Spring MVC to get data and display with freemarker

http://HOSTNAME:PORT/mongo-webapp/welcome : Displays a hello world style page
http://HOSTNAME:PORT/mongo-webapp/mongo : Gets a record from MongoDB and display it

MongoDB DataSource
===========
This app is using the school database and students collection from the M101J Online Mongo class

#Docker build
===========
docker build -t 192.168.1.108:5000/centos7-mongowebapp .

This assumes private registry is running at 192.168.1.108:5000

#Docker run
===========
docker run -P -d --link=mongodb:mongodb 192.168.1.108:5000/centos7-mongowebapp

Again assuming private registry is running at 192.168.1.108:5000

--link=name:alias
name is the name of the container running mongo
alias is the name this container will use internally, currently code assumes it is "mongodb" (without quotes)