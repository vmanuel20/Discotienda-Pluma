@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogota - Colombia)
REM Departamento de Ingenier�a de Sistemas y Computaci�n
REM Todos los derechos reservados 2005
REM Licenciado bajo el esquema Academic Free License version 2.1 
REM
REM Proyecto Cupi2
REM Ejercicio: n7_discotienda
REM Autor: Nicol�s L�pez - 06/12/2005
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM/


REM ---------------------------------------------------------
REM Borra todos los archivos generados por el build
REM ---------------------------------------------------------

cd ..\test
del classes\* /s /q 
del lib\discotiendaTest.jar /s /q 

cd ..\bin
