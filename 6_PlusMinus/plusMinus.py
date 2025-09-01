def plusMinus(ints):
    positive, negative, neutral, n = 0, 0, 0, len(ints)

    for e in ints:
        if e > 0:
            positive += 1

        if e < 0:
            negative += 1

        if e == 0:
            neutral += 1

    positive = float(positive/n)
    negative = float(negative/n)
    neutral = float(neutral/n)

    # strPositive = "%.6f" % positive
    # strNegative = "%.6f" % negative
    # strNeutral = "%.6f" % neutral

    strPositive = "{:.6f}".format(positive)
    strNegative = "{:.6f}".format(negative)
    strNeutral = "{:.6f}".format(neutral)

    print(strPositive)
    print(strNegative)
    print(strNeutral)

if __name__ == '__main__':
    n = int(input("Insert the number of elements: "))
    ints = list(map(int, input("Insert the array: ").rstrip().split()))

    plusMinus(ints)
