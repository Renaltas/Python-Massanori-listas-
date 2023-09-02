print('quanto você ganha por hora e quantas horas você trabalha: ')
salH = int(input())
horT = int(input())
salB = horT * salH

Sindicato = salB * (5/100)
ir = salB *(11/100)
inss = salB * (8/100)
salL = salB - ir - inss - Sindicato
print(f'o seu salario liquido é: {salL}')
