javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 123 > actual
diff actual ExpectedOutput

java OctalToDecimalConverter --base 8 1 > actual
diff actual ExpectedOutput1

java OctalToDecimalConverter --base 2 34 > actual
diff actual ExpectedOutput2