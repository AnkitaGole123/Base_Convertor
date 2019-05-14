javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 7 123 > actual
diff actual ExpectedOutput

java OctalToDecimalConverter --base 7 1 > actual
diff actual ExpectedOutput1

java OctalToDecimalConverter --base 7 11 > actual
diff actual ExpectedOutput2