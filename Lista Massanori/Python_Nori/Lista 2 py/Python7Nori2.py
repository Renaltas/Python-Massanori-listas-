
import math
cobertura_por_litro = 3  
preco_por_lata = 80.00 

area_a_pintar = float(input("Informe o tamanho da área a ser pintada em metros quadrados: "))

litros_necessarios = area_a_pintar / cobertura_por_litro

latas_necessarias = math.ceil(litros_necessarios / 18) 

preco_total = latas_necessarias * preco_por_lata

print(f"Quantidade de latas de tinta necessárias: {latas_necessarias}")
print(f"Preço total: R${preco_total:.2f}")



    

