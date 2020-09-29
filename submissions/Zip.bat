@ECHO OFF
SET /P ID="what assignment to zip: "
jar -cfM Sun_Paul_Assignment%ID%.zip ../Sun_Paul/src/Sun_Paul_Assignment%ID%

REM CHECK IF FILE EXISTS
IF EXIST Sun_Paul_Assignment%ID%.zip GOTO fileExists 
GOTO oops
:fileExists
ECHO assignment successfully zipped
GOTO end
:oops
ECHO something went wrong oops lol
:end

REM STOPS WINDOW FROM IMMEDIATELY CLOSING
pause