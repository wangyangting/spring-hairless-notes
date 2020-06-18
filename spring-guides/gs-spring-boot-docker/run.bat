@echo off
cd /d %~dp0

echo "--------- maven compile start ---------"
mvn clean package & ^
echo "--------- maven compile end ---------" & ^

echo "--------- docker build start ---------" & ^
docker build -t hairless/gs-spring-boot-docker . & ^
echo "--------- docker build end ---------" & ^

echo "--------- docker run start ---------" & ^
docker run -p 8080:8080 hairless/gs-spring-boot-docker . & ^
echo "--------- docker run end ---------" & ^
pause
