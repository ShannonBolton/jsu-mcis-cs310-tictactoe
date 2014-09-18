cd acceptance
javac -cp .;..\build\classes\main TicTacToeKeywords.java
java -cp .;..\build\classes\main;C:\RobotFramework\robotframework-2.8.5.jar;C:\robotFramework\swinglibrary-1.8.0.jar org.robotframework.RobotFramework TicTacToeGUITests.txt
cd ..