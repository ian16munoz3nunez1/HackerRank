def compareTriplets(a, b):
    result = [0, 0]

    for i in range(0, 3):
        if a[i] > b[i]:
            result[0] += 1
        elif a[i] < b[i]:
            result[1] += 1
        else:
            continue

    return result

if __name__ == '__main__':
    a = list(map(int, input("Insert Alice points: ").rstrip().split()))
    b = list(map(int, input("Insert Alice points: ").rstrip().split()))

    result = compareTriplets(a, b)

    print(' '.join(map(str, result)))

