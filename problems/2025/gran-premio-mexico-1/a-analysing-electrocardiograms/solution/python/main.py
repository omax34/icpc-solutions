
S = input()
N = int(input())

for i in range(N):
    
    P = input()
    
    len_s = len(S)
    len_p = len(P)
    
    if len_p % len_s != 0:
        print("No")
        continue 

    if S * (len_p // len_s) == P:
        print("Yes")
    else:
        print("No")