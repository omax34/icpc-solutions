# Análisis

## Observación Clave
Para que P sea "sana", debe estar formada por repeticiones exactas de S. Esto implica dos condiciones:
1. La longitud de P debe ser divisible por la de S (P % S == 0).
2. El carácter en la posición i de P debe coincidir con el carácter correspondiente en el patrón S.
   - La posición correspondiente se calcula como: S[i % S].

## Complejidad

- **Tiempo:** $O(P)$ por caso de prueba.
  - Recorremos la cadena P una sola vez.
  - Ya que la suma de longitudes es 10^5, entra dentro del rango establecido el cul fue de 1 segundo.
- **Espacio:** $O(1)$.
  - No se crearon cadenas nuevas, solo usamos variables para índices y banderas.