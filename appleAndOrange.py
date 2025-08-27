def countApplesAndOranges(s: int, t: int, a: int, b: int, apples: [int], oranges: [int]):
    apple = 0
    for i in apples:
        if a+i >= s and a+i <= t:
            apple += 1

    orange = 0
    for i in oranges:
        if b+i >= s and b+i <= t:
            orange += 1

    print(apple)
    print(orange)

if __name__ == '__main__':
    st = input("Insert s and t: ").rstrip().split()
    s = int(st[0])
    t = int(st[1])

    ab = input("Insert a and b: ").rstrip().split()
    a = int(ab[0])
    b = int(ab[1])

    mn = input("Insert m and n: ").rstrip().split()
    m = int(mn[0])
    n = int(mn[1])

    apples = list(map(int, input("Insert the apples: ").rstrip().split()))
    oranges = list(map(int, input("Insert the oranges: ").rstrip().split()))

    countApplesAndOranges(s, t, a, b, apples, oranges)

