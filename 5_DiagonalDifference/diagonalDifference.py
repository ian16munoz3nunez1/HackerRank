def diagonalDifference(matrix):
    sum1, sum2, n = 0, 0, len(matrix)

    for i in range(n):
        for j in range(n):
            if j == i:
                sum1 += matrix[i][j]

            if j == (n-1)-i:
                sum2 += matrix[i][j]

    return abs(sum1 - sum2)

if __name__ == '__main__':
    n = int(input("Insert the matrix size: "))

    print("Insert the matrix: ")
    matrix = []
    for _ in range(n):
        matrix.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(matrix)
    print(result)

