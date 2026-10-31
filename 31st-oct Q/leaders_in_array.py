def leaders(list1):
    curr_max=list1[len(list1)-1]
    result=[]
    result.append(curr_max)
    for i in range(len(list1)-2,-1,-1):
        if (list1[i]>curr_max):
            curr_max = list1[i]
                
            result.append(curr_max)
            
    return result[::-1]

result=leaders(list(map(int, input().split())))
print(result)
