javac OctalToDecimalConverter.java
java OctalToDecimalConverter 123 > actual
diff actual ExpectedOutput

java OctalToDecimalConverter 01 > actual
diff actual ExpectedOutput1

java OctalToDecimalConverter 11 > actual
diff actual ExpectedOutput2