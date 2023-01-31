mkdir project
cd C:\Users\Afoop\bootcamp_projects\Michal_Pisula-kodilla_tester\build\libs
del *.jar
call gradlew build
IF EXIST "C:\Users\Afoop\bootcamp_projects\Michal_Pisula-kodilla_tester\build\libs\*.jar" COPY "C:\Users\Afoop\bootcamp_projects\Michal_Pisula-kodilla_tester\build\libs\*.jar" "C:\Users\Afoop\project" ELSE echo Compilation error
