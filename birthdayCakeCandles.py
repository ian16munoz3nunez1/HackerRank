def birthdayCakeCandles(candles: [int]) -> int:
    maximum = max(candles)
    cont = 0

    for e in candles:
        if e == maximum:
            cont += 1

    return cont

if __name__ == '__main__':
    n = int(input("Insert the number of candles: "))
    candles = list(map(int, input("Insert the candles: ").rstrip().split()))

    result = birthdayCakeCandles(candles)
    print(result)
