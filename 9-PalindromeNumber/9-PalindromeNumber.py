# Last updated: 8/20/2026, 4:17:10 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x>=0:
            y=str(x)
            if y[::1]== y[::-1]:
                return True
        else:
            return False