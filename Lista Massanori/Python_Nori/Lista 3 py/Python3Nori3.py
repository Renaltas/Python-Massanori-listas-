pais1 = 80000
pais2 = 200000

c1 = 0.03 
c2 = 0.015
anos = 0

while pais1 < pais2:
    pais1 = pais1 + pais1*c1
    pais2 = pais2 + pais2*c2
    anos = anos + 1
    
print(anos)
    
 