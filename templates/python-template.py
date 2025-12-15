import sys

# Aumentar recursión si es necesario (DFS profundo, etc.)
sys.setrecursionlimit(2000)

def solve():
    # Lectura rápida de todo el input
    input_data = sys.stdin.read().split()
    
    if not input_data:
        return

    # Iterador para consumir los datos uno a uno
    iterator = iter(input_data)

    try:
        # Ejemplo de uso:
        # n = int(next(iterator))
        # s = next(iterator)
        pass 
    except StopIteration:
        pass

if __name__ == "__main__":
    solve()