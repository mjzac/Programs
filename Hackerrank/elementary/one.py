rows = int(raw_input())
prices = raw_input()
priceList = prices.split()
priceList.sort()
no = int(raw_input())
cost =0
for i in range (0,no):
	cost = cost + long(priceList[i])
print cost 