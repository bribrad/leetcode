class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Understand:
        # input: int x
        # output: boolean, x as a string is or is not a palindrome
        
        # Test Cases:
        # 101, true

        # Match:
        # 2 pointer problem, start & end pointer. 
        
        # Pseudo code:
        # while x_str[s] == x_str[e] and s is not e:
        #   s++
        #   e--

        # if pointers not equal, not a palindrome

        # Implement

        x_string = str(x)
        s,e = 0, len(x_string) - 1

        while x_string[s] is x_string[e] and s is not e:
            s += 1
            e -= 1
        
        return s is e
        
        # Review
        # x_string = "101"
        # s = 0 = x_string[0] = '1'
        # e = 2 = x_string[2] = '1'

        # s = 1 = x_string[1] = '0'
        # e = 1 = x_string[1] = '0'
        
        # x_string = "-121"
        # s,0, '-'
        # e,3, '1'
        
        # Evaluate

print(Solution().isPalindrome(-101))
print(Solution().isPalindrome(101))
print(Solution().isPalindrome(122))
print(Solution().isPalindrome(121))
print(Solution().isPalindrome(0))
print(Solution().isPalindrome(10))