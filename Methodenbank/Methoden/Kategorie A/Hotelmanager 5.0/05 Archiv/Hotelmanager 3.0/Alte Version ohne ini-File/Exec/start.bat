@echo off

if exist D:\Neptun\Lehre\JDK1.3\nul  goto LocalJava

goto Weiter



:: --------------------------------------

:LocalJava

path=D:\Neptun\Lehre\JDK1.3\bin;%path%



:: Start -----------------------------------

:Weiter

echo Hotelmanager V 2.0

echo .

java -jar Hotelmanager.jar

