n = int(input("Digite um número inteiro: "))
fibonacci = [1, 1]

while len(fibonacci) < n:
    next_value = fibonacci[-1] + fibonacci[-2]
    fibonacci.append(next_value)

print(f"O número de Fibonacci de {n} é {fibonacci[-1]}.")
'''não faço ideia de como esse codigo funciona, pergunte ao GPT'''