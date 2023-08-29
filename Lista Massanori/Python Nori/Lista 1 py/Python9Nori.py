print('a quantidade de dias e km: ')
dia = float(input())
km = float(input())
Pdia = 60
Pkm = 0.15
Pdia*=dia
Pkm*=km
precoT = Pdia + Pkm
print('o preco total é: ',precoT)