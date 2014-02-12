# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(raw_input())
from array import *
my_array = array('i',[])
for i in range(n):
    c = raw_input()
    a,b = c.split()
    a = int(a)
    b= int(b)
    res = pow(a,b)%(pow(10,9)+7)
    my_array.append(res)
    
for i in my_array:
    print i
