print('insira tres numeros: ')
n1 = int(input())
n2 = int(input())
n3 = int(input())

if n1 > n2 and n1 > n3 :
    print(f'o maior numero é: {n1}')
elif n2 >  n1 and n2> n3 :
    print(f'o maior numero é: {n2}')
elif n3 > n2 and n3 >  n1:
    print(f'o maior numero é: {n3}')
else :
    print('ai ninguem é maior quer ninguem...')
    
    
if n1 < n2 and n1 < n3 :
    print(f'o menor é: {n1}')
elif n2 <  n1 and n2 < n3 :
    print(f'o menor é {n2}')
elif n3 < n2 and n3 <  n1:
    print(f'o menor é: {n3}')