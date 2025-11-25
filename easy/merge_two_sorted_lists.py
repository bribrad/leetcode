"""
Completed: 2021-12-20
Difficulty: Easy
21. Merge Two Sorted Lists
https://leetcode.com/problems/merge-two-sorted-lists/description/
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if (list1 is None):
            return list2
        if (list2 is None):
            return list1
        if (list1.val <= list2.val):
            head,tail = list1,list1
            if (list1.next is not None):
                list1 = list1.next
                head.next = tail
            else:
                head.next = list2
                return head
        else:
            head,tail = list2,list2
            if (list2.next is not None):
                list2 = list2.next
                head.next = tail
            else:
                head.next = list1
                return head
                
        while (list2 is not None and list1 is not None):
            if (list1.val <= list2.val):
                tail.next = list1
                tail = tail.next
                list1 = list1.next
                """print("list1",list1)"""
            else:
                tail.next = list2
                tail = tail.next
                list2 = list2.next
                """print("list2", list2)"""
        if (list1 is None):
            print(list2.val)
            tail.next = list2
            return head
        elif(list2 is None):
            tail.next = list1
            return head
        else:
            return head