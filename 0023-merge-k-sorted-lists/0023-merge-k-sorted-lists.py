# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        lst = []
        for i in lists:
            temp = i
            while temp!=None:
                lst.append(temp.val)
                temp = temp.next
        head = ListNode(0)
        current = head
        for i in sorted(lst):
            current.next = ListNode(i)
            current = current.next
        return head.next