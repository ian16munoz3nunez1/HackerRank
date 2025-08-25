import math

def simpleArraySum(ar: int) -> int:
    sum=0
    for e in ar:
        sum += e

    return sum

if __name__ == '__main__':
    n = int(input("Insert the number of elements: "))

    ar = list(map(int, input("Insert the array: ").rstrip().split()))

    result = simpleArraySum(ar)
    print(result)

