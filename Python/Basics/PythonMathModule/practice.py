import math

a = 25
b = 18
x = 4.8

# Returns the square root of a number
print("Square Root:", math.sqrt(a))

# Returns the value of x raised to the power y
print("Power:", math.pow(2, 5))

# Returns the factorial of a positive integer
print("Factorial:", math.factorial(5))

# Rounds a number up to the nearest integer
print("Ceil:", math.ceil(x))

# Rounds a number down to the nearest integer
print("Floor:", math.floor(x))

# Returns the absolute (positive) value of a number
print("Absolute:", math.fabs(-15))

# Returns the Greatest Common Divisor (GCD) of two numbers
print("GCD:", math.gcd(18, 24))

# Returns the Least Common Multiple (LCM) of two numbers
print("LCM:", math.lcm(12, 18))

# Returns the IEEE 754 remainder of x divided by y
print("Remainder:", math.remainder(10, 3))

# Returns the floating-point remainder of x divided by y
print("Fmod:", math.fmod(10, 3))

# Removes the decimal part of a number
print("Truncate:", math.trunc(8.99))

# Returns the value of e raised to the power x
print("Exp:", math.exp(2))

# Returns e^x - 1 (useful for small values of x)
print("Expm1:", math.expm1(2))

# Returns the natural logarithm (base e)
print("Log:", math.log(10))

# Returns the base-10 logarithm
print("Log10:", math.log10(100))

# Returns the base-2 logarithm
print("Log2:", math.log2(64))

# Returns the sine of an angle (in radians)
print("Sin:", math.sin(math.pi / 2))

# Returns the cosine of an angle (in radians)
print("Cos:", math.cos(0))

# Returns the tangent of an angle (in radians)
print("Tan:", math.tan(0))

# Returns the inverse sine (arcsine)
print("ASin:", math.asin(1))

# Returns the inverse cosine (arccosine)
print("ACos:", math.acos(1))

# Returns the inverse tangent (arctangent)
print("ATan:", math.atan(1))

# Converts radians to degrees
print("Degrees:", math.degrees(math.pi))

# Converts degrees to radians
print("Radians:", math.radians(180))

# Returns the Euclidean distance between two points
print("Distance:", math.dist([2, 3], [5, 7]))

# Returns the length of the hypotenuse of a right-angled triangle
print("Hypotenuse:", math.hypot(3, 4))

# Returns the product of all elements in an iterable
print("Product:", math.prod([2, 3, 4]))

# Returns the integer square root of a number
print("Integer Square Root:", math.isqrt(27))

# Returns the number of combinations (nCr)
print("Combination:", math.comb(5, 2))

# Returns the number of permutations (nPr)
print("Permutation:", math.perm(5, 2))