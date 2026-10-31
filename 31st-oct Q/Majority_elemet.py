def majority(list1):
    list1.sort()
    return list1[len(list1)//2]

result=majority(list(map(int,input().split())))
print(result)