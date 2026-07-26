class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)
        for s in strs:
            string = "".join(sorted(s))
            map[string].append(s)
        return list(map.values())
        