ano = int(input('digite um ano para saber se ele é bissexto: '))

if ano %400 == 0:
    print('ano é bissexto')
elif ano %100 != 0 and ano %4== 0:
    print('ano é bisesexto')
else :
    print('ano não é bissexto ')
    