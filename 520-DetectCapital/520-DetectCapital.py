# Last updated: 8/12/2026, 11:14:20 AM
class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        l = len(word)
        if(len(word)==1):
            return True
        if(word[0].isupper() and word[1].isupper()):
            for i in range(2,l):
                if not word[i].isupper():
                    return False
        else:
            for i in range(1,l):
                if word[i].isupper():
                    return False
        return True