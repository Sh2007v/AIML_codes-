#if else elif statements.

# eg 1(if)
num = int(input("Enter a number: "))

if num > 0:
    print("Positive Number")


# eg 2 (if-else)
num = int(input("Enter a number: "))

if num % 2 == 0:
    print("Even Number")
else:
    print("Odd Number")


# eg 3 (if elif else)

marks = int(input("Enter your marks: "))

if marks >= 90:
    print("Grade A")
elif marks >= 80:
    print("Grade B")
elif marks >= 70:
    print("Grade C")
elif marks >= 60:
    print("Grade D")
else:
    print("Grade F") 


# eg 3 (Nested if)
age = int(input("Enter your age: "))
citizen = input("Are you a citizen? (yes/no): ")

if age >= 18:
    if citizen.lower() == "yes":
        print("Eligible to Vote")
    else:
        print("Not Eligible (Not a Citizen)")
else:
    print("Not Eligible (Underage)")

# eg 4 (match)
day = int(input("Enter a number (1-3): "))

match day:
    case 1:
        print("Monday")
    case 2:
        print("Tuesday")
    case 3:
        print("Wednesday")
    case _:
        print("Invalid Input")

