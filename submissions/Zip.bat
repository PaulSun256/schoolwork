@ECHO OFF
SET /P ID="what assignment to zip: "
jar -cfM Sun_Paul_Assignment%ID%.zip ../Sun_Paul/src/Sun_Paul_Assignment%ID%

REM CHECK IF FILE EXISTS
IF EXIST Sun_Paul_Assignment%ID%.zip GOTO FILEEXISTS 
GOTO OOPS
:FILEEXISTS
ECHO assignment successfully zipped
GOTO END
:OOPS
ECHO something went wrong oops lol
:END

REM STOPS WINDOW FROM IMMEDIATELY CLOSING
PAUSE