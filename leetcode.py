class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        
        # if x < 0 or (x % 10 == 0 and x != 0):
        #     return False
        # revertedNumber = 0
        # while x > revertedNumber:
        #     print(revertedNumber)
        #     revertedNumber = revertedNumber * 10 + x % 10
        #     x //= 10
        #     print(f"this is x: {x}")
        #     print(f"This is reverted: {revertedNumber}")
        # return x == revertedNumber or x == revertedNumber // 10
        number = str(x)

        first = number.
        end = len(x)-1
        while first <= end:
            if first != end:
                return False
            if first == end:
                first += 1
                end -= 1
                
            return True
    print(isPalindrome(1, 123321))