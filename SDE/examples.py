import numpy as np

n = int(input("Enter the number of elements: "))

numbers = []

for i in range(n):
    value = int(input(f"Enter element {i + 1}: "))
    numbers.append(value)

arr = np.array(numbers)

print("Elements of the array:")

for element in arr:
    print(element)