students = []
winner = [["", 0]]
betterGrade = 0

for x in range(5):
    name = input("Type the first guy name: ")
    grade = float(input("Type his grade: "))
    if 0 <= grade <= 10:
        people = [name, grade]
        students.append(people)
    else:
        print(f"Invalid grade, it must be between 0 and 10\n {x}")
        break
for people in students:
    if people[1] > betterGrade:
        betterGrade = people[1]
        winner.clear()
        winner.append(people)

    elif people[1] == betterGrade:
        winner.append(people)
    

if len(winner) > 1:
    msg = "We had a draw! Winners: "
    for x in range(len(winner)):
        finalMsg = "".join(f"{x}º {winner[x][0]} grade: {(winner[x][1])}")

    print(msg, finalMsg)

else:
    print(f"Winner: {winner[0][0]} grade: {winner[0][1]}")
