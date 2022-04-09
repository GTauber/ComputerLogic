def imprimirGasto(tipo, percentualMaximo, gasto, renda):
    percentual = calcularPercentual(gasto, renda)
    msg = obtermMensagem(renda, percentualMaximo, percentual)
    print(
        f"Seus gastos totais com {tipo} comprometem {percentual}% de sua renda total. O máximo recomendado é de {percentualMaximo}%. {msg}.")


def calcularPercentual(gasto, renda):
    return gasto * 100 / renda


def calcularValorMaximo(renda, percentualMaximo):
    return renda * percentualMaximo / 100


def obtermMensagem(renda, percentualMaximo, percentual):
    msg = "Seus gastos esão dentro da margem recomendada."
    if percentual > percentualMaximo:
        msg = f"Portanto, idealmente, o máximo de sua renda comprometida com moradia deveria ser de R$ {calcularValorMaximo(renda, percentualMaximo)}."

    return msg

def definirOutrosGastos(gastos):
    on = ""
    while on.lower() != "q":
        novoGasto = []
        novoGasto.append(input("Tipo do gasto: "))
        novoGasto.append(float(input(f"Porcentagem maxima permitida para {novoGasto[0]}: ")))
        novoGasto.append(float(input(f"Valor gasto mensalmente com {novoGasto[0]}: ")))
        gastos.append(novoGasto)
        on = input("Deseja inserir um novo tipo de gasto?\nDigite [Q] = Sair para diagnóstico.\nOu enter para "
                   "continuar inserindo.")
    return gastos


gastos = []
rendaMensal = float(input("Renda mensal total: R$ "))
gastos.append(["moradia", 30, float(input("Gastos totais com moradia: R$ "))])
gastos.append(["educacao", 20, float(input("Gastos totais com educação: R$ "))])
gastos.append(["transporte", 15, float(input("Gastos totais com transporte R$ "))])


outrosGastos = input("\nAlgum gasto a adicionar? [Y] = Sim,\nOu enter tecla para diagnóstico: ")

if outrosGastos.lower() == "y":
   definirOutrosGastos(gastos)

print("Diagnóstico")
for x in range(len(gastos)):
    tipo = gastos[x][0]
    maximoPermitido = gastos[x][1]
    valor = gastos[x][2]
    imprimirGasto(tipo, maximoPermitido, valor, rendaMensal)