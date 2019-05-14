javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 123 > actual
diff actual ExpectedOutputOfBase8for123number

java OctalToDecimalConverter --base 8 1 > actual
diff actual ExpectedOutputOfBase8for1number

java OctalToDecimalConverter --base 2 34 > actual
diff actual ExpectedOutputOfBase2for34number