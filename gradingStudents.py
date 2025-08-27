def gradingStudents(grades: [int]) -> [int]:
    result = []

    for e in grades:
        if e%5 >= 3 and e >= 38:
            diff = 5 - (e%5)
            result.append(e+diff)
        else:
            result.append(e)

    return result

if __name__ == '__main__':
    gradesCount = int(input("Insert the number of grades: "))

    grades = []
    for _ in range(gradesCount):
        grade = int(input().strip())
        grades.append(grade)

    result = gradingStudents(grades)

    print('\n'.join(map(str, result)))
