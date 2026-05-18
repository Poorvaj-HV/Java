from collections import defaultdict, deque

class Solution:
    def minJumps(self, arr: list[int]) -> int:
        n = len(arr)
        if n == 1: return 0
        
        # Build map for same-value jumps
        graph = defaultdict(list)
        for i, val in enumerate(arr):
            graph[val].append(i)
            
        q, visited, steps = deque([0]), {0}, 0
        
        while q:
            for _ in range(len(q)):
                curr = q.popleft()
                if curr == n - 1: return steps
                
                # Check neighbors: i-1, i+1, and same value
                for next_idx in [curr - 1, curr + 1] + graph[arr[curr]]:
                    if 0 <= next_idx < n and next_idx not in visited:
                        visited.add(next_idx)
                        q.append(next_idx)
                
                # Optimization: Clear to prevent re-processing
                graph[arr[curr]] = []
            steps += 1
        return -1