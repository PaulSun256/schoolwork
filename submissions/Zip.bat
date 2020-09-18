@ECHO OFF
REM INPUT FOR
SET /P ID="what assignment to zip: "
jar -cfM Sun_Paul_Assignment%ID%.zip ../assignment%ID%
IF EXIST Sun_Paul_Assignment%ID%.zip GOTO fileExists 
GOTO oops
:fileExists
ECHO assignment successfully zipped
GOTO end
:oops
ECHO something went wrong oops lol
:end
pause