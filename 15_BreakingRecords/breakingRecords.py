def breakingRecords(scores: [int]) -> [int]:
    most, least = scores[0], scores[0]
    result = [0, 0]

    for e in scores:
        if e > most:
            most = e
            result[0] += 1

        if e < least:
            least = e
            result[1] += 1

    return result

if __name__ == '__main__':
    n = int(input("Insert the number of elements: ").strip())
    scores = list(map(int, input("Insert the elements: ").rstrip().split()))

    result = breakingRecords(scores)
    print(' '.join(map(str, result)))

