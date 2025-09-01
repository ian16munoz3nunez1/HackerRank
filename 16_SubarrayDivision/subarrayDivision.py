def subarrayDivision(s: [int], d: int, m: int) -> int:
    n = len(s)
    result=0

    for i in range(0, (n-m)+1):
        sum=0
        for j in range(i, i+m):
            sum += s[j]

        if sum == d:
            result += 1

    return result

if __name__ == '__main__':
    n = int(input("Insert n: ").strip())

    squares = list(map(int, input("Insert the squares: ").rstrip().split()))

    dm = input("Insert d and m: ").rstrip().split()
    d = int(dm[0])
    m = int(dm[1])

    result = subarrayDivision(squares, d, m)
    print(result)

