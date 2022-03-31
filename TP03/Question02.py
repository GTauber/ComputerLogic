
def statusEleitor(age):
    if 18 <= age < 70:
        return 'Eleitor Obrigatório'

    elif age < 16:
        return 'Sem direito a voto'

    elif 16 <= age < 18 or age >= 70:
        return 'Eleitor Facultativo'

age = input('Type your actual Age: ')

if age.isnumeric():
    print(statusEleitor(int(age)))
else:
    print('Enter a valid value')