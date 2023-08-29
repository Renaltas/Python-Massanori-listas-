print('insira o salario e a porcentagem do aumento')
sal = float(input())
porcaum = float (input())

porcaum = sal*(porcaum/100)
novosal = sal + porcaum
print("o valor do salario é: " ,novosal)
print("o valor do aumento é:  " , porcaum)
