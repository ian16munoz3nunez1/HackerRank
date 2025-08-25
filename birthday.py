def birthday(s: int, d: int, m: int) -> int:
    n = len(s)
    cont = 0

    i = 0
    while i <= n-m:
        sum = 0
        j = i
        while j < i+m:
            sum += s[j]
            j += 1

        if(sum == d):
            cont += 1

        i += 1

    return cont

if __name__ == '__main__':
    n = int(input("Insert the number of elements: "))

    s = list(map(int, input("Insert the segments: ").rstrip().split()))

    dm = input("Insert day and month: ").rstrip().split()
    day = int(dm[0])
    month = int(dm[1])

    result = birthday(s, day, month)

    print(result)

