javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 123 > actual
diff actual ExpectedOutputOfBase8

java OctalToDecimalConverter --base 5 1 > actual
diff actual ExpectedOutputOfBase5

java OctalToDecimalConverter --base 2 34 > actual
diff actual ExpectedOutputOfBase2