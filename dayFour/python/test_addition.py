from unittest import TestCase

import addition

def class test_addition:

    def test_that_a_list_checks_for_two_numbers_and_adds_to_give_a_specific_number(self):
        
        number = [8, 6, 12, 4, -2]
        
        expected = [8, -2]
        
        actual = addition.get_sum(numbers, number)
        
        self.assertEqual(expected, actual) 
        
