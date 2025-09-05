def divisibleSumPairs(n: int, k: int, divisible: [int]) -> int:
    result = 0

    for i in range(n):
        for j in range(i+1, n):
            if (divisible[i]+divisible[j])%k == 0:
                result += 1

    return result

if __name__ == '__main__':
    nk = input("Insert n and k: ").rstrip().split()
    n = int(nk[0])
    k = int(nk[1])

    divisible = list(map(int, input("Insert the array: ").rstrip().split()))

