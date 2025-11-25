"""
Completed: 2021-12-22
Difficulty: Easy
70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/description/
"""

def get_steps(n,memo):
    if (memo[n] is not None):
        return memo[n]
    memo[n] = get_steps(n + 1, memo) + get_steps(n + 2, memo)
    return memo[n]

class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if (n == 1):
            return 1
        if (n == 2):
            return 2
        memo = [None] * (n + 1)
        memo[n] = 1
        memo[n - 1] = 1
        return get_steps(0, memo)