@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  com.sprint startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and COM_SPRINT_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\com.sprint-1.0-SNAPSHOT.jar;%APP_HOME%\lib\spring-boot-starter-web-2.2.1.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-json-2.1.7.RELEASE.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.9.9.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.9.9.jar;%APP_HOME%\lib\jackson-module-parameter-names-2.9.9.jar;%APP_HOME%\lib\jackson-databind-2.10.1.jar;%APP_HOME%\lib\jackson-core-2.10.1.jar;%APP_HOME%\lib\camunda-connect-http-client-1.0.1.jar;%APP_HOME%\lib\json-20190722.jar;%APP_HOME%\lib\springfox-swagger2-2.9.2.jar;%APP_HOME%\lib\springfox-swagger-common-2.9.2.jar;%APP_HOME%\lib\swagger-models-1.5.20.jar;%APP_HOME%\lib\jackson-annotations-2.10.1.jar;%APP_HOME%\lib\lombok-1.18.10.jar;%APP_HOME%\lib\spring-security-config-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-security-web-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-security-ldap-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-kafka-2.2.8.RELEASE.jar;%APP_HOME%\lib\postgresql-42.2.5.jar;%APP_HOME%\lib\springfox-swagger-ui-2.9.2.jar;%APP_HOME%\lib\spring-boot-starter-validation-2.1.7.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-2.1.7.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-logging-2.1.7.RELEASE.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\spring-ldap-core-2.3.2.RELEASE.jar;%APP_HOME%\lib\kafka-clients-2.0.1.jar;%APP_HOME%\lib\springfox-spring-web-2.9.2.jar;%APP_HOME%\lib\springfox-schema-2.9.2.jar;%APP_HOME%\lib\springfox-spi-2.9.2.jar;%APP_HOME%\lib\springfox-core-2.9.2.jar;%APP_HOME%\lib\spring-plugin-metadata-1.2.0.RELEASE.jar;%APP_HOME%\lib\spring-plugin-core-1.2.0.RELEASE.jar;%APP_HOME%\lib\camunda-connect-core-1.0.1.jar;%APP_HOME%\lib\camunda-commons-utils-1.0.6.jar;%APP_HOME%\lib\camunda-commons-logging-1.0.6.jar;%APP_HOME%\lib\log4j-to-slf4j-2.11.2.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.26.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\commons-io-2.6.jar;%APP_HOME%\lib\guava-23.0.jar;%APP_HOME%\lib\httpclient-4.5.9.jar;%APP_HOME%\lib\commons-lang3-3.9.jar;%APP_HOME%\lib\spring-boot-starter-tomcat-2.1.7.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-web-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-security-core-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-boot-autoconfigure-2.1.7.RELEASE.jar;%APP_HOME%\lib\spring-boot-2.1.7.RELEASE.jar;%APP_HOME%\lib\spring-context-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-aop-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-tx-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-messaging-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-expression-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-core-5.1.9.RELEASE.jar;%APP_HOME%\lib\spring-retry-1.2.4.RELEASE.jar;%APP_HOME%\lib\swagger-annotations-1.5.20.jar;%APP_HOME%\lib\hibernate-validator-6.0.17.Final.jar;%APP_HOME%\lib\classmate-1.4.0.jar;%APP_HOME%\lib\mapstruct-1.2.0.Final.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\jsr305-1.3.9.jar;%APP_HOME%\lib\error_prone_annotations-2.0.18.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\httpcore-4.4.11.jar;%APP_HOME%\lib\commons-codec-1.11.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\snakeyaml-1.23.jar;%APP_HOME%\lib\tomcat-embed-websocket-9.0.22.jar;%APP_HOME%\lib\tomcat-embed-core-9.0.22.jar;%APP_HOME%\lib\tomcat-embed-el-9.0.22.jar;%APP_HOME%\lib\spring-jcl-5.1.9.RELEASE.jar;%APP_HOME%\lib\lz4-java-1.4.1.jar;%APP_HOME%\lib\snappy-java-1.1.7.1.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\jboss-logging-3.3.2.Final.jar;%APP_HOME%\lib\byte-buddy-1.9.16.jar;%APP_HOME%\lib\log4j-api-2.11.2.jar

@rem Execute com.sprint
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %COM_SPRINT_OPTS%  -classpath "%CLASSPATH%" com.uk.sprint.Rest.SprintAplication %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable COM_SPRINT_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%COM_SPRINT_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
