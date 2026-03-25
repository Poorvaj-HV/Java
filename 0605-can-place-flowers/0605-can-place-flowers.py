class Solution:
    def canPlaceFlowers(self, a: List[int], n: int) -> bool:

        if len(a)==1 and a[0]==1 and n>0:
            return False
    
        if len(a)==1 and a[0]==0 and n==1:
            return True

        if len(a)==1 and a[0]==1 and n==0:
            return True

        if len(a)==1 and a[0]==0 and n==0:
            return True 
        if len(a)==1 and n>=0:
            return False
    
        for i in range(len(a)):
            if(i==0 and a[0]==0 and a[1]==0 and n>0):
                a[0]=1
                n=n-1

            elif(i==len(a)-1 and a[len(a)-1]==0 and a[len(a)-2]==0 and n>0):
                a[len(a)-1]=1
                n=n-1    
    
            elif(i+1<=len(a)-1 and i-1>=0 and a[i]==0 and a[i-1]==0 and a[i+1]==0 and n>0):
                a[i]=1
                n=n-1
    
        if n==0:
            return True
        else:
            return False
    