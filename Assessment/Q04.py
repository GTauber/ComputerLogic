def printValuePerPeriod(startValue, revenue, monthlyValue, periodQty):
    value = startValue
    for x in range(periodQty):
        value += (value * revenue / 100) + monthlyValue
        print(f"Após {x} períodos(s), o montante será de {'%.2f' % value}")


startValue = float((input("Valor inicial: R$ ")).replace(",", "."))
revenue = float((input("Rendimento por período (%): ")).replace(",", "."))
monthlyValue = float((input("Aporte a cada período: R$ ")).replace(",", "."))
periodQty = int(input("Total de períodos: "))

printValuePerPeriod(startValue, revenue, monthlyValue, periodQty)
