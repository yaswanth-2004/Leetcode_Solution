class Solution(object):
    def canJump(self, nums):
        g=0
        for n in nums:
            if g<0:
                return False
            elif n>g:
                g=n
            g-=1

        return True
        
