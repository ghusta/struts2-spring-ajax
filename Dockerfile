FROM tomcat:8.5

# $CATALINA_HOME is defined in tomcat image
ADD target/*.war $CATALINA_HOME/webapps/
