number_one = int(input("Enter a number: "))
number_two = int(input("Enter a number: "))
number_three = int(input("Enter a number: "))

largest = number_one

if number_two > largest:
    largest = number_two
elif number_three > largest:
    largest = number_three
    
print("The Largest")
