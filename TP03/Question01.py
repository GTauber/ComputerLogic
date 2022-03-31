try:
    qtyPeople = 0
    servicePercentage = 0
    billValue = 0
    individualValue = 0


    def forEachValueCalc(valueBill, serviceValue, qty):
        total = valueBill + ((serviceValue / 100) * valueBill)
        forEachOne = total / qty
        return forEachOne


    qtyPeople = int(input("Hello,\nWhat is the number os people who will share the bill?"))

    if qtyPeople <= 0 and qtyPeople != int:
        print("invalid number of people")

    else:
        billValue = float(input("Ok, how much was the value of the bill: ").replace(",", "."))
        servicePercentage = float(input("What is the service percentage? ").replace(",", "."))
        if 0 < servicePercentage < 100:
            print(str(forEachValueCalc(billValue, servicePercentage, qtyPeople)).replace(".", ","))
        else:
            print("invalid service percentage")


except ValueError as error:
    print("Invalid Input")
