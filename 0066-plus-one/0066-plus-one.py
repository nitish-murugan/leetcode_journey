class Solution(object):
    def plusOne(self, digits):
        num = ""
        for i in digits:
            num+=str(i)
        num = int(num)
        num = num + 1
        num = str(num)
        digits = []
        for i in num:
            digits.append(int(i))
        return digits
