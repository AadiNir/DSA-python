# a = int(input("enter any number"))
# print(a*19)

# tuple 
# tup1 = (1,2,3,4)
# print(tup1[1])
# print(tup1[-2])
# print(tup1[:3])

# List

# a = int(input("enter the number of ele in array"))
# ls = []
# for i in range(a):
#     ls.append(int(input("enter the val")))

# print(ls)

# ls = [1,2,3,5,4,6,7,8,9]
# a = int(input("enter the value to be searched"))
# start = 0
# end = len(ls)
# while(start<end):
#     mid = int(start + (end-start)/2)
#     if(a==ls[mid]):
#         print("yes")
#         break
#     elif(ls[mid]>a):
#         end = mid-1
#     else:
#         start = mid+1

# ls.sort()
# print(ls)

from queue import LifoQueue
stack = LifoQueue()
stack.put(2)
print(stack.qsize())
