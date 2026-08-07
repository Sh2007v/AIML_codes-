# import numpy as np;

# arr=np.array([1,2,3,4,5])
# arr=np.array((1,2,3,4,5))
# print(arr[0])

# arr[row,col]
# arr[layer,row,col]

# arr[start:end:step]   1d-slice
#arr[start_row:end_row,start_column:end_column] 2d slice

#x=arr.copy()
#x=arr.view()
#x.base

#for x in arr:
#    print(x)

#for x in arr:
#   for y in x:
#       print(x)

#for x in arr:
#   for y in x :
#       for z in y :
#           print(z)

#res_arr = np.concatenate(arr1,arr2)

import numpy as np

#1
arr = np.array([[1,2,3,11,22,33,44]
                [4,5,6,7,8,9,10]])
print(arr[1,1:4])

#2
print(arr[0:2,2])

#3
print(arr[0:2,1:3])

#4 Select a row
print(arr[0,:])

#5 Select a col
print(arr[:3])


