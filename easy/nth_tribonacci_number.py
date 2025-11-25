"""
Completed: 2021-12-21
Difficulty: Easy
1137. N-th Tribonacci Number
https://leetcode.com/problems/n-th-tribonacci-number/description/
"""

def trib(n, memo):
    if (n < 3):
        return memo[n]
    if (memo[n] is not None):
        return memo[n]
    memo[n] = trib(n - 1, memo) + trib (n - 2, memo) + trib(n - 3, memo)
    return memo[n]
    

class Solution(object):
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        if (n == 0):
            return 0
        if (n == 1):
            return 1
        if (n == 2):
            return 1
        memo = [None] * (n + 1)
        memo[0] = 0
        memo[1] = 1
        memo[2] = 1
        
        return trib(n, memo)
        