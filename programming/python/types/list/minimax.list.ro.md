```python
# minimax

# temperaturile pentru zilele unei saptamani
temps = [ 10, 9, 8, 0, -5, 0, 11 ]

# afisati temp maxima
# afisati temp minima

# print( min(temps) )
# print( max(temps) )

# presupunem ca minima este in prima zi
t_min = temps[0]
for t in temps: # for i in range()...
  if t < t_min:
    t_min = t 

t_max = temps[0]
for t in temps:
  if t > t_max:
    t_max = t 

print( t_min )
print( t_max )
```
