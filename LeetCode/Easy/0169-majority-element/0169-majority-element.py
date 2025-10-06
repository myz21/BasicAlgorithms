class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        self.mergeSort(nums, 0, len(nums) - 1)

        if len(nums) == 1:
            return nums[0]

        return nums[int(len(nums)/2)]

    
    def mergeSort (self, array : List[int], left: int, right : int):
        if(left<right):
            mid = (left+right) // 2
            self.mergeSort(array, left, mid)
            self.mergeSort(array, mid+1, right)
            self.merge(array,left,mid,right)

    def merge(self, array: List[int], p: int, q: int, r : int):
        n1 = q - p + 1
        n2 = r - q
        L = [array[p+i] for i in range(n1)]
        M = [array[q+1+j] for j in range(n2)]

        a = 0
        b = 0
        k = p
        while a < n1 and b < n2:
            if(L[a] <= M[b]):
                array[k] = L[a]
                a+=1
            else:
                array[k] = M[b]
                b+=1
            k+=1
        #pick up remaining elements
        while a < n1:
            array[k] = L[a]
            a+=1
            k+=1
        while b < n2:
            array[k] = M[b]
            b+=1
            k+=1