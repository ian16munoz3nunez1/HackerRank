def aVeryBigSum(ar):
    result=0
    for e in ar:
        result += e

    return result

if __name__ == '__main__':
    n = int(input("Insert the number of elements: "))

    ar = list(map(int, input("Insert the array: ").rstrip().split()))

    result = aVeryBigSum(ar)

    print(result)

