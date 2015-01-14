#!/bin/bash

echo "[INFO] Use MyBATIS Generator to generate the dao."

cd ..

set MAVEN_OPTS=%MAVEN_OPTS% -XX:MaxPermSize=128m

mvn clean antrun:run -Prefresh-db

mvn clean mybatis-generator:generate

cd bin
