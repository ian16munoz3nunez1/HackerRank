def staircase(n: int):
    for i in range(1, n+1):
        for j in range(n-i):
            print(" ", end='')

        for j in range(i):
            print("#", end='')

        print()

if __name__ == '__main__':
    n = int(input("Insert the dimension: "))

    staircase(n)
