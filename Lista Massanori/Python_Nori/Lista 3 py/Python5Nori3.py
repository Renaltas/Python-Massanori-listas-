numero1 = int(input("Digite o primeiro número inteiro positivo: "))
numero2 = int(input("Digite o segundo número inteiro positivo: "))

while numero2 != 0:
    temp = numero2
    numero2 = numero1 % numero2
    numero1 = temp

mdc = numero1

print(f"O MDC de {numero1} e {numero2} é {mdc}.")
'''não faço ideia de como esse codigo funciona, pergunte ao GPT'''

