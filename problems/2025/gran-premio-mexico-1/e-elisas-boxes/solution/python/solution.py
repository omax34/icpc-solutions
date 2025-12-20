
linea_1 = input().split()

N = int(linea_1[0])
M = int(linea_1[1])

no_exist = True

linea_2 = input().split()

for i in range(N):
    a = int(linea_2[i])
    if(a>=M):
        print(i+1)
        no_exist = False
        break

if(no_exist):
    print("-1")