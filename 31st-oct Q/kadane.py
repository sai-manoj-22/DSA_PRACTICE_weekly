def kadane(list1):
    curr_sum=0
    max_sum=-(float('inf'))
    for i in range(len(list1)):
        curr_sum+=list1[i]
        if curr_sum<0:
            curr_sum=0
        if curr_sum > max_sum:
            max_sum=curr_sum
    return max_sum

max_sum=kadane(list(map(int, input().split())))
print(max_sum)