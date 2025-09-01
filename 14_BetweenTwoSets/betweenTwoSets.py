def getTotalX(a: [int], b: [int]) -> int:
    count=0
    start, end = max(a), min(b)
    n = len(a) if len(a) > len(b) else len(b)

    for i in range(start, end+1):
        for j in range(0, n):
            if j < len(a) and i%a[j]!=0:
                break

            if j < len(b) and b[j]%i!=0:
                break

            if j == n-1:
                count += 1

    return count

if __name__ == '__main__':
    nm = input("Insert the n and m dimensions: ").rstrip().split()
    n = int(nm[0])
    m = int(nm[1])

    a = list(map(int, input("Insert the a array: ").rstrip().split()))

    b = list(map(int, input("Insert the b array: ").rstrip().split()))

    result = getTotalX(a, b)
    print(result)

