"""
Completed: 2021-12-21
Difficulty: Easy
509. Fibonacci Number
https://leetcode.com/problems/fibonacci-number/description/
"""

def get_fib(n,memo):
    if (n == 1):
        memo[n] = 1
        return 1
    if (n == 2):
        memo[n] = 1
        return 1
    if (memo[n] is not None):
        return memo[n]
    memo[n] = get_fib(n - 1, memo) + get_fib(n - 2, memo)
    return memo[n]

class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if (n == 0):
            return 0
        memo = [None] * (n + 1)
        return get_fib(n, memo)