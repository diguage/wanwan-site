@echo off
echo [INFO] Use MyBATIS Generator to generate the dao.

cd %~dp0
cd ..

set MAVEN_OPTS=%MAVEN_OPTS% -XX:MaxPermSize=128m

call mvn clean antrun:run -Prefresh-db

call mvn clean mybatis-generator:generate

cd bin
pause
