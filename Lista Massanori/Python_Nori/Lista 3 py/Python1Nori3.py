n1 = int(input('insira um numero de um a 10: '))
x = 0 

while n1 < 0 or n1 > 10: 
    print('valor invalido: ')
    n1 = float(input('insria uma nota valida: '))
    
print(f"você digitou{n1}")