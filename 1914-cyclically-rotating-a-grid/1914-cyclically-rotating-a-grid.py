class Solution:
    def rotateGrid(self, grid: list[list[int]], k: int) -> list[list[int]]:
        m, n = len(grid), len(grid[0])
        num_layers = min(m, n) // 2
        
        for layer in range(num_layers):
            # 1. Extract the layer
            l = []
            # Top row
            for j in range(layer, n - layer): l.append(grid[layer][j])
            # Right col
            for i in range(layer + 1, m - layer): l.append(grid[i][n - layer - 1])
            # Bottom row
            for j in range(n - layer - 2, layer - 1, -1): l.append(grid[m - layer - 1][j])
            # Left col
            for i in range(m - layer - 2, layer, -1): l.append(grid[i][layer])
            
            # 2. Rotate the extracted layer 1D array
            # Effectively, move elements to the left by k % length
            k_rot = k % len(l)
            l = l[k_rot:] + l[:k_rot]
            
            # 3. Put back the rotated layer
            idx = 0
            # Top row
            for j in range(layer, n - layer): grid[layer][j] = l[idx]; idx += 1
            # Right col
            for i in range(layer + 1, m - layer): grid[i][n - layer - 1] = l[idx]; idx += 1
            # Bottom row
            for j in range(n - layer - 2, layer - 1, -1): grid[m - layer - 1][j] = l[idx]; idx += 1
            # Left col
            for i in range(m - layer - 2, layer, -1): grid[i][layer] = l[idx]; idx += 1
            
        return grid
