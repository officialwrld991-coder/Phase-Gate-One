import random

random_number = random.randint(1,100)


for count in range(1,6):
    user_input = int(input("Enter A Number from 1 to 100: "))
    if random_number == user_input:
        new_count = count
        if new_count == 1:
            print(f"The Correct Number is {user_input} With {new_count} attempts used and a Legendary rating")
        if new_count == 2:
            print(f"The Correct Number is {user_input} With {new_count} attempts used and a Excellent rating")
        if new_count == 3 or new_count == 4:
            print(f"The Correct Number is {user_input} With {new_count} attempts used and a Good rating")
        if new_count == 5:
            print(f"The Correct Number is {user_input} With {new_count} attempts used and a Close rating")
    
        break
    
    elif random_number != user_input:
        if user_input < random_number:
            print("Lower than Stake")
        elif user_input > random_number:
            print("Higher that Stake")
            
print()
print("Ohh! Chances ran out")   
print("Better Luck Next Time")            
