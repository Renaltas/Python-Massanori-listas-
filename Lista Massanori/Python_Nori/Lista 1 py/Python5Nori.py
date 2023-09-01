print ('qual o preço e o desconto? ')
preço = int(input())
desconto = int(input())

desconto = preço*(desconto/100)
preço = preço - desconto
print('o preco é: ', preço)
print('o desconto é: ', desconto)