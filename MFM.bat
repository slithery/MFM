@echo off
REM Command Switches: -list (list only view); -d (debug logging); -m (memory usage logging); -all (Includes non runnable systems)

java -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -Xms2g -Xmx3g -jar .\MFM.jar

REM Next entry is for 32 bit Java if 64 bit is not possible
REM java -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -Xms1280m -Xmx1280m -jar .\MFM.jar

REM Next entry is for full debug
REM java -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -Xloggc:./Logs/MFM_GC_log.txt -Xms2g -Xmx3g -jar .\MFM.jar -d -s -m

REM Next entry is for running recent(MAME 143+) ALL sets
REM java -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -Xms4g -Xmx4g -jar .\MFM.jar
