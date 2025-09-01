def numberLineJumps(x1: int, v1: int, x2: int, v2: int) -> str:
    return "YES" if v1>v2 and (x2-x1)%(v1-v2)==0 else "NO"

if __name__ == '__main__':
    kangaroos = input("Insert the data: ").rstrip().split()

    x1 = int(kangaroos[0])
    v1 = int(kangaroos[1])

    x2 = int(kangaroos[2])
    v2 = int(kangaroos[3])

    result = numberLineJumps(x1, v1, x2, v2)

    print(result)
