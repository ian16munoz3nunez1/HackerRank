def miniMaxSum(ints):
    minimum = min(ints)
    maximum = max(ints)

    sumatory = 0
    for e in ints:
        sumatory += e

    minSum = sumatory-maximum
    maxSum = sumatory-minimum

    print(f"{minSum} {maxSum}")

if __name__ == '__main__':
    ints = list(map(int, input("Insert the array: ").rstrip().split()))
    miniMaxSum(ints)
