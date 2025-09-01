def migratoryBirds(arr):
    result = [0, 0, 0, 0, 0]

    i = 0
    while i < len(arr):
        if arr[i] == 1:
            result[0] += 1
        if arr[i] == 2:
            result[1] += 1
        if arr[i] == 3:
            result[2] += 1
        if arr[i] == 4:
            result[3] += 1
        if arr[i] == 5:
            result[4] += 1

        i += 1

    i = 0
    while i < len(result):
        if result[i] == max(result):
            break

        i += 1

    return i+1

if __name__ == '__main__':
    # n = int(input("Insert the number of elements: "))
    # ints = list(map(int, input("Insert the elements: ").rstrip().split()))

    # n = 6
    # ints = [1, 4, 4, 4, 5, 3]
    # n = 1
    # ints = [1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4]

    result = migratoryBirds(ints)

    print(result)

