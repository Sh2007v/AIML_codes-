# # ==========================
# # 1. Check Positive Number
# # ==========================
# num = int(input("Enter a number: "))
# if num > 0:
#     print("Positive Number")


# # ==========================
# # 2. Check Pass or Not
# # ==========================
# marks = int(input("Enter marks: "))
# if marks >= 40:
#     print("Pass")


# # ==========================
# # 3. Check Divisible by 5
# # ==========================
# num = int(input("Enter a number: "))
# if num % 5 == 0:
#     print("Divisible by 5")


# # ==========================
# # 4. Voting Eligibility
# # ==========================
# age = int(input("Enter your age: "))
# if age >= 18:
#     print("Eligible to Vote")


# # ==========================
# # 5. Check Vowel
# # ==========================
# ch = input("Enter a character: ")
# if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u' or \
#    ch == 'A' or ch == 'E' or ch == 'I' or ch == 'O' or ch == 'U':
#     print("Vowel")


# # ==========================
# # 6. Three-Digit Number
# # ==========================
# num = int(input("Enter a number: "))
# if 100 <= abs(num) <= 999:
#     print("Three-Digit Number")


# # ==========================
# # 7. Century Year
# # ==========================
# year = int(input("Enter a year: "))
# if year % 100 == 0:
#     print("Century Year")


# # ==========================
# # 8. Check Alphabet
# # ==========================
# ch = input("Enter a character: ")
# if ('A' <= ch <= 'Z') or ('a' <= ch <= 'z'):
#     print("Alphabet")


# # ==========================
# # 9. Divisible by Both 3 and 7
# # ==========================
# num = int(input("Enter a number: "))
# if num % 3 == 0 and num % 7 == 0:
#     print("Divisible by both 3 and 7")


# # ==========================
# # 10. Scholarship Eligibility
# # ==========================
# marks = int(input("Enter marks: "))
# attendance = int(input("Enter attendance percentage: "))

# if marks >= 90 and attendance >= 85:
#     print("Eligible for Scholarship")

# # ==========================================
# # 1. Armstrong Number (3-digit)
# # ==========================================
# num = int(input("Enter a 3-digit number: "))

# a = num // 100
# b = (num // 10) % 10
# c = num % 10

# if a**3 + b**3 + c**3 == num:
#     print("Armstrong Number")


# # ==========================================
# # 2. Strong Number
# # ==========================================
# num = int(input("Enter a number: "))

# a = num // 100
# b = (num // 10) % 10
# c = num % 10

# fact1 = 1
# fact2 = 1
# fact3 = 1

# for i in range(1, a + 1):
#     fact1 *= i

# for i in range(1, b + 1):
#     fact2 *= i

# for i in range(1, c + 1):
#     fact3 *= i

# if fact1 + fact2 + fact3 == num:
#     print("Strong Number")


# # ==========================================
# # 3. Perfect Square
# # ==========================================
# num = int(input("Enter a number: "))

# root = int(num ** 0.5)

# if root * root == num:
#     print("Perfect Square")


# # ==========================================
# # 4. Number Lies Between Two Numbers
# # ==========================================
# num = int(input("Enter number: "))
# start = int(input("Enter starting value: "))
# end = int(input("Enter ending value: "))

# if start <= num <= end:
#     print("Number lies in the range.")


# # ==========================================
# # 5. Triangle Validity
# # ==========================================
# a = int(input("Enter first angle: "))
# b = int(input("Enter second angle: "))
# c = int(input("Enter third angle: "))

# if a + b + c == 180:
#     print("Valid Triangle")


# # ==========================================
# # 6. Check Uppercase Alphabet
# # ==========================================
# ch = input("Enter a character: ")

# if 'A' <= ch <= 'Z':
#     print("Uppercase Alphabet")


# # ==========================================
# # 7. Divisible by 2, 3, 5 and 7
# # ==========================================
# num = int(input("Enter number: "))

# if num % 2 == 0 and num % 3 == 0 and num % 5 == 0 and num % 7 == 0:
#     print("Divisible by 2, 3, 5 and 7")


# # ==========================================
# # 8. Company Placement Eligibility
# # ==========================================
# cgpa = float(input("Enter CGPA: "))
# attendance = int(input("Enter Attendance (%): "))
# backlogs = int(input("Enter Number of Backlogs: "))

# if cgpa >= 8.0 and attendance >= 75 and backlogs == 0:
#     print("Eligible for Placement")


# # ==========================================
# # 9. Equilateral Triangle
# # ==========================================
# a = int(input("Enter first side: "))
# b = int(input("Enter second side: "))
# c = int(input("Enter third side: "))

# if a == b == c:
#     print("Equilateral Triangle")


# # ==========================================
# # 10. Password Strength Checker
# # ==========================================
# password = input("Enter password: ")

# has_digit = False
# has_upper = False

# for ch in password:
#     if ch.isdigit():
#         has_digit = True

# for ch in password:
#     if ch.isupper():
#         has_upper = True

# if len(password) >= 8 and has_digit and has_upper:
#     print("Strong Password")

