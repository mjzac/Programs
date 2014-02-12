import sys
result= ""
while 1:
    try:
        line = sys.stdin.readline()
    except KeyboardInterrupt:
        break

    if not line:
        break
    else:
        temp = line.split("//")
        temp[0]=temp[0].replace("->",".")
        result = result+"//".join(temp)
print result
