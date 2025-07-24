# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if(head == None):
            return head
        elif(head.next == None):
            return None
        count = 1
        temp = head
        while(temp.next != None):
            count+=1
            temp = temp.next
        temp = head
        temp1 = None
        for i in range(count-n):
            if(temp.next == None):
                break
            temp1 = temp
            temp = temp.next
        if(temp.next == None):
            temp1.next = None
        elif(temp1 == None):
            head = head.next
        else:
            temp1.next = temp.next
        return head