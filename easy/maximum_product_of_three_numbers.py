def quicksort(nums, start = 0, end = None):
    """print ('in quicksort', nums, start, end)"""
    if end is None:
        nums = list(nums)
        end = len(nums) - 1
    if (start < end):
        pivot = partition(nums, start, end)
        quicksort(nums, start, pivot - 1)
        quicksort(nums, pivot + 1, end)
    return nums

def partition(nums, start, end):
    """print('in partition', nums, start, end)"""
    pivitval = nums[end]
    l,r = 0, end - start
    while (r > l):
        if(nums[l] <= pivitval):
            l += 1
        elif(nums[r] > pivitval):
            r -= 1
        else:
            """print("swapping", nums[l], nums[r])"""
            nums[l], nums[r] = nums[r], nums[l]
            pivitval = nums[r]
    if (nums[l] > pivitval):
        nums[l], nums[end] = nums[end], nums[l]
        return l
    else:
        return end

def findProduct(nums):
    negMax = nums[0] * nums[1] * nums[len(nums) - 1]
    posMax = nums[len(nums) - 1] * nums[len(nums) - 2] * nums[len(nums) - 3]
    """ print nums"""
    """print (nums[0], nums[1], nums[len(nums) - 1])"""
    """print (negMax,posMax)"""
    if (negMax > posMax):
        return negMax
    else:
        return posMax
    
class Solution(object):
    
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        return max(nums[-1]*nums[-2]*nums[-3],nums[0]*nums[1]*nums[-1])
        sortedList = quicksort(nums)
        return findProduct(sortedList)