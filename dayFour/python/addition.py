def get_sum (numbers, number):

    input = [8, 6, 12, 4, -2] 
    
    add = 6
    
    added = []
    
    new_count = 0
    
    for count in range (0, len(input)):
    
        for index in range (count+1, len(input)):
        
        if input[count] + input[index] == 6:
        
            added [new_count] = input[count]
            
            new_count = new_count + 1
            
            added [new_count] = input[index]
    
    
return added
